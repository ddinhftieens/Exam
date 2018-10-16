/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.view;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

/**
 *
 * @author Dell
 */
public class lop extends GridPane{
    
    private MenuItem lop1, lop2, lop3, lop4, lop5;
    private MenuItem lop6, lop7, lop8, lop9;
    private MenuItem lop10, lop11, lop12, toan, li , hoa;
    private Menu menu1,menu2,menu3,menu4;
    private MenuBar menuBar;
    
    public lop(){
        super();
        setVgap(10);
        setHgap(10);
        setPadding(new Insets(10, 10, 10, 10));
        menuBar = new MenuBar();
        menu1 = new Menu();
        Label t = new Label("Cấp 1");
        t.setFont(new Font(40));
        menu1.setGraphic(t);
        menu2 = new Menu();
        t = new Label("Cấp 2");
        t.setFont(new Font(40));
        menu2.setGraphic(t);
        menu3 = new Menu();
        t = new Label("Cấp 3");
        t.setFont(new Font(40));
        menu3.setGraphic(t);
        menu4 = new Menu();
        t = new Label("Luyện thi Đại Học");
        t.setFont(new Font(30));
        menu4.setGraphic(t);
        toan = new MenuItem("Toán");
        li = new MenuItem("Lý");
        hoa = new MenuItem("Hóa");
        lop1 = new MenuItem("Lớp 1");
        lop2 = new MenuItem("Lớp 2");
        lop3 = new MenuItem("Lớp 3");
        lop4 = new MenuItem("Lớp 4");
        lop5 = new MenuItem("Lớp 5");
        lop6 = new MenuItem("Lớp 6");
        lop7 = new MenuItem("Lớp 7");
        lop8 = new MenuItem("Lớp 8");
        lop9 = new MenuItem("Lớp 9");
        lop10 = new MenuItem("Lớp 10");
        lop11 = new MenuItem("Lớp 11");
        lop12 = new MenuItem("Lớp 12");
        menu1.getItems().addAll(lop1,lop2,lop3,lop4,lop5);
        lop1.setStyle("-fx-pref-width: 292px");
        lop6.setStyle("-fx-pref-width: 292px");
        lop10.setStyle("-fx-pref-width: 292px");
        toan.setStyle("-fx-pref-width: 292px");
        menu2.getItems().addAll(lop6,lop7,lop8,lop9);
        menu3.getItems().addAll(lop10,lop11,lop12);
        menu4.getItems().addAll(toan, li, hoa);
        menu1.setStyle("-fx-background-color: #73ef75; -fx-pref-width: 292px; -fx-pref-height: 100px");
        menu2.setStyle("-fx-background-color: #73ef75;-fx-pref-width: 292px; -fx-pref-height: 100px");
        menu3.setStyle("-fx-background-color: #73ef75;-fx-pref-width: 292px; -fx-pref-height: 100px");
        menu4.setStyle("-fx-background-color: #73ef75;-fx-pref-width: 292px; -fx-pref-height: 100px");
        menuBar.getMenus().addAll(menu1,menu2,menu3,menu4);
        menuBar.setMinSize(1190, 100);
        add(menuBar,0,0);
    }

    public MenuItem getLop1() {
        return lop1;
    }

    public MenuItem getLop2() {
        return lop2;
    }

    public MenuItem getLop3() {
        return lop3;
    }

    public MenuItem getLop5() {
        return lop5;
    }

    public MenuItem getLop6() {
        return lop6;
    }

    public MenuItem getLop7() {
        return lop7;
    }

    public MenuItem getLop9() {
        return lop9;
    }

    public MenuItem getLop10() {
        return lop10;
    }

    public MenuItem getLop11() {
        return lop11;
    }

    public MenuItem getLop12() {
        return lop12;
    }

    public MenuItem getLop4() {
        return lop4;
    }

    public MenuItem getLop8() {
        return lop8;
    }

    public MenuItem getToan() {
        return toan;
    }

    public MenuItem getLi() {
        return li;
    }

    public MenuItem getHoa() {
        return hoa;
    }
}
