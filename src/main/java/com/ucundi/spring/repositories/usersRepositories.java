package com.ucundi.spring.repositories;

import com.ucundi.spring.domain.userEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * @author AndresMiranda
 */

public interface usersRepositories extends CrudRepository<userEntity, Long> {

    userEntity findByEmail(@Param(("email")) String email);

}
