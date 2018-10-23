/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.view;

import java.util.ArrayList;
import java.util.List;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

/**
 *
 * @author Dell
 */
public class contro extends GridPane{
    private Button nopbai,batdau,cau;
    private List<Button> list;
    
    public contro(){
        setVgap(10);
        setHgap(10);
        setPadding(new Insets(15));
        list = new ArrayList();
        for(int i=1;i<=50;i++){
            if(i<10) cau = new Button("0"+i);
            else cau = new Button(""+i);
            cau.setUserData(i);
            list.add(cau);
        }              
        nopbai = new Button("Nộp Bài");
        nopbai.setFont(new Font(15));
        batdau = new Button("Bắt đầu");
        batdau.setFont(new Font(30));
        batdau.setStyle("-fx-pref-width: 200px; -fx-pref-height: 100px");
        add(batdau,0,0);
        setStyle("-fx-background-color: #cccccc");
    }

    public List<Button> getList() {
        return list;
    }
    
    public Button getNopbai() {
        return nopbai;
    }

    public Button getBatdau() {
        return batdau;
    }
    
}
