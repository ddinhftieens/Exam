/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author Dell
 */
import java.util.ArrayList;
import java.util.List;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import main.view.*;
import toJDBC.question;

public class controller {
    private View view;
    private gancauhoi ganCauHoi;
    private List<question> list;
    private int last;
    private tinhDiem TinhDiem;
    
    public controller(View vieww){
        this.view = vieww;
        
        view.chonbatdau(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                view.background2();
            }
        });
        view.eventLop1(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                view.set("Lớp 1");
            }
        });
        view.eventLop2(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                view.set("Lớp 2");
            }
        });
        view.eventLop3(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                view.set("Lớp 3");
            }
        });
        view.eventLop4(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                view.set("Lớp 4");
            }
        });
        view.eventLop5(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                view.set("Lớp 5");
            }
        });
        view.eventLop6(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                view.set("Lớp 6");
            }
        });
        view.eventLop7(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                view.set("Lớp 7");
            }
        });
        view.eventLop8(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                view.set("Lớp 8");
            }
        });
        view.eventLop9(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                view.set("Lớp 9");
            }
        });
        view.eventLop10(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                view.set("Lớp 10");
            }
        });
        view.eventLop11(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                view.set("Lớp 11");
            }
        });
        view.eventLop12(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                view.set("Lớp 12");
            }
        });
        view.eventToan(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                view.set("Toán");
            }
        });
        view.eventLi(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                String jdbc = "jdbc:sqlserver://DESKTOP-7946KH9:1433;databaseName=MonLi";
                String bang = "select * from cauhoi";
                view.set("Lý");
                ganCauHoi = new gancauhoi(jdbc,bang);
                list = new ArrayList();
                list = ganCauHoi.getCauhoi();
            }
        });
        view.eventHoa(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                String jdbc = "jdbc:sqlserver://DESKTOP-7946KH9:1433;databaseName=MonLi";
                String bang = "select * from cauhoi";
                view.set("Hóa");
                ganCauHoi = new gancauhoi(jdbc,bang);
                list = new ArrayList();
                list = ganCauHoi.getCauhoi();
            }
        });
        
        view.cau1(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                    
                    view.setCau(list.get(0), view.getX()[0],0);
            }
        });
        view.cau2(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                
                
                view.setCau(list.get(1), view.getX()[1],1);
            }
        });
        view.cau3(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                
                
                view.setCau(list.get(2), view.getX()[2],2);
            }
        });
        view.cau4(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                
                
                view.setCau(list.get(3), view.getX()[3],3);
            }
        });
        view.start(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                view.setStart();
            }
        });
        view.theEnd(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                view.setTheEnd();
                TinhDiem = new tinhDiem(view.getX(),list);
                TinhDiem.setVgap(10);
                TinhDiem.setPadding(new Insets(10));
                TinhDiem.setLayoutX(250);
                TinhDiem.setLayoutY(120);
                TinhDiem.setPrefSize(950, 480);
                TinhDiem.setStyle("-fx-background-color: #cccccc");
                view.getBackground().getChildren().add(TinhDiem);
            }
        });
    }
}
