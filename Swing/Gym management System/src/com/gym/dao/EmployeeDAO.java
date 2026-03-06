package com.gym.dao;

import com.gym.model.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

    public boolean AddEmployee(Employee employee) {
        String sql = "INSERT INTO EMPLOYEE (FULL_NAME, PHONE, EMAIL, PERSONAL_ID,SALARY ,PSSWORD) VALUES (?, ?, ?, ?, ? ,?)";

        try (Connection conn = DBConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, employee.getFullName());
            stmt.setString(2, employee.getPhone());
            stmt.setString(3, employee.getEmail());
            stmt.setString(4, employee.getPersonalId());
            stmt.setDouble(5, employee.getSalary());
            stmt.setString(6, employee.getPassWord());

            int rowsInserted = stmt.executeUpdate();
            return rowsInserted > 0;

        } catch (SQLException e) {
            System.err.println("Error adding Employee: " + e.getMessage());
            e.printStackTrace();
            return false;
        }

    }

    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<>();
        String sql = "SELECT * FROM EMPLOYEE";

        try (Connection conn = DBConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Employee m = new Employee(
                        rs.getString("FULL_NAME"),
                        rs.getString("PHONE"),
                        rs.getString("EMAIL"),
                        rs.getString("PERSONAL_ID"),
                        rs.getDouble("SALARY"),
                        rs.getString("PSSWORD")
                );
                list.add(m);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean deleteEmployee(String pId) {
        String sql = "DELETE FROM EMPLOYEE WHERE PERSONAL_ID = ?";
        try (Connection conn = DBConnection.getConnection();
                java.sql.PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, pId);
            return stmt.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean checkLogin(String username, String password) {
        String sql = "SELECT * FROM EMPLOYEE WHERE FULL_NAME = ? AND PSSWORD = ?";
        boolean isValid = false;
        try (Connection conn = DBConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, username);
            stmt.setString(2, password);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                isValid = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return isValid;
    }

    public boolean editEmployee(String name, String phone, String email, String password, String salary, int id) {
        String sql = "UPDATE EMPLOYEE SET FULL_NAME=?, phone=?, email=?, pssword=?, salary=? WHERE personal_id=?";
        boolean isValid = false;
        try (Connection conn = DBConnection.getConnection();
                PreparedStatement pst = conn.prepareStatement(sql)) {

            pst.setString(1, name);
            pst.setString(2, phone);
            pst.setString(3, email);
            pst.setString(4, password);
            pst.setString(5, salary);
            pst.setInt(6, id);


            int rowsUpdated = pst.executeUpdate();
            isValid = true;


        } catch (Exception e) {
            e.printStackTrace();
        }
        return isValid ;
    }

}
