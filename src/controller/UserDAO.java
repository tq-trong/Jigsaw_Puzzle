/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Users;

/**
 *
 * @author qtrngcrusoe
 */
public class UserDAO {

    Connection conn = null;
    PreparedStatement pstm = null;

    public boolean login(Users us) { //Login----------------------------------------------------------
        try {
            conn = ConnectionDB.getConnection();
            String query = "Select * from [User] where Username ='" + us.getUsername() + "' and Password = '" + us.getPassword() + "'";
            pstm = conn.prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {

        } finally {
            try {
                conn.close();
                pstm.close();
            } catch (Exception e) {

            }
        }
        return false;
    }
    
    public int registerUser(String username, String password) { //Register----------------------------------------------------------
        Users us = new Users(username, password);
        String sql = "insert into [User](Username, Password) values(?, ?)";
        try {
            conn = ConnectionDB.getConnection();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, us.getUsername());
            pstm.setString(2, us.getPassword());
            if (pstm.executeUpdate() > 0) {
                return 1;
            }
        } catch (Exception e) {

        } finally {
            try {
                conn.close();
                pstm.close();
            } catch (Exception e) {

            }
        }
        return -1;
    }

    public int checkToChange(Users us, String currentPass) { //Check conform password----------------------------------------------------------
        try {
            conn = ConnectionDB.getConnection();
            pstm = conn.prepareStatement("select * from [User] where Username=?");
            pstm.setString(1, us.getUsername());
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                if (currentPass.equals(rs.getString("Password"))) {
                    return 1;
                }
            }
        } catch (Exception e) {
            System.out.println("Loi gi");
        } finally {
            try {
                conn.close();
                pstm.close();
            } catch (Exception e) {
                System.out.println("Loi");
            }
        }
        return -1;
    }

    public int changePassword(Users us, String newPass) { //Changepass----------------------------------------------------------
        try {
            conn = ConnectionDB.getConnection();
            pstm = conn.prepareStatement("update [User] set Password=? where Username=? ");
            pstm.setString(1, newPass);
            pstm.setString(2, us.getUsername());
            if (pstm.executeUpdate() > 0) {
                return 1;
            }
        } catch (Exception ex) {
            System.out.println("Loi");
        } finally {
            try {
                conn.close();
                pstm.close();
            } catch (Exception e) {

            }
        }
        return -1;
    }
}
