//Author: Mahitha Dodda
//Controller file includes URL mapping, redirecting the call to respective service
package com.example.studentsurvey.controller;

import com.example.studentsurvey.model.StudentSurvey;
import com.example.studentsurvey.service.SurveyService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping({"api/v1/survey"})
public class SurveyController {
    @Autowired
    private SurveyService surveyService;

    public SurveyController() {
    }

    @PostMapping({"/addsurvey"})
    public ResponseEntity<?> add(@RequestBody StudentSurvey studentSurvey) {
        try {
            this.surveyService.saveSurvey(studentSurvey);
            return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("message", "Survey Added Successfully"));
        } catch (Exception var3) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Map.of("error", "Error adding survey"));
        }
    }

    @GetMapping({"/getallsurveys"})
    public ResponseEntity<List<StudentSurvey>> getAllSurvey() {
        try {
            List<StudentSurvey> surveys = this.surveyService.getAllStudentSurvey();
            return ResponseEntity.ok(surveys);
        } catch (Exception var2) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @DeleteMapping({"/delete/{id}"})
    public ResponseEntity<?> deleteSurvey(@PathVariable int id) {
        try {
            this.surveyService.deleteSurvey(id);
            return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("message", "Survey Deleted Successfully"));
        } catch (Exception var3) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error deleting survey");
        }
    }

    @PutMapping({"/update/{id}"})
    public ResponseEntity<?> updateSurvey(@PathVariable int id, @RequestBody StudentSurvey studentSurvey) {
        try {
            StudentSurvey updatedSurvey = this.surveyService.updateSurvey(id, studentSurvey);
            return ResponseEntity.ok(updatedSurvey);
        } catch (Exception var4) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error updating survey");
        }
    }

    @GetMapping({"/{id}"})
    public ResponseEntity<StudentSurvey> getSurvey(@PathVariable int id) {
        try {
            StudentSurvey getSurveyById = this.surveyService.getSurveyById(id);
            return ResponseEntity.ok(getSurveyById);
        } catch (Exception var3) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
