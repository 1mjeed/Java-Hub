package com.gym.model;

public abstract class Person {

    private String fullName;
    private String phone;
    private String email;
    private String personalId; // رقم الهوية

    // Constructor
    public Person(String fullName, String phone, String email, String personalId) {
        this.fullName = fullName;
        this.phone = phone;
        this.email = email;
        this.personalId = personalId;
    }

    public Person() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPersonalId() {
        return personalId;
    }

    public void setPersonalId(String personalId) {
        this.personalId = personalId;
    }
}
