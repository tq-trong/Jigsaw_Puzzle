/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Games;

/**
 *
 * @author qtrngcrusoe
 */
public class GameDAO {

    Connection conn = null;
    PreparedStatement pstm = null;
    Games g;

    public Games findGame(int id) { //Tim game tu trang chu
        try {
            conn = ConnectionDB.getConnection();
            String query = "Select * from Game where GameID=?";
            pstm = conn.prepareStatement(query);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                g = new Games(rs.getInt("GameID"));
                return g;
            }
        } catch (Exception e) {

        } finally {
            try {
                conn.close();
                pstm.close();
            } catch (Exception e) {

            }
        }
        return g;
    }

    public void sapXep(Games g) { //sap xep luc moi vo game
        String sql = "Select * From Game where GameID=?";
        try {
            conn = ConnectionDB.getConnection();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, g.getGameID());
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                g.setImg1(rs.getString("Hinh1"));
                g.setImg2(rs.getString("Hinh2"));
                g.setImg3(rs.getString("Hinh3"));
                g.setImg4(rs.getString("Hinh4"));
                g.setImg5(rs.getString("Hinh5"));
                g.setImg6(rs.getString("Hinh6"));
                g.setImg7(rs.getString("Hinh7"));
                g.setImg8(rs.getString("Hinh8"));
                g.setImg9(rs.getString("Hinh9"));
                g.setImg10(rs.getString("Hinh10"));
                g.setImg11(rs.getString("Hinh11"));
                g.setImg12(rs.getString("Hinh12"));
                g.setImg13(rs.getString("Hinh13"));
                g.setImg14(rs.getString("Hinh14"));
                g.setImg15(rs.getString("Hinh15"));
            }
        } catch (Exception e) {
        } finally {
            try {
                conn.close();
                pstm.close();
            } catch (Exception e) {

            }
        }
    }

    public boolean kiemTra(String b1, String b2, String b3, String b4, String b5, String b6, String b7, String b8, String b9, String b10, String b11, String b12, String b13, String b14, String b15, Games g) {
        String url = "file:/E:/JAVA/Jigsaw_Puzzle/build/classes/resources/";
        if (b1.equals(url + g.getImg1())
                && b2.equals(url + g.getImg2())
                && b3.equals(url + g.getImg3())
                && b4.equals(url + g.getImg4())
                && b5.equals(url + g.getImg5())
                && b6.equals(url + g.getImg6())
                && b7.equals(url + g.getImg7())
                && b8.equals(url + g.getImg8())
                && b9.equals(url + g.getImg9())
                && b10.equals(url + g.getImg10())
                && b11.equals(url + g.getImg11())
                && b12.equals(url + g.getImg12())
                && b13.equals(url + g.getImg13())
                && b14.equals(url + g.getImg14())
                && b15.equals(url + g.getImg15())) {
            return true;
        }
        return false;
    }

    public int addGame(String mota, String h1, String h2, String h3, String h4, String h5, String h6, String h7, String h8, String h9, String h10, String h11, String h12, String h13, String h14, String h15) {
        Games g = new Games(mota, h1, h2, h3, h4, h5, h6, h7, h8, h9, h10, h11, h12, h13, h14, h15);
        String sql = "insert into Game (MoTa, Hinh1, Hinh2, Hinh3, Hinh4, Hinh5, Hinh6, Hinh7, Hinh8, Hinh9, Hinh10, Hinh11, Hinh12, Hinh13, Hinh14, Hinh15) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            conn = ConnectionDB.getConnection();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, g.getDescription());
            pstm.setString(2, g.getImg1());
            pstm.setString(3, g.getImg2());
            pstm.setString(4, g.getImg3());
            pstm.setString(5, g.getImg4());
            pstm.setString(6, g.getImg5());
            pstm.setString(7, g.getImg6());
            pstm.setString(8, g.getImg7());
            pstm.setString(9, g.getImg8());
            pstm.setString(10, g.getImg9());
            pstm.setString(11, g.getImg10());
            pstm.setString(12, g.getImg11());
            pstm.setString(13, g.getImg12());
            pstm.setString(14, g.getImg13());
            pstm.setString(15, g.getImg14());
            pstm.setString(16, g.getImg15());
            if (pstm.executeUpdate() > 0) {
                return 1;
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
        return -1;
    }
    
    public int updateGame(String name, int id) {
        try {
            conn = ConnectionDB.getConnection();
            pstm = conn.prepareStatement("update Game set MoTa=? where GameID = ?");
            pstm.setString(1, name);
            pstm.setInt(2, id);
            if(pstm.executeUpdate() > 0) {
                return 1;
            }
        }
        catch(Exception e) {
            
        } finally {
            try {
                conn.close();
                pstm.close();
            } catch (Exception e) {

            }
        }
        return -1;
    }
    
    public int deleteGame(int id) {
        try {
            conn = ConnectionDB.getConnection();
            pstm = conn.prepareStatement("delete Game where GameID = ?");
            pstm.setInt(1, id);
            if(pstm.executeUpdate() > 0) {
                return 1;
            }
        }
        catch(Exception e) {
            
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
