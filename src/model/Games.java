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
public class Games {
    private int gameID;
    private String description;
    private String img1;
    private String img2;
    private String img3;
    private String img4;
    private String img5;
    private String img6;
    private String img7;
    private String img8;
    private String img9;
    private String img10;
    private String img11;
    private String img12;
    private String img13;
    private String img14;
    private String img15;

    public Games(int gameID, String description) {
        this.gameID = gameID;
        this.description = description;
    }

    public Games(int gameID) {
        this.gameID = gameID;
    }
     
    public Games(int gameID, String description, String img1, String img2, String img3, String img4, String img5, String img6, String img7, String img8, String img9, String img10, String img11, String img12, String img13, String img14, String img15) {
        this.gameID = gameID;
        this.description = description;
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.img4 = img4;
        this.img5 = img5;
        this.img6 = img6;
        this.img7 = img7;
        this.img8 = img8;
        this.img9 = img9;
        this.img10 = img10;
        this.img11 = img11;
        this.img12 = img12;
        this.img13 = img13;
        this.img14 = img14;
        this.img15 = img15;
    }

    public Games(String description, String img1, String img2, String img3, String img4, String img5, String img6, String img7, String img8, String img9, String img10, String img11, String img12, String img13, String img14, String img15) {
        this.description = description;
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.img4 = img4;
        this.img5 = img5;
        this.img6 = img6;
        this.img7 = img7;
        this.img8 = img8;
        this.img9 = img9;
        this.img10 = img10;
        this.img11 = img11;
        this.img12 = img12;
        this.img13 = img13;
        this.img14 = img14;
        this.img15 = img15;
    }
    
    
    
    @Override
    public String toString() {
        return description;
    }

    public int getGameID() {
        return gameID;
    }

    public void setGameID(int gameID) {
        this.gameID = gameID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public String getImg3() {
        return img3;
    }

    public void setImg3(String img3) {
        this.img3 = img3;
    }

    public String getImg4() {
        return img4;
    }

    public void setImg4(String img4) {
        this.img4 = img4;
    }

    public String getImg5() {
        return img5;
    }

    public void setImg5(String img5) {
        this.img5 = img5;
    }

    public String getImg6() {
        return img6;
    }

    public void setImg6(String img6) {
        this.img6 = img6;
    }

    public String getImg7() {
        return img7;
    }

    public void setImg7(String img7) {
        this.img7 = img7;
    }

    public String getImg8() {
        return img8;
    }

    public void setImg8(String img8) {
        this.img8 = img8;
    }

    public String getImg9() {
        return img9;
    }

    public void setImg9(String img9) {
        this.img9 = img9;
    }

    public String getImg10() {
        return img10;
    }

    public void setImg10(String img10) {
        this.img10 = img10;
    }

    public String getImg11() {
        return img11;
    }

    public void setImg11(String img11) {
        this.img11 = img11;
    }

    public String getImg12() {
        return img12;
    }

    public void setImg12(String img12) {
        this.img12 = img12;
    }

    public String getImg13() {
        return img13;
    }

    public void setImg13(String img13) {
        this.img13 = img13;
    }

    public String getImg14() {
        return img14;
    }

    public void setImg14(String img14) {
        this.img14 = img14;
    }

    public String getImg15() {
        return img15;
    }

    public void setImg15(String img15) {
        this.img15 = img15;
    }
    
    
}
