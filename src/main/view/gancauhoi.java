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
    
    public gancauhoi(String jdbc, String bang){
        Run = new run(jdbc,bang);
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
}
