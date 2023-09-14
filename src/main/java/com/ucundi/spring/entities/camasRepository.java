package com.ucundi.spring.entities;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface camasRepository extends CrudRepository<camasEntity, Long> {
    List<camasEntity> findAllByTipoIs(String str);
}
