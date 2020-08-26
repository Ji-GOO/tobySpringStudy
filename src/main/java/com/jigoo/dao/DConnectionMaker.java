package com.jigoo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DConnectionMaker implements ConnectionMaker {

    public Connection makeConnection() throws ClassNotFoundException, SQLException {

        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:59161:XE", "system", "oracle");

        return con;
    }
}
