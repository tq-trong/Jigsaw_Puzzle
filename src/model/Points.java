/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author qtrngcrusoe
 */
public class Points {
    private int diemID;
    private String username;
    private int gameID;
    private String time;
    private int clicked;

    public Points(String username, int gameID, String time, int clicked) {
        this.username = username;
        this.gameID = gameID;
        this.time = time;
        this.clicked = clicked;
    }

    public int getDiemID() {
        return diemID;
    }

    public void setDiemID(int diemID) {
        this.diemID = diemID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getGameID() {
        return gameID;
    }

    public void setGameID(int gameID) {
        this.gameID = gameID;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getClicked() {
        return clicked;
    }

    public void setClicked(int clicked) {
        this.clicked = clicked;
    }
    
    
}
