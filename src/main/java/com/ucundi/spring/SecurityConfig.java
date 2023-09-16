package com.ucundi.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.header.writers.XXssProtectionHeaderWriter;
import org.springframework.security.web.servlet.util.matcher.MvcRequestMatcher;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.web.servlet.handler.HandlerMappingIntrospector;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http, HandlerMappingIntrospector introspector) throws Exception {
        // @formatter:off
        http
                .headers(headers -> headers
                        .httpStrictTransportSecurity(hsts -> hsts
                                .includeSubDomains(true)
                                .preload(true)
                                .maxAgeInSeconds(31536000)
                        )
                        .contentTypeOptions(HeadersConfigurer.ContentTypeOptionsConfig::disable)
                        .frameOptions(HeadersConfigurer.FrameOptionsConfig::sameOrigin
                        )
                        .xssProtection(xss -> xss
                                .headerValue(XXssProtectionHeaderWriter.HeaderValue.ENABLED_MODE_BLOCK)
                        )
                        //.contentSecurityPolicy(csp -> csp
                        //        .policyDirectives("default-src 'self';")
                        //)
                )
                .authorizeHttpRequests((authorize) -> authorize
                        //Control access privileges
                        .requestMatchers(new MvcRequestMatcher(introspector, "/camas")).permitAll()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/comida")).permitAll()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/ropa")).permitAll()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/servicios")).permitAll()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/readCamas")).authenticated()
                        .requestMatchers(new AntPathRequestMatcher("/h2-console/**")).permitAll()
                        .anyRequest().permitAll()
                )
                .formLogin(withDefaults());
        return http.build();
    }

    // @formatter:off
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        PasswordEncoder passwordEncoder = passwordEncoder();

        UserDetails user = User.builder()
                .username("user")
                .password(passwordEncoder.encode("password"))
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(user);
      }  

}