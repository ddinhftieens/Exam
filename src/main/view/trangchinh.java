/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
    
    public trangchinh(String nameClass){
        super();
        label = new Label();
        button = new Button();
        button.setText("Trở về trang chủ");
        button.setFont(new Font(20));
        setVgap(10);
        setHgap(10);
        setPadding(new Insets(10));
        label.setText(nameClass);
        label.setFont(new Font(68));
        label.setMinSize(950, 100);
        label.setAlignment(Pos.CENTER);
        label.setStyle("-fx-background-color: #73ef75");
        button.setStyle("-fx-pref-width: 230px; -fx-pref-height: 100px");
        add(button,0,0);
        add(label,1,0);
    }

    public Button getButton() {
        return button;
    }
    public void return_background(EventHandler<ActionEvent> eventHandler){
        button.setOnAction(eventHandler);
    }
}
