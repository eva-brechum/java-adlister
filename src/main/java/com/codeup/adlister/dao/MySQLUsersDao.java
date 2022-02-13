package com.codeup.adlister.dao;

import com.codeup.adlister.dao.Users;
import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.MysqlDataSource;
import com.mysql.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLUsersDao implements Users {
    private Connection connection;


    public MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());

            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public User findByUsername(String username) {
        return null;
        //Walkthrough solution
//        String sql = "SELECT * FROM users WHERE username = ?";
//        User user = new User();
//        try {
//            PreparedStatement stmt = connection.prepareStatement(sql);
//            stmt.setString(1, username);
//            ResultSet rs = stmt.executeQuery();
//            rs.next();
//            user.setId(rs.getLong("id"));
//            user.setUsername(rs.getString("username"));
//            user.setEmail(rs.getString("email"));
//            user.setPassword(rs.getString("password"));
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return user;
    }

    @Override
    public Long insert(User user) {
        try {
            String sql = "INSERT INTO users(username, email, password) VALUES(?, ?, ?)";
            PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating user", e);
        }
    }
}
//
//    private String createInsertQuery(User user) {
//        return "INSERT INTO users(username, email, password) VALUES "
//                + "(" + user.getUsername() + ", " +
//                " " + user.getEmail() + " ' " +
//                user.getPassword() + ")";
//    }

