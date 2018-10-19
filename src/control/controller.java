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
import javafx.scene.control.Label;
import main.view.*;
import toJDBC.question;

public class controller {
    private View view;
    private gancauhoi ganCauHoi;
    private List<question> list;
    private int last;
    private tinhDiem TinhDiem;
    private Label gridPane;
    private trangchinh TrangChinh;
    
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
                String jdbc = "jdbc:sqlserver://DESKTOP-7946KH9:1433;databaseName=MonLi";
                String bang = "select * from toan_lop_1";
                ganCauHoi = new gancauhoi(jdbc,bang);
                list = new ArrayList();
                list = ganCauHoi.getCauhoi();
            }
        });
        view.eventLop2(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                view.set("Lớp 2");
                String jdbc = "jdbc:sqlserver://DESKTOP-7946KH9:1433;databaseName=MonLi";
                String bang = "select * from toan_lop_1";
                ganCauHoi = new gancauhoi(jdbc,bang);
                list = new ArrayList();
                list = ganCauHoi.getCauhoi();
            }
        });
        view.eventLop3(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                view.set("Lớp 3");
                String jdbc = "jdbc:sqlserver://DESKTOP-7946KH9:1433;databaseName=MonLi";
                String bang = "select * from toan_lop_1";
                ganCauHoi = new gancauhoi(jdbc,bang);
                list = new ArrayList();
                list = ganCauHoi.getCauhoi();
            }
        });
        view.eventLop4(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                view.set("Lớp 4");
                String jdbc = "jdbc:sqlserver://DESKTOP-7946KH9:1433;databaseName=MonLi";
                String bang = "select * from toan_lop_1";
                ganCauHoi = new gancauhoi(jdbc,bang);
                list = new ArrayList();
                list = ganCauHoi.getCauhoi();
            }
        });
        view.eventLop5(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                view.set("Lớp 5");
                String jdbc = "jdbc:sqlserver://DESKTOP-7946KH9:1433;databaseName=MonLi";
                String bang = "select * from toan_lop_1";
                ganCauHoi = new gancauhoi(jdbc,bang);
                list = new ArrayList();
                list = ganCauHoi.getCauhoi();
            }
        });
        view.eventLop6(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                view.set("Lớp 6");
                String jdbc = "jdbc:sqlserver://DESKTOP-7946KH9:1433;databaseName=MonLi";
                String bang = "select * from toan_lop_1";
                ganCauHoi = new gancauhoi(jdbc,bang);
                list = new ArrayList();
                list = ganCauHoi.getCauhoi();
            }
        });
        view.eventLop7(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                view.set("Lớp 7");
                String jdbc = "jdbc:sqlserver://DESKTOP-7946KH9:1433;databaseName=MonLi";
                String bang = "select * from toan_lop_1";
                ganCauHoi = new gancauhoi(jdbc,bang);
                list = new ArrayList();
                list = ganCauHoi.getCauhoi();
            }
        });
        view.eventLop8(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                view.set("Lớp 8");
                String jdbc = "jdbc:sqlserver://DESKTOP-7946KH9:1433;databaseName=MonLi";
                String bang = "select * from toan_lop_1";
                ganCauHoi = new gancauhoi(jdbc,bang);
                list = new ArrayList();
                list = ganCauHoi.getCauhoi();
            }
        });
        view.eventLop9(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                view.set("Lớp 9");
                String jdbc = "jdbc:sqlserver://DESKTOP-7946KH9:1433;databaseName=MonLi";
                String bang = "select * from toan_lop_1";
                ganCauHoi = new gancauhoi(jdbc,bang);
                list = new ArrayList();
                list = ganCauHoi.getCauhoi();
            }
        });
        view.eventLop10(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                view.set("Lớp 10");
                String jdbc = "jdbc:sqlserver://DESKTOP-7946KH9:1433;databaseName=MonLi";
                String bang = "select * from toan_lop_1";
                ganCauHoi = new gancauhoi(jdbc,bang);
                list = new ArrayList();
                list = ganCauHoi.getCauhoi();
            }
        });
        view.eventLop11(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                view.set("Lớp 11");
                String jdbc = "jdbc:sqlserver://DESKTOP-7946KH9:1433;databaseName=MonLi";
                String bang = "select * from toan_lop_1";
                ganCauHoi = new gancauhoi(jdbc,bang);
                list = new ArrayList();
                list = ganCauHoi.getCauhoi();
            }
        });
        view.eventLop12(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                view.set("Lớp 12");
                String jdbc = "jdbc:sqlserver://DESKTOP-7946KH9:1433;databaseName=MonLi";
                String bang = "select * from toan_lop_1";
                ganCauHoi = new gancauhoi(jdbc,bang);
                list = new ArrayList();
                list = ganCauHoi.getCauhoi();
            }
        });
        view.eventToan(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                view.set("Toán");
                String jdbc = "jdbc:sqlserver://DESKTOP-7946KH9:1433;databaseName=MonLi";
                String bang = "select * from toan_lop_1";
                ganCauHoi = new gancauhoi(jdbc,bang);
                list = new ArrayList();
                list = ganCauHoi.getCauhoi();
            }
        });
        view.eventLi(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                view.set("Lý");
                String jdbc = "jdbc:sqlserver://DESKTOP-7946KH9:1433;databaseName=MonLi";
                String bang = "select * from toan_lop_1";
                ganCauHoi = new gancauhoi(jdbc,bang);
                list = new ArrayList();
                list = ganCauHoi.getCauhoi();
            }
        });
        view.eventHoa(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                view.set("Hóa");
                String jdbc = "jdbc:sqlserver://DESKTOP-7946KH9:1433;databaseName=MonLi";
                String bang = "select * from toan_lop_1";
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
        view.cau5(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(4), view.getX()[4],4);
            }
        });
        view.cau6(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(5), view.getX()[5],5);
            }
        });
        view.cau7(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(6), view.getX()[6],6);
            }
        });
        view.cau8(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(7), view.getX()[7],7);
            }
        });
        view.cau9(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(8), view.getX()[8],8);
            }
        });
        view.cau10(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(9), view.getX()[9],9);
            }
        });
        view.cau11(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(10), view.getX()[10],10);
            }
        });
        view.cau12(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(11), view.getX()[11],11);
            }
        });
        view.cau13(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(12), view.getX()[12],12);
            }
        });
        view.cau14(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(13), view.getX()[13],13);
            }
        });
        view.cau15(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(14), view.getX()[14],14);
            }
        });
        view.cau16(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(15), view.getX()[15],15);
            }
        });
        view.cau17(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(16), view.getX()[16],16);
            }
        });
        view.cau18(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(17), view.getX()[17],17);
            }
        });
        view.cau19(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(18), view.getX()[18],18);
            }
        });
        view.cau20(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(19), view.getX()[19],19);
            }
        });
        view.cau21(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(20), view.getX()[20],20);
            }
        });
        view.cau22(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(21), view.getX()[21],21);
            }
        });
        view.cau23(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(22), view.getX()[22],2);
            }
        });
        view.cau24(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(23), view.getX()[23],23);
            }
        });
        view.cau25(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(24), view.getX()[24],24);
            }
        });
        view.cau26(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(25), view.getX()[25],25);
            }
        });
        view.cau27(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(26), view.getX()[26],26);
            }
        });
        view.cau28(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(27), view.getX()[27],27);
            }
        });
        view.cau29(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(28), view.getX()[28],28);
            }
        });
        view.cau30(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(29), view.getX()[29],29);
            }
        });
        view.cau31(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(30), view.getX()[30],30);
            }
        });
        view.cau32(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(31), view.getX()[31],31);
            }
        });
        view.cau33(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(32), view.getX()[32],32);
            }
        });
        view.cau34(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(33), view.getX()[33],33);
            }
        });
        view.cau35(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(34), view.getX()[34],34);
            }
        });
        view.cau36(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(35), view.getX()[35],35);
            }
        });
        view.cau37(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(36), view.getX()[36],36);
            }
        });
        view.cau38(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(37), view.getX()[37],37);
            }
        });
        view.cau39(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(38), view.getX()[38],38);
            }
        });
        view.cau40(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(39), view.getX()[39],39);
            }
        });
        view.cau41(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(40), view.getX()[40],40);
            }
        });
        view.cau42(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(41), view.getX()[41],41);
            }
        });
        view.cau43(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(42), view.getX()[42],42);
            }
        });
        view.cau44(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(43), view.getX()[43],43);
            }
        });
        view.cau45(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(44), view.getX()[44],44);
            }
        });
        view.cau46(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(45), view.getX()[45],45);
            }
        });
        view.cau47(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(46), view.getX()[46],46);
            }
        });
        view.cau48(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(47), view.getX()[47],47);
            }
        });
        view.cau49(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(48), view.getX()[48],48);
            }
        });
        view.cau50(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){  
                view.setCau(list.get(49), view.getX()[49],49);
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
