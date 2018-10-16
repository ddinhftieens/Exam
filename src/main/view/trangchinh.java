/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;

/**
 *
 * @author Dell
 */
public class trangchinh extends GridPane{
    
    private Label label;
    private Button button;
    private StackPane quetions;
    
    
    public trangchinh(String nameClass){
        super();
        label = new Label();
        setVgap(10);
        setHgap(10);
        setPadding(new Insets(10));
        label.setText(nameClass);
        label.setFont(new Font(68));
        label.setMinSize(1190, 100);
        label.setAlignment(Pos.CENTER);
        label.setStyle("-fx-background-color: #73ef75");      
        add(label,0,0);
    }
}
