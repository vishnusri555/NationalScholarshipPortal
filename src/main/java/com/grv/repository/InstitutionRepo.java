package com.grv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grv.model.Institution;

public interface InstitutionRepo extends JpaRepository<Institution, String>{

}
