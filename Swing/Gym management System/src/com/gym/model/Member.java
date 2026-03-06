package com.gym.model;

import java.util.Date;

public class Member extends Person {

    private int id; // من التابيس
    private String diseases;
    private String imagePath;
    private Date joinDate;
    private String membershipType;
    private Date expiryDate;
   //نستخدمه لما بدنا نستلم بيانات من المستخدم ونبعثها للداتابيس
    public Member(String fullName, String phone, String email, String personalId,
            String diseases, String imagePath, String membershipType) {
        super(fullName, phone, email, personalId);  
        this.diseases = diseases;
        this.imagePath = imagePath;
        this.membershipType = membershipType;
        this.joinDate = new Date(); // تاريخ اليوم 
        
    }

    //نستخدمه لما بدنا نرجع بيانات من الداتابيس ونعرضها للمستخدم
    public Member(int id, String fullName, String phone, String email, String personalId,
            String diseases, String imagePath, Date joinDate, String membershipType, Date expiryDate) {
        super(fullName, phone, email, personalId);
        this.id = id;
        this.diseases = diseases;
        this.imagePath = imagePath;
        this.joinDate = joinDate;
        this.membershipType = membershipType;
        this.expiryDate = expiryDate;
    }

    public Member() {

    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDiseases() {
        return diseases;
    }

    public void setDiseases(String diseases) {
        this.diseases = diseases;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
}
