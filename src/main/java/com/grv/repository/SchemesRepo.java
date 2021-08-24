package com.grv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grv.model.Schemes;


@Repository
public interface SchemesRepo extends JpaRepository<Schemes, Integer>{

}
