//Author: Bhoomika Sushanti Baki
//This file contains the service method implementations, read and write to repository
package com.example.studentsurvey.service;

import com.example.studentsurvey.model.StudentSurvey;
import com.example.studentsurvey.repository.studentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SurveyServiceImp implements SurveyService {
    @Autowired
    private studentRepository studentRep;

    public SurveyServiceImp() {
    }

    public StudentSurvey saveSurvey(StudentSurvey student) {
        return (StudentSurvey)this.studentRep.save(student);
    }

    public List<StudentSurvey> getAllStudentSurvey() {
        return this.studentRep.findAll();
    }

    public void deleteSurvey(int id) {
        this.studentRep.deleteById(id);
    }

    public StudentSurvey updateSurvey(int id, StudentSurvey studentSurvey) {
        StudentSurvey existingSurvey = (StudentSurvey)this.studentRep.findById(id).orElseThrow(() -> {
            return new RuntimeException("Survey not found");
        });
        existingSurvey.setUserName(studentSurvey.getUserName());
        existingSurvey.setStreetAddress(studentSurvey.getStreetAddress());
        existingSurvey.setCity(studentSurvey.getCity());
        existingSurvey.setState(studentSurvey.getState());
        existingSurvey.setZipCode(studentSurvey.getZipCode());
        existingSurvey.setPhoneNumber(studentSurvey.getPhoneNumber());
        existingSurvey.setEmail(studentSurvey.getEmail());
        existingSurvey.setDateOfSurvey(studentSurvey.getDateOfSurvey());
        existingSurvey.setCampus(studentSurvey.isCampus());
        existingSurvey.setAtmosphere(studentSurvey.isAtmosphere());
        existingSurvey.setDormRooms(studentSurvey.isDormRooms());
        existingSurvey.setStudents(studentSurvey.isStudents());
        existingSurvey.setLocation(studentSurvey.isLocation());
        existingSurvey.setSports(studentSurvey.isSports());
        existingSurvey.setInterest(studentSurvey.getInterest());
        existingSurvey.setLikelihoodToRecommend(studentSurvey.getLikelihoodToRecommend());
        existingSurvey.setComments(studentSurvey.getComments());
        return (StudentSurvey)this.studentRep.save(existingSurvey);
    }

    public StudentSurvey getSurveyById(int id) {
        return (StudentSurvey)this.studentRep.findById(id).orElseThrow(() -> {
            return new RuntimeException("Survey not found with id: " + id);
        });
    }
}
