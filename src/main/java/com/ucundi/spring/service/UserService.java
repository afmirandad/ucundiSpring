package com.ucundi.spring.service;

import org.springframework.http.ResponseEntity;

import java.util.Map;

/**
 * @author AndresMiranda
 */
public interface UserService {

    ResponseEntity<String> SignUp(Map<String,String> requestMap);

}
