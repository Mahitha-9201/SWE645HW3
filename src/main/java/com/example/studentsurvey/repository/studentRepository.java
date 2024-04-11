//Author: Mahitha Dodda
//Repository interface
package com.example.studentsurvey.repository;

import com.example.studentsurvey.model.StudentSurvey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface studentRepository extends JpaRepository<StudentSurvey, Integer>{

}
