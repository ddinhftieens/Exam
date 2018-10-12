/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;

/**
 *
 * @author H81
 */
public class View {
    
    private final int chieucao = 600;
    private final int chieurong = 1200;
    private final int cao_tieude = 250;
    private final int rong_tieude = 1200;
    private final int cao_muc = 350;
    private final int rong_muc = 1200;
    
    private Pane background,muc;
    private Button button;
    private Scene scene;
    private Label tieude;
    
    public View(){
        
        background = new Pane();
        background.setMinSize(chieurong, chieucao);
        scene = new Scene(background, chieurong, chieucao);
        
        tieude = new Label();
        tieude.setLayoutX(0);
        tieude.setLayoutY(0);
        tieude.setMinSize(rong_tieude + 10, cao_tieude);
        tieude.setStyle("-fx-background-color: #73ef75");
        tieude.setText("The First Product");
        tieude.setAlignment(Pos.CENTER);
        tieude.setFont(new Font(50));
        background.getChildren().add(tieude);
        
        
        muc = new StackPane();
        muc.setLayoutX(0);
        muc.setLayoutY(cao_tieude);
        muc.setMinSize(rong_muc +10, cao_muc +10);
        muc.setStyle("-fx-background-color: white");
        button = new Button("Bắt đầu");
        button.setFont(new Font(45));
        muc.getChildren().add(button);
        background.getChildren().add(muc);
    }
    
    public Scene getScene() {
        return scene;
    }
}