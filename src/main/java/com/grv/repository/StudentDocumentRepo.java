package com.grv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grv.model.StudentDocument;

public interface StudentDocumentRepo  extends JpaRepository<StudentDocument, Integer>{

}
