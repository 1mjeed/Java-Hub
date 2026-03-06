package com.gym.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL = "jdbc:derby://localhost:1527/GymDB";
    private static final String USER = "mjeed";
    private static final String PASSWORD = "123mjeed123";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
