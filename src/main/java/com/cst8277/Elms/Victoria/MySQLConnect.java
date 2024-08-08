package com.cst8277.Elms.Victoria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MySQLConnect {
    public static void main(String[] args) throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/app";
        String user = "root";
        String password = "password";

        Class.forName("com.mysql.cj.jdbc.driver");
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Database connection");
        }catch(SQLException e){
            throw new IllegalStateException("Cannot connect the database");}

         /*
            Connection connection = DriverManager.getConnection(url, user, password);
            connection.close();
        }catch(ClassNotFoundException | SQLException Exception catch (ClassNotFoundException e) {
            throw new RuntimeException(e);

        } */
    }
}
