/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

/**
 *
 * @author Dell
 */
public class trangchinh extends Label{
    
    public trangchinh(String nameClass){
        super(); 
        setPadding(new Insets(10));
        setText(nameClass);
        setFont(new Font(50));
        setAlignment(Pos.CENTER);
        setStyle("-fx-background-color: #73ef75");
    }
}
