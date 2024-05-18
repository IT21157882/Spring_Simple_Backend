package com.example.UserManagment.Dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Date;

public class UserDTO {

    private int userid;
    private String username;
    private String email;
    private String password;
    private String bio;
    private Date dateofbirth;
    private String gender;
    private String country;
    private String hometown;
    private Integer height;
    private Integer weight;

    public UserDTO(int userid, String username, String email, String password, String bio, java.sql.Date dateofbirth, String gender, String country, String hometown, Integer height, Integer weight) {
        this.userid = userid;
        this.username = username;
        this.email = email;
        this.password = password;
        this.bio = bio;
        this.dateofbirth = dateofbirth;
        this.gender = gender;
        this.country = country;
        this.hometown = hometown;
        this.height = height;
        this.weight = weight;
    }

    public UserDTO() {
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", bio='" + bio + '\'' +
                ", dateofbirth=" + dateofbirth +
                ", gender='" + gender + '\'' +
                ", country='" + country + '\'' +
                ", hometown='" + hometown + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
