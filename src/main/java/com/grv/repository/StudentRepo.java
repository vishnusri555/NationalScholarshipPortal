package com.grv.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grv.model.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
	
	
}
