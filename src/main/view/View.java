/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.view;

import java.util.Date;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import java.util.*;
import toJDBC.*;

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
    
    private Pane muc;
    protected Pane background;
    private Button button,check,next;
    private Scene scene;
    private Label tieude,cauhoi;
    private lop Lop;
    private trangchinh Trangchinh;
    private GridPane gridPane;
    private RadioButton A,B,C,D;
    private ToggleGroup toggleGroup;
    protected contro Contro;
    private Date date;
    private gancauhoi ganCauHoi;
    
    public View(){
        Lop = new lop();
        background = new Pane();
        background.setMinSize(chieurong, chieucao);
        scene = new Scene(background, chieurong, chieucao);
        
        tieude = new Label();
        tieude.setLayoutX(0);
        tieude.setLayoutY(0);
        tieude.setMinSize(rong_tieude + 10, cao_tieude);
        tieude.setStyle("-fx-background-color: #73ef75");
        tieude.setText("Ôn tập lí thuyết");
        tieude.setAlignment(Pos.CENTER);
        tieude.setFont(new Font(68));
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
        toggleGroup = new ToggleGroup();
        Contro = new contro();
    }
    
    public Scene getScene() {
        return scene;
    }
    
    public void chonbatdau(EventHandler<ActionEvent> eventHandler){
        button.setOnAction(eventHandler);
    }
    public void background2(){
        background.getChildren().removeAll(tieude,muc);
        background.getChildren().add(Lop);
    }
    public void eventToan(EventHandler<ActionEvent> eventHandler){
        Lop.getToan().setOnAction(eventHandler);
    }
    public void setToan(){
        background.getChildren().removeAll(Lop);
        background.getChildren().add(new trangchinh(Lop.getToan().getText()));
    }
    public void eventLi(EventHandler<ActionEvent> eventHandler){
        Lop.getLi().setOnAction(eventHandler);
    }
    public void setLi(){
        background.getChildren().removeAll(Lop);
        background.getChildren().add(new trangchinh(Lop.getLi().getText())); 
        Contro.setLayoutX(10);
        Contro.setLayoutY(120);
        Contro.setMinSize(230, 480);
        background.getChildren().add(Contro);
    }
    public void cau1(EventHandler<ActionEvent> eventHandler){
        Contro.getCau1().setOnAction(eventHandler);
    }
    
    public void setCau(question list){
        gridPane = new GridPane();
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setPadding(new Insets(10));
        gridPane.setLayoutX(250);
        gridPane.setLayoutY(120);
        gridPane.setPrefSize(950, 480);
        gridPane.setStyle("-fx-background-color: #cccccc");
        cauhoi = new Label(list.getCauhoi());
        cauhoi.setFont(new Font(30));
        cauhoi.setWrapText(true);
        A = new RadioButton(list.getA());
        A.setFont(new Font(20));
        A.setWrapText(true);
        B = new RadioButton(list.getB());
        B.setFont(new Font(20));
        B.setWrapText(true);
        C = new RadioButton(list.getC());
        C.setFont(new Font(20));
        C.setWrapText(true);
        D = new RadioButton(list.getD());
        D.setFont(new Font(20));
        D.setWrapText(true);
        A.setToggleGroup(toggleGroup);
        B.setToggleGroup(toggleGroup);
        C.setToggleGroup(toggleGroup);
        D.setToggleGroup(toggleGroup);
//        System.out.println(list.getAnswer());

        if(list.getAnswer().equals("A")) System.out.println(list.getAnswer());
        else if(list.getAnswer().equals("B")) System.out.println(list.getAnswer());
        else if(list.getAnswer().equals("C")) System.out.println(list.getAnswer());
        else if(list.getAnswer().equals("D")) System.out.println(list.getAnswer());

//        if(list.getAnswer().equals("A")) toggleGroup.selectToggle(A);
//        else if(list.getAnswer().equals("B")) toggleGroup.selectToggle(B);
//        else if(list.getAnswer().equals("C")) toggleGroup.selectToggle(C);
//        else if(list.getAnswer().equals("D")) toggleGroup.selectToggle(D);

        gridPane.add(cauhoi,0,1,2,1);
        gridPane.add(A, 0, 2,2,1);
        gridPane.add(B, 0, 3,2,1);
        gridPane.add(C, 0, 4,2,1);
        gridPane.add(D, 0, 5,2,1);
        background.getChildren().add(gridPane);
//        if(toggleGroup.getSelectedToggle().isSelected()) System.out.println("YES");
    }
    public void start(EventHandler<ActionEvent> eventHandler){
        Contro.getBatdau().setOnAction(eventHandler);
    }
    public void setStart(){
        date = new Date();
        Contro.add(new Label("Start: " + date.getHours() +":"+ date.getMinutes() +":"+ date.getSeconds()),0 ,11 ,4 ,1 );
        Contro.getChildren().remove(Contro.getBatdau());
        
    }
    public void cau2(EventHandler<ActionEvent> eventHandler){
        Contro.getCau2().setOnAction(eventHandler);
    }
    public void cau3(EventHandler<ActionEvent> eventHandler){
        Contro.getCau3().setOnAction(eventHandler);
    }
    public void cau4(EventHandler<ActionEvent> eventHandler){
        Contro.getCau4().setOnAction(eventHandler);
    }
    public void eventHoa(EventHandler<ActionEvent> eventHandler){
        Lop.getHoa().setOnAction(eventHandler);
    }
    public void setHoa(){
        background.getChildren().removeAll(Lop);
        background.getChildren().add(new trangchinh(Lop.getHoa().getText()));
    }
    public void eventLop1(EventHandler<ActionEvent> eventHandler) {
        Lop.getLop1().setOnAction(eventHandler);
    }
    public void setLop1(){
        background.getChildren().removeAll(Lop);
        background.getChildren().add(new trangchinh(Lop.getLop1().getText()));
    }
    public void eventLop2(EventHandler<ActionEvent> eventHandler) {
        Lop.getLop2().setOnAction(eventHandler);
    }
    public void setLop2(){
        background.getChildren().removeAll(Lop);
        background.getChildren().add(new trangchinh(Lop.getLop2().getText()));
    }
    public void eventLop3(EventHandler<ActionEvent> eventHandler) {
        Lop.getLop3().setOnAction(eventHandler);
    }
    public void setLop3(){
        background.getChildren().removeAll(Lop);
        background.getChildren().add(new trangchinh(Lop.getLop3().getText()));
    }
    public void eventLop4(EventHandler<ActionEvent> eventHandler) {
        Lop.getLop4().setOnAction(eventHandler);
    }
    public void setLop4(){
        background.getChildren().removeAll(Lop);
        background.getChildren().add(new trangchinh(Lop.getLop4().getText()));
    }
    public void eventLop5(EventHandler<ActionEvent> eventHandler) {
        Lop.getLop5().setOnAction(eventHandler);
    }
    public void setLop5(){
        background.getChildren().removeAll(Lop);
        background.getChildren().add(new trangchinh(Lop.getLop5().getText()));
    }
    public void eventLop6(EventHandler<ActionEvent> eventHandler) {
        Lop.getLop6().setOnAction(eventHandler);
    }
    public void setLop6(){
        background.getChildren().removeAll(Lop);
        background.getChildren().add(new trangchinh(Lop.getLop6().getText()));
    }
    public void eventLop7(EventHandler<ActionEvent> eventHandler) {
        Lop.getLop7().setOnAction(eventHandler);
    }
    public void setLop7(){
        background.getChildren().removeAll(Lop);
        background.getChildren().add(new trangchinh(Lop.getLop7().getText()));
    }
    public void eventLop8(EventHandler<ActionEvent> eventHandler) {
        Lop.getLop8().setOnAction(eventHandler);
    }
    public void setLop8(){
        background.getChildren().removeAll(Lop);
        background.getChildren().add(new trangchinh(Lop.getLop8().getText()));
    }
    public void eventLop9(EventHandler<ActionEvent> eventHandler) {
        Lop.getLop9().setOnAction(eventHandler);
    }
    public void setLop9(){
        background.getChildren().removeAll(Lop);
        background.getChildren().add(new trangchinh(Lop.getLop9().getText()));
    }
    public void eventLop10(EventHandler<ActionEvent> eventHandler) {
        Lop.getLop10().setOnAction(eventHandler);
    }
    public void setLop10(){
        background.getChildren().removeAll(Lop);
        background.getChildren().add(new trangchinh(Lop.getLop10().getText()));
    }
    public void eventLop11(EventHandler<ActionEvent> eventHandler) {
        Lop.getLop11().setOnAction(eventHandler);
    }
    public void setLop11(){
        background.getChildren().removeAll(Lop);
        background.getChildren().add(new trangchinh(Lop.getLop11().getText()));
    }
    public void eventLop12(EventHandler<ActionEvent> eventHandler) {
        Lop.getLop12().setOnAction(eventHandler);
    }
    public void setLop12(){
        background.getChildren().removeAll(Lop);
        background.getChildren().add(new trangchinh(Lop.getLop12().getText()));
    }
    
}