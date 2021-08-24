package com.grv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grv.model.Institution;

@Repository
public interface InstitutionRepo extends JpaRepository<Institution, String>{

}
