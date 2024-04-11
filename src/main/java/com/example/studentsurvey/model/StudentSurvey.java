//Author : Bhoomika Sushanti Baki
//Data model  is present in this file containing all the variables that will be stored in the table
package com.example.studentsurvey.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentSurvey {
    @Id
    @GeneratedValue(
        strategy = GenerationType.IDENTITY
    )
    private int id;
    private String userName;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNumber;
    private String email;
    private String dateOfSurvey;
    private boolean campus;
    private boolean atmosphere;
    private boolean dormRooms;
    private boolean students;
    private boolean location;
    private boolean sports;
    private String interest;
    private String likelihoodToRecommend;
    private String comments;
    private String graduationMonth;
    private String graduationYear;
    private String url;

    public StudentSurvey() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(final String userName) {
        this.userName = userName;
    }

    public String getStreetAddress() {
        return this.streetAddress;
    }

    public void setStreetAddress(final String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public void setZipCode(final String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getDateOfSurvey() {
        return this.dateOfSurvey;
    }

    public void setDateOfSurvey(final String dateOfSurvey) {
        this.dateOfSurvey = dateOfSurvey;
    }

    public boolean isCampus() {
        return this.campus;
    }

    public void setCampus(final boolean campus) {
        this.campus = campus;
    }

    public boolean isAtmosphere() {
        return this.atmosphere;
    }

    public void setAtmosphere(final boolean atmosphere) {
        this.atmosphere = atmosphere;
    }

    public boolean isDormRooms() {
        return this.dormRooms;
    }

    public void setDormRooms(final boolean dormRooms) {
        this.dormRooms = dormRooms;
    }

    public boolean isStudents() {
        return this.students;
    }

    public void setStudents(final boolean students) {
        this.students = students;
    }

    public boolean isLocation() {
        return this.location;
    }

    public void setLocation(final boolean location) {
        this.location = location;
    }

    public boolean isSports() {
        return this.sports;
    }

    public void setSports(final boolean sports) {
        this.sports = sports;
    }

    public String getInterest() {
        return this.interest;
    }

    public void setInterest(final String interest) {
        this.interest = interest;
    }

    public String getLikelihoodToRecommend() {
        return this.likelihoodToRecommend;
    }

    public void setLikelihoodToRecommend(final String likelihoodToRecommend) {
        this.likelihoodToRecommend = likelihoodToRecommend;
    }

    public String getComments() {
        return this.comments;
    }

    public void setComments(final String comments) {
        this.comments = comments;
    }

    public String getGraduationMonth() {
        return this.graduationMonth;
    }

    public void setGraduationMonth(final String graduationMonth) {
        this.graduationMonth = graduationMonth;
    }

    public String getGraduationYear() {
        return this.graduationYear;
    }

    public void setGraduationYear(final String graduationYear) {
        this.graduationYear = graduationYear;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }
}
