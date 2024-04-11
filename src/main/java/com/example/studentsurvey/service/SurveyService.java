//Author: Mahitha Dodda
//Declare all the service methods that are needed to be implemented

package com.example.studentsurvey.service;


import com.example.studentsurvey.model.StudentSurvey;
import java.util.List;

public interface SurveyService {
    StudentSurvey saveSurvey(StudentSurvey student);

    List<StudentSurvey> getAllStudentSurvey();

    void deleteSurvey(int id);

    StudentSurvey updateSurvey(int id, StudentSurvey studentSurvey);

    StudentSurvey getSurveyById(int id);
}
