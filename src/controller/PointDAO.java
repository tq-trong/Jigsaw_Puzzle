/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import model.Points;

/**
 *
 * @author qtrngcrusoe
 */
public class PointDAO {

    Connection conn = null;
    PreparedStatement pstm = null;

    public boolean addPoint(String username, int game, String thoiGian, int clicked) {
        Points p = new Points(username, game, thoiGian, clicked);
        String insertDiem = "Insert into Diem(Username, GameID, ThoiGian, Clicked) values (?, ?, ?, ?)";
        try {
            conn = ConnectionDB.getConnection();
            pstm = conn.prepareStatement(insertDiem);
            pstm.setString(1, p.getUsername());
            pstm.setInt(2, p.getGameID());
            pstm.setString(3, p.getTime());
            pstm.setInt(4, p.getClicked());
            if(pstm.executeUpdate() > 0) {
                return true;
            }

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                conn.close();
                pstm.close();
            } catch (Exception e) {

            }
        }
        return false;
    }
    
    public void showPoint(javax.swing.JTable tb) {
        try {
            conn = ConnectionDB.getConnection();
            String query = "select Username, MoTa, ThoiGian, Clicked from Diem d join Game g on d.GameID = g.GameID";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()) {
                String usn = rs.getString("Username");
                String gid = rs.getString("MoTa");
                String t = rs.getString("ThoiGian");
                String c = String.valueOf(rs.getString("Clicked"));
                
                String tbData[] = {usn, gid, t, c};
                DefaultTableModel model = (DefaultTableModel)tb.getModel();
                model.addRow(tbData);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
                pstm.close();
            } catch (Exception e) {

            }
        }
    }
}
