/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.view;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Toggle;
import javafx.scene.paint.Color;
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
    private Button button;
    private Scene scene;
    private Label tieude,cauhoi,note;
    private lop Lop;
    private GridPane gridPane;
    private RadioButton A,B,C,D;
    private ToggleGroup toggleGroup;
    protected contro Contro;
    private Date date;
    private int h1,h2,m1,m2,s1,s2;
    private int[] x;
    private trangchinh TrangChinh;
    private List<Button> list;
    
    public View(){
        x = new int[55];
        Lop = new lop();
        background = new Pane();
        background.setMinSize(chieurong, chieucao);
        scene = new Scene(background, chieurong, chieucao);
        
        tieude = new Label();
        tieude.setLayoutX(0);
        tieude.setLayoutY(0);
        tieude.setMinSize(rong_tieude + 10, cao_tieude);
        tieude.setStyle("-fx-background-color: #73ef75");
        tieude.setText("Ôn tập");
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
        
        Contro = new contro();
        list = new ArrayList();
        list = Contro.getList();
    }
    
    public contro getContro() {
        return Contro;
    }
    
    public Scene getScene() {
        return scene;
    }
    
    public void chonbatdau(EventHandler<ActionEvent> eventHandler){
        button.setOnAction(eventHandler);
    }
    public void return_background(){
        background.getChildren().removeAll(Contro);
        background.getChildren().add(Lop);
    }
    public void background2(){
        background.getChildren().removeAll(tieude,muc);
        background.getChildren().add(Lop);
        note = new Label();
        note.setText("Nguyen Dinh Tien\n" + "19/10/2018");
        note.setTextFill(Color.BLACK);
        note.setFont(new Font(60));
        note.setAlignment(Pos.CENTER);
        note.setStyle("-fx-background-color: #cccccc");
        note.setLayoutX(10);
        note.setLayoutY(120);
        note.setMinSize(1190, 480);
        background.getChildren().add(note);
    }
    public void eventToan(EventHandler<ActionEvent> eventHandler){
        Lop.getToan().setOnAction(eventHandler);
    }
    public void eventLi(EventHandler<ActionEvent> eventHandler){
        Lop.getLi().setOnAction(eventHandler);
    }
    public void set(String name){
        TrangChinh = new trangchinh(name);
        background.getChildren().removeAll(Lop,note);    
        background.getChildren().add(TrangChinh);
        Contro.setLayoutX(10);
        Contro.setLayoutY(120);
        Contro.setMinSize(230, 480);
        background.getChildren().add(Contro);
        note = new Label();
        note.setText("- Trên con đường thành công không có dấu chân của người lười biếng!");
        note.setAlignment(Pos.CENTER);
        note.setFont(new Font(60));
        note.setWrapText(true);
        note.setTextFill(Color.RED);
        note.setLayoutX(250);
        note.setLayoutY(120);
        note.setPrefSize(950, 480);
        note.setStyle("-fx-background-color: #cccccc");
        background.getChildren().add(note);
    }
    
    public void setCau(question Question,int t,int k){
        toggleGroup = new ToggleGroup();
        gridPane = new GridPane();
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setPadding(new Insets(10));
        gridPane.setLayoutX(250);
        gridPane.setLayoutY(120);
        gridPane.setPrefSize(950, 480);
        gridPane.setStyle("-fx-background-color: #cccccc");
        cauhoi = new Label(Question.getCauhoi());
        cauhoi.setFont(new Font(30));
        cauhoi.setWrapText(true);
        A = new RadioButton(Question.getA());
        A.setFont(new Font(20));
        A.setWrapText(true);
        B = new RadioButton(Question.getB());
        B.setFont(new Font(20));
        B.setWrapText(true);
        C = new RadioButton(Question.getC());
        C.setFont(new Font(20));
        C.setWrapText(true);
        D = new RadioButton(Question.getD());
        D.setFont(new Font(20));
        D.setWrapText(true);
        A.setUserData(1);
        B.setUserData(2);
        C.setUserData(3);
        D.setUserData(4);
        A.setToggleGroup(toggleGroup);
        B.setToggleGroup(toggleGroup);
        C.setToggleGroup(toggleGroup);
        D.setToggleGroup(toggleGroup);
        switch (t) {
            case 1:
                A.setSelected(true);
                break;
            case 2:
                B.setSelected(true);
                break;
            case 3:
                C.setSelected(true);
                break;
            case 4:
                D.setSelected(true);
                break;
            default:
                break;
        }
        toggleGroup.selectedToggleProperty().addListener(new ChangeListener<Toggle>(){
            @Override
            public void changed(ObservableValue<? extends Toggle> ob,Toggle o, Toggle n){
                RadioButton rb = (RadioButton)toggleGroup.getSelectedToggle();
                if (rb != null) { 
                    x[k] = (int) rb.getUserData();
                }
            }
        });
        gridPane.add(cauhoi,0,1,2,1);
        gridPane.add(A, 0, 2,2,1);
        gridPane.add(B, 0, 3,2,1);
        gridPane.add(C, 0, 4,2,1);
        gridPane.add(D, 0, 5,2,1);
        background.getChildren().add(gridPane);
    }
    public int[] getX() {
        return x;
    }

    public Pane getBackground() {
        return background;
    }
    
    public void start(EventHandler<ActionEvent> eventHandler){
        Contro.getBatdau().setOnAction(eventHandler);
    }
    public void theEnd(EventHandler<ActionEvent> eventHandler){
        Contro.getNopbai().setOnAction(eventHandler);
    }
    public ToggleGroup getToggleGroup() {
        return toggleGroup;
    }
    
    public void setStart(){
        date = new Date();
        h1 = date.getHours();
        m1 = date.getMinutes();
        s1 = date.getSeconds();
        Contro.getChildren().remove(Contro.getBatdau());
        background.getChildren().remove(note);
        int k=0;
        for(int i=0;i<10;i++){
            for(int j=0;j<5;j++){
                Contro.add(list.get(k++), j, i);
            }
        }
        Contro.add(Contro.getNopbai(), 0, 10, 3, 1);
        Contro.add(new Label("Start: " + date.getHours() +":"+ date.getMinutes() +":"+ date.getSeconds()),0 ,11 ,4 ,1 );
        
    }
    public void setTheEnd(){
        date = new Date();
        s2 = date.getSeconds();
        m2 = date.getMinutes();
        h2 = date.getHours();
        Contro.add(new Label("End: " + date.getHours() +":"+ date.getMinutes() +":"+ date.getSeconds()),0 ,12 ,4 ,1 );
        Contro.getChildren().remove(Contro.getNopbai());
        int giay2 = h2*3600+m2*60+s2;
        int giay1 = h1*3600+m1*60+s1;
        int giay = giay2 - giay1;
        int h = giay/3600;
        int m = (giay-h*3600)/60;
        int s = giay - m*60 - h*3600;
        Contro.add(new Label("Thời gian làm bài: " + h +":"+ m +":"+ s ), 0, 10,4,1);  
    }
    public void cau_X(int i,EventHandler<ActionEvent> eventHandler){
            list.get(i).setOnAction(eventHandler);  
    }
    public List<Button> getList() {
        return list;
    }
    
    public void eventHoa(EventHandler<ActionEvent> eventHandler){
        Lop.getHoa().setOnAction(eventHandler);
    }
    public void eventLop1(EventHandler<ActionEvent> eventHandler) {
        Lop.getLop1().setOnAction(eventHandler);
    }
    public void eventLop2(EventHandler<ActionEvent> eventHandler) {
        Lop.getLop2().setOnAction(eventHandler);
    }
    public void eventLop3(EventHandler<ActionEvent> eventHandler) {
        Lop.getLop3().setOnAction(eventHandler);
    }
    public void eventLop4(EventHandler<ActionEvent> eventHandler) {
        Lop.getLop4().setOnAction(eventHandler);
    }
    public void eventLop5(EventHandler<ActionEvent> eventHandler) {
        Lop.getLop5().setOnAction(eventHandler);
    }
    public void eventLop6(EventHandler<ActionEvent> eventHandler) {
        Lop.getLop6().setOnAction(eventHandler);
    }
    public void eventLop7(EventHandler<ActionEvent> eventHandler) {
        Lop.getLop7().setOnAction(eventHandler);
    }
    public void eventLop8(EventHandler<ActionEvent> eventHandler) {
        Lop.getLop8().setOnAction(eventHandler);
    }
    public void eventLop9(EventHandler<ActionEvent> eventHandler) {
        Lop.getLop9().setOnAction(eventHandler);
    }
    public void eventLop10(EventHandler<ActionEvent> eventHandler) {
        Lop.getLop10().setOnAction(eventHandler);
    }
    public void eventLop11(EventHandler<ActionEvent> eventHandler) {
        Lop.getLop11().setOnAction(eventHandler);
    }
    public void eventLop12(EventHandler<ActionEvent> eventHandler) {
        Lop.getLop12().setOnAction(eventHandler);
    }
}