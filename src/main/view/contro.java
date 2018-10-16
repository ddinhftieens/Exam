/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

/**
 *
 * @author Dell
 */
public class contro extends GridPane{
    private Button cau1,cau2,cau3,cau4,cau5,cau6,cau7,cau8,cau9,cau10;
    private Button cau11,cau12,cau13,cau14,cau15,cau16,cau17,cau18,cau19,cau20;
    private Button cau21,cau22,cau23,cau24,cau25,cau26,cau27,cau28,cau29,cau30;
    private Button cau31,cau32,cau33,cau34,cau35,cau36,cau37,cau38,cau39,cau40;
    private Button cau41,cau42,cau43,cau44,cau45,cau46,cau47,cau48,cau49,cau50;
    private Button nopbai,batdau;
    
    public contro(){
        setVgap(10);
        setHgap(10);
        setPadding(new Insets(15));
        cau1 = new Button("1");
        cau2 = new Button("2");
        cau3 = new Button("3");
        cau4 = new Button("4");
        cau5 = new Button("5");
        cau6 = new Button("6");
        cau7 = new Button("7");
        cau8 = new Button("8");
        cau9 = new Button("9");
        cau10 = new Button("10");
        
        cau11 = new Button("11");
        cau12 = new Button("12");
        cau13 = new Button("13");
        cau14 = new Button("14");
        cau15 = new Button("15");
        cau16 = new Button("16");
        cau17 = new Button("17");
        cau18 = new Button("18");
        cau19 = new Button("19");
        cau20 = new Button("20");
        
        cau21 = new Button("21");
        cau22 = new Button("22");
        cau23 = new Button("23");
        cau24 = new Button("24");
        cau25 = new Button("25");
        cau26 = new Button("26");
        cau27 = new Button("27");
        cau28 = new Button("28");
        cau29 = new Button("29");
        cau30 = new Button("30");
        
        cau31 = new Button("31");
        cau32 = new Button("32");
        cau33 = new Button("33");
        cau34 = new Button("34");
        cau35 = new Button("35");
        cau36 = new Button("36");
        cau37 = new Button("37");
        cau38 = new Button("38");
        cau39 = new Button("39");
        cau40 = new Button("40");
        
        cau41 = new Button("41");
        cau42 = new Button("42");
        cau43 = new Button("43");
        cau44 = new Button("44");
        cau45 = new Button("45");
        cau46 = new Button("46");
        cau47 = new Button("47");
        cau48 = new Button("48");
        cau49 = new Button("49");
        cau50 = new Button("50");
        
        add(cau1,0,0);
        add(cau2,1,0);
        add(cau3,2,0);
        add(cau4,3,0);
        add(cau5,4,0);
        add(cau6,0,1);
        add(cau7,1,1);
        add(cau8,2,1);
        add(cau9,3,1);
        add(cau10,4,1);
        
        add(cau11,0,2);
        add(cau12,1,2);
        add(cau13,2,2);
        add(cau14,3,2);
        add(cau15,4,2);
        add(cau16,0,3);
        add(cau17,1,3);
        add(cau18,2,3);
        add(cau19,3,3);
        add(cau20,4,3);
        
        add(cau21,0,4);
        add(cau22,1,4);
        add(cau23,2,4);
        add(cau24,3,4);
        add(cau25,4,4);
        add(cau26,0,5);
        add(cau27,1,5);
        add(cau28,2,5);
        add(cau29,3,5);
        add(cau30,4,5);
        
        add(cau31,0,6);
        add(cau32,1,6);
        add(cau33,2,6);
        add(cau34,3,6);
        add(cau35,4,6);
        add(cau36,0,7);
        add(cau37,1,7);
        add(cau38,2,7);
        add(cau39,3,7);
        add(cau40,4,7);
        
        add(cau41,0,8);
        add(cau42,1,8);
        add(cau43,2,8);
        add(cau44,3,8);
        add(cau45,4,8);
        add(cau46,0,9);
        add(cau47,1,9);
        add(cau48,2,9);
        add(cau49,3,9);
        add(cau50,4,9);
        
        nopbai = new Button("Nộp Bài");
        nopbai.setFont(new Font(15));
        batdau = new Button("Bắt đầu");
        batdau.setFont(new Font(15));
        add(nopbai,0,10,2,1);
        add(batdau,2,10,3,1);
        setStyle("-fx-background-color: #cccccc");
    }

    public Button getCau1() {
        return cau1;
    }

    public Button getCau2() {
        return cau2;
    }

    public Button getCau3() {
        return cau3;
    }

    public Button getCau4() {
        return cau4;
    }

    public Button getCau5() {
        return cau5;
    }

    public Button getCau6() {
        return cau6;
    }

    public Button getCau7() {
        return cau7;
    }

    public Button getCau8() {
        return cau8;
    }

    public Button getCau9() {
        return cau9;
    }

    public Button getCau10() {
        return cau10;
    }

    public Button getCau11() {
        return cau11;
    }

    public Button getCau12() {
        return cau12;
    }

    public Button getCau13() {
        return cau13;
    }

    public Button getCau14() {
        return cau14;
    }

    public Button getCau15() {
        return cau15;
    }

    public Button getCau16() {
        return cau16;
    }

    public Button getCau17() {
        return cau17;
    }

    public Button getCau18() {
        return cau18;
    }

    public Button getCau19() {
        return cau19;
    }

    public Button getCau20() {
        return cau20;
    }

    public Button getCau21() {
        return cau21;
    }

    public Button getCau22() {
        return cau22;
    }

    public Button getCau23() {
        return cau23;
    }

    public Button getCau24() {
        return cau24;
    }

    public Button getCau25() {
        return cau25;
    }

    public Button getCau26() {
        return cau26;
    }

    public Button getCau27() {
        return cau27;
    }

    public Button getCau28() {
        return cau28;
    }

    public Button getCau29() {
        return cau29;
    }

    public Button getCau30() {
        return cau30;
    }

    public Button getCau31() {
        return cau31;
    }

    public Button getCau32() {
        return cau32;
    }

    public Button getCau33() {
        return cau33;
    }

    public Button getCau34() {
        return cau34;
    }

    public Button getCau35() {
        return cau35;
    }

    public Button getCau36() {
        return cau36;
    }

    public Button getCau37() {
        return cau37;
    }

    public Button getCau38() {
        return cau38;
    }

    public Button getCau39() {
        return cau39;
    }

    public Button getCau40() {
        return cau40;
    }

    public Button getCau41() {
        return cau41;
    }

    public Button getCau42() {
        return cau42;
    }

    public Button getCau43() {
        return cau43;
    }

    public Button getCau44() {
        return cau44;
    }

    public Button getCau45() {
        return cau45;
    }

    public Button getCau46() {
        return cau46;
    }

    public Button getCau47() {
        return cau47;
    }

    public Button getCau48() {
        return cau48;
    }

    public Button getCau49() {
        return cau49;
    }

    public Button getCau50() {
        return cau50;
    }

    public Button getNopbai() {
        return nopbai;
    }

    public Button getBatdau() {
        return batdau;
    }
    
}
