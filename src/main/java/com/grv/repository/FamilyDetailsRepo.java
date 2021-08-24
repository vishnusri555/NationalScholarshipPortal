package com.grv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grv.model.FamilyDetails;

public interface FamilyDetailsRepo extends JpaRepository<FamilyDetails, Integer> {

}
