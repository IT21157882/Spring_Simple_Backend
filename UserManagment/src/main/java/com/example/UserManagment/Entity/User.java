package com.example.UserManagment.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.sql.Date;

//import javax.persistence.*;
@Entity
@Table(name="User")
public class User {

    @Id
    @Column(name="user_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userid;
    @Column(name="user_name", length = 255)
    private String username;
    @Column(name="email", length = 255)
    private String email;
    @Column(name="password", length = 255)
    private String password;

    //new edit
    @Column(name="bio", length = 255)
    private String bio;

    @Column(name="dateofbirth", length = 255)
    private Date dateofbirth;

    @Column(name="gender", length = 255)
    private String gender;

    @Column(name="country", length = 255)
    private String country;

    @Column(name="hometown", length = 255)
    private String hometown;

    @Column(name="height", length = 255)
    private Integer height;

    @Column(name="weight", length = 255)
    private Integer weight;

    //close new edit
    public User() {
    }
    public User(int userid, String username, String email, String password, String bio, Date dateofbirth, String gender, String country, String hometown, Integer height, Integer weight) {
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

//create getters and setters


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

    public void setPassword(String password) {
        this.password = password;
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

    @Override
    public String toString() {
        return "User{" +
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
