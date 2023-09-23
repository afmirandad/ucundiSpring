package com.ucundi.spring.repositories;

import com.ucundi.spring.domain.camasEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface camasRepositories extends CrudRepository<camasEntity, Long> {
    Optional<camasEntity> findById(Long id);

    void deleteById(Long id);
}
