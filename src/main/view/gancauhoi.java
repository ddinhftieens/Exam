/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import toJDBC.question;
import toJDBC.run;

/**
 *
 * @author Dell
 */
public class gancauhoi{
    private run Run;
    private List<question> list;
    private List<question> question;
    private GridPane gridPane;
    private RadioButton A,B,C,D;
    private Label cauhoi;
    private ToggleGroup toggleGroup;
    private Random rd;
    private contro Contro;
    
    public gancauhoi(){
        Run = new run();
        list = new ArrayList();  
        list = Run.getList();
        question = new ArrayList();
        rd = new Random();
        while(!list.isEmpty()){
            int index = rd.nextInt(list.size());
            question.add(list.get(index));
            list.remove(index);
        }
        Contro = new contro();
    }
    
    public List<question> getCauhoi() {
        return question;
    }
//    public void setCauHoi(){
//        int indext = 0;
//        gridPane = new GridPane();
//        gridPane.setVgap(10);
//        gridPane.setHgap(10);
//        gridPane.setPadding(new Insets(10));
//        gridPane.setLayoutX(250);
//        gridPane.setLayoutY(120);
//        gridPane.setPrefSize(950, 480);
//        gridPane.setStyle("-fx-background-color: #cccccc");
//        cauhoi = new Label(question.get(indext).getCauhoi());
//        cauhoi.setFont(new Font(30));
//        cauhoi.setWrapText(true);
//        A = new RadioButton(question.get(indext).getA());
//        A.setFont(new Font(20));
//        A.setWrapText(true);
//        B = new RadioButton(question.get(indext).getB());
//        B.setFont(new Font(20));
//        B.setWrapText(true);
//        C = new RadioButton(question.get(indext).getC());
//        C.setFont(new Font(20));
//        C.setWrapText(true);
//        D = new RadioButton(question.get(indext).getD());
//        D.setFont(new Font(20));
//        D.setWrapText(true);
//        A.setToggleGroup(toggleGroup);
//        B.setToggleGroup(toggleGroup);
//        C.setToggleGroup(toggleGroup);
//        D.setToggleGroup(toggleGroup);
//        gridPane.add(cauhoi,0,1,2,1);
//        gridPane.add(A, 0, 2,2,1);
//        gridPane.add(B, 0, 3,2,1);
//        gridPane.add(C, 0, 4,2,1);
//        gridPane.add(D, 0, 5,2,1);
//        background.getChildren().add(gridPane);
//    }
}
