package com.example.govoo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class DataBaseHandler extends Configs {
    Connection dbConnection;

    public Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://" + dbHost + ":"
                + dbPort + "/" + dbName;
        Class.forName("com.mysql.jdbc.Driver");

        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);

        return dbConnection;
    }

    public void signUpUser(User user) {
        String insert = "INSERT INTO " + Const.USER_TABLE + "(" +
                Const.USER_FIRSTNAME + "," + Const.USER_PHONE + "," +
                Const.USER_USERNAME + "," + Const.USER_PASSWORD + "," +
                Const.USER_LOCATION + "," + Const.USER_GENDER + ")" +
                "VALUES(?,?,?,?,?,?)";

        try {
            try (PreparedStatement prSt = getDbConnection().prepareStatement(insert)) {
                prSt.setString(1, user.getFirstName());
                prSt.setString(2, user.getPhone());
                prSt.setString(3, user.getUserName());
                prSt.setString(4, user.getPassword());
                prSt.setString(5, user.getLocation());
                prSt.setString(6, user.getGender());

                prSt.executeUpdate();
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteUser(User user) {
        String delete = "DELETE FROM " + Const.USER_TABLE + " WHERE " +
                Const.USER_USERNAME + "=? AND " + Const.USER_PASSWORD + "=?";

        try {
            try (PreparedStatement prSt = getDbConnection().prepareStatement(delete)) {
                prSt.setString(1, user.getUserName());
                prSt.setString(2, user.getPassword());

                prSt.executeUpdate();
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    public void updateUser(User user) {
        String update = "UPDATE " + Const.USER_TABLE + " SET " +
                Const.USER_FIRSTNAME + "=?, " + Const.USER_PHONE + "=?, " +
                Const.USER_USERNAME + "=?, " + Const.USER_PASSWORD + "=?, " +
                Const.USER_LOCATION + "=?, " + Const.USER_GENDER + "=? " +
                "WHERE " + Const.USER_USERNAME + "=? AND " + Const.USER_PASSWORD + "=?";

        try {
            try (PreparedStatement prSt = getDbConnection().prepareStatement(update)) {
                prSt.setString(1, user.getFirstName());
                prSt.setString(2, user.getPhone());
                prSt.setString(3, user.getUserName());
                prSt.setString(4, user.getPassword());
                prSt.setString(5, user.getLocation());
                prSt.setString(6, user.getGender());
                prSt.setString(7,user.getUserName());
                prSt.setString(8, user.getPassword());

                prSt.executeUpdate();
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }



    public ResultSet getUser(User user) {
        ResultSet resSet = null;

        String select = "SELECT * FROM " + Const.USER_TABLE + " WHERE " +
                Const.USER_USERNAME + "=? AND " + Const.USER_PASSWORD + "=?";

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            prSt.setString(1, user.getUserName());
            prSt.setString(2, user.getPassword());

            resSet = prSt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return resSet;
    }

    public void BookingRoom(User user, Rooms room) {

        String select = "SELECT * FROM " + Const.USER_TABLE + " WHERE " +
                Const.USER_USERNAME + "=? AND " + Const.USER_PASSWORD + "=?";

        try {
            PreparedStatement prSta = getDbConnection().prepareStatement(select);
            prSta.setString(1, user.getUserName());
            prSta.setString(2, user.getPassword());

            Integer book = prSta.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }



        String insert = "INSERT INTO " + Const.BOOKING_TABLE + "(" +
                Const.USER_ID + "," + Const.ROOMS_ID + ")" +
                "VALUES(?,?)";

        try {
            try (PreparedStatement prSt = getDbConnection().prepareStatement(insert)) {
                prSt.setString(1, user.getIduser());
                prSt.setString(2, room.getIdroom());


                prSt.executeUpdate();
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}
