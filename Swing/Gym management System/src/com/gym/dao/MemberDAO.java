package com.gym.dao;

import com.gym.model.Member;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {

    // دالة لإضافة عضو جديد
    public boolean addMember(Member member) {
        String sql = "INSERT INTO MEMBERS (FULL_NAME, PHONE, EMAIL, PERSONAL_ID, DISEASES, IMAGE_PATH, JOIN_DATE, MEMBERSHIP_TYPE) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, member.getFullName());
            stmt.setString(2, member.getPhone());
            stmt.setString(3, member.getEmail());
            stmt.setString(4, member.getPersonalId());
            stmt.setString(5, member.getDiseases());
            stmt.setString(6, member.getImagePath());

            // تحويل تاريخ الجافا إلى تاريخ اس كيو ال  
            Date sqlDate = new Date(member.getJoinDate().getTime());
            stmt.setDate(7, sqlDate);

            stmt.setString(8, member.getMembershipType());
            int rowsInserted = stmt.executeUpdate();
            //=========================
            if (rowsInserted > 0) {
                try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        int newId = generatedKeys.getInt(1);
                        // هذا السطر كافي جداً لتحديث الكائن في كل المشروع
                        member.setId(newId);
                    }
                }
            }
            //=========================

            return rowsInserted > 0; 

        } catch (SQLException e) {
            System.err.println("Error adding member: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    //==
    // دالة للبحث عن عضو باستخدام رقمه الوطني
    public Member getMemberByPersonalId(String pid) {
        Member member = null;
        String sql = "SELECT * FROM MEMBERS WHERE ID = ?";

        try (Connection conn = DBConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            int x = Integer.parseInt(pid);
            stmt.setInt(1, x);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                // إذا وجدنا الشخص، نأخذ بياناته من الداتابيس ونحطها في الاوبجكت
                member = new Member(
                        rs.getInt("ID"),
                        rs.getString("FULL_NAME"),
                        rs.getString("PHONE"),
                        rs.getString("EMAIL"),
                        rs.getString("PERSONAL_ID"),
                        rs.getString("DISEASES"),
                        rs.getString("IMAGE_PATH"),
                        rs.getDate("JOIN_DATE"),
                        rs.getString("MEMBERSHIP_TYPE"),
                        rs.getDate("EXPIRY_DATE")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return member;
    }

    // دالة تجيب كل الأعضاء عشان نعرضهم في الجدول
    public List<Member> getAllMembers() {
        List<Member> list = new ArrayList<>();
        String sql = "SELECT * FROM MEMBERS";

        try (Connection conn = DBConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Member m = new Member(
                        rs.getInt("ID"),
                        rs.getString("FULL_NAME"),
                        rs.getString("PHONE"),
                        rs.getString("EMAIL"),
                        rs.getString("PERSONAL_ID"),
                        rs.getString("DISEASES"),
                        rs.getString("IMAGE_PATH"),
                        rs.getDate("JOIN_DATE"),
                        rs.getString("MEMBERSHIP_TYPE"),
                        rs.getDate("EXPIRY_DATE")
                );
                list.add(m);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    // دالة لحذف عضو (سنحتاجها لزر الحذف)
    public boolean deleteMember(int id) {
        String sql = "DELETE FROM MEMBERS WHERE ID = ?";
        try (Connection conn = DBConnection.getConnection();
                java.sql.PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean editMember(String name, String phone, String email, String DISEASES, int id) {
        String sql = "UPDATE MEMBERS SET FULL_NAME=?, phone=?, email=?,  DISEASES=? WHERE ID=?";
        boolean isValid = false;
        try (Connection conn = DBConnection.getConnection();
                PreparedStatement pst = conn.prepareStatement(sql)) {

            pst.setString(1, name);
            pst.setString(2, phone);
            pst.setString(3, email);
            pst.setString(4, DISEASES);
            pst.setInt(5, id);

            int rowsUpdated = pst.executeUpdate();
            isValid = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return isValid;
    }

    public int Methodid(int id) {
        Member m = new Member();

        return m.getId();

    }
}
