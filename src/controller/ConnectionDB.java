/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author qtrngcrusoe
 */
public class ConnectionDB {
    private static String url = "jdbc:sqlserver://DESKTOP-5JAJSUM\\MSSQLSERVER:1433;databaseName=Jigsaw_Puzzle;encrypt=true;trustServerCertificate=true;";
    private static String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String username = "sa";
    private static String password = "sa";
    private static Connection conn;
    
    
    public static Connection getConnection() {
        try {
            Class.forName(driverName);
            try {
                conn = DriverManager.getConnection(url, username, password);
                System.out.println("Connected");
            }
            catch(Exception e) {
                //System.out.println("Connect Fail");
                e.printStackTrace();
            }
        }
        catch(Exception e) {
            System.out.println("Driver not found");
            e.printStackTrace();
        }
        return conn;
    }
    public static void main(String[] args) {
        getConnection();
    }
}

