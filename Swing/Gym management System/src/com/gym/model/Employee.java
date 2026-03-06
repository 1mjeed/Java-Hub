package com.gym.model;

public class Employee extends Person {

    private double salary;
    private String passWord;

    public Employee(String fullName, String phone, String email, String personalId, double salary, String passWord) {
        super(fullName, phone, email, personalId);
        this.salary = salary;
        this.passWord = passWord;
    }

    public Employee() {

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 290) {

            this.salary = salary;
        } else {
            salary = 290;
        }
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        if (passWord.length() <= 30) {

            this.passWord = passWord;
        }
    }

}
