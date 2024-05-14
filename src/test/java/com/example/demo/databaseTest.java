package com.example.demo;

import java.sql.*;

public class databaseTest {

    try {
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3307",
                "leica",
                "1234"
        );

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(
                "show databases"
        );

        while (rs.next()) {
            System.out.println(rs.getString(1));
        }
    } catch (
    SQLException e) {
        e.printStackTrace();
    }
}

}
