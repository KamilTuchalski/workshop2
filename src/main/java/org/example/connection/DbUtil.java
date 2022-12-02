package org.example.connection;

import org.mindrot.jbcrypt.BCrypt;

import java.sql.*;

public class DbUtil {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/workshop2?useSSL=false&characterEncoding=utf8&serverTimezone=UTC";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "";

    public static final String CREATE_USER_QUERY = "INSERT INTO users(username, email, password) VALUES (?, ?, ?)";
    public static final String SELECT_USER_QUERY = "SELECT * FROM users WHERE id=?";
    public static final String UPDATE_USER_QUERY = "UPDATE users SET email = ?, username = ?, password = ? WHERE id = ?";
    public static final String DELETE_USER_QUERY = "DELETE FROM users WHERE id = ?";
    public static final String SELECT_ALL_USER_QUERY = "SELECT * FROM users";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(
                DB_URL, DB_USER, DB_PASS);
    }

    public static String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

}
