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
    private tinhDiem TinhDiem;
    private int i;

    public controller(View vieww) {
        this.view = vieww;
        view.chonbatdau(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                view.background2();
            }
        });
        view.eventLop1(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                view.set("Lớp 1");
                String jdbc = "jdbc:sqlserver://DESKTOP-7946KH9:1433;databaseName=MonLi";
                String bang = "select * from toan_lop_1";
                ganCauHoi = new gancauhoi(jdbc, bang);
                list = new ArrayList();
                list = ganCauHoi.getCauhoi();
            }
        });
        view.eventLop2(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                view.set("Lớp 2");
                String jdbc = "jdbc:sqlserver://DESKTOP-7946KH9:1433;databaseName=MonLi";
                String bang = "select * from toan_lop_1";
                ganCauHoi = new gancauhoi(jdbc, bang);
                list = new ArrayList();
                list = ganCauHoi.getCauhoi();
            }
        });
        view.eventLop3(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                view.set("Lớp 3");
                String jdbc = "jdbc:sqlserver://DESKTOP-7946KH9:1433;databaseName=MonLi";
                String bang = "select * from toan_lop_1";
                ganCauHoi = new gancauhoi(jdbc, bang);
                list = new ArrayList();
                list = ganCauHoi.getCauhoi();
            }
        });
        view.eventLop4(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                view.set("Lớp 4");
                String jdbc = "jdbc:sqlserver://DESKTOP-7946KH9:1433;databaseName=MonLi";
                String bang = "select * from toan_lop_1";
                ganCauHoi = new gancauhoi(jdbc, bang);
                list = new ArrayList();
                list = ganCauHoi.getCauhoi();
            }
        });
        view.eventLop5(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                view.set("Lớp 5");
                String jdbc = "jdbc:sqlserver://DESKTOP-7946KH9:1433;databaseName=MonLi";
                String bang = "select * from toan_lop_1";
                ganCauHoi = new gancauhoi(jdbc, bang);
                list = new ArrayList();
                list = ganCauHoi.getCauhoi();
            }
        });
        view.eventLop6(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                view.set("Lớp 6");
                String jdbc = "jdbc:sqlserver://DESKTOP-7946KH9:1433;databaseName=MonLi";
                String bang = "select * from toan_lop_1";
                ganCauHoi = new gancauhoi(jdbc, bang);
                list = new ArrayList();
                list = ganCauHoi.getCauhoi();
            }
        });
        view.eventLop7(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                view.set("Lớp 7");
                String jdbc = "jdbc:sqlserver://DESKTOP-7946KH9:1433;databaseName=MonLi";
                String bang = "select * from toan_lop_1";
                ganCauHoi = new gancauhoi(jdbc, bang);
                list = new ArrayList();
                list = ganCauHoi.getCauhoi();
            }
        });
        view.eventLop8(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                view.set("Lớp 8");
                String jdbc = "jdbc:sqlserver://DESKTOP-7946KH9:1433;databaseName=MonLi";
                String bang = "select * from toan_lop_1";
                ganCauHoi = new gancauhoi(jdbc, bang);
                list = new ArrayList();
                list = ganCauHoi.getCauhoi();
            }
        });
        view.eventLop9(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                view.set("Lớp 9");
                String jdbc = "jdbc:sqlserver://DESKTOP-7946KH9:1433;databaseName=MonLi";
                String bang = "select * from toan_lop_1";
                ganCauHoi = new gancauhoi(jdbc, bang);
                list = new ArrayList();
                list = ganCauHoi.getCauhoi();
            }
        });
        view.eventLop10(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                view.set("Lớp 10");
                String jdbc = "jdbc:sqlserver://DESKTOP-7946KH9:1433;databaseName=MonLi";
                String bang = "select * from toan_lop_1";
                ganCauHoi = new gancauhoi(jdbc, bang);
                list = new ArrayList();
                list = ganCauHoi.getCauhoi();
            }
        });
        view.eventLop11(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                view.set("Lớp 11");
                String jdbc = "jdbc:sqlserver://DESKTOP-7946KH9:1433;databaseName=MonLi";
                String bang = "select * from toan_lop_1";
                ganCauHoi = new gancauhoi(jdbc, bang);
                list = new ArrayList();
                list = ganCauHoi.getCauhoi();
            }
        });
        view.eventLop12(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                view.set("Lớp 12");
                String jdbc = "jdbc:sqlserver://DESKTOP-7946KH9:1433;databaseName=MonLi";
                String bang = "select * from toan_lop_1";
                ganCauHoi = new gancauhoi(jdbc, bang);
                list = new ArrayList();
                list = ganCauHoi.getCauhoi();
            }
        });
        view.eventToan(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                view.set("Toán");
                String jdbc = "jdbc:sqlserver://DESKTOP-7946KH9:1433;databaseName=MonLi";
                String bang = "select * from toan_lop_1";
                ganCauHoi = new gancauhoi(jdbc, bang);
                list = new ArrayList();
                list = ganCauHoi.getCauhoi();
            }
        });
        view.eventLi(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                view.set("Lý");
                String jdbc = "jdbc:sqlserver://DESKTOP-7946KH9:1433;databaseName=MonLi";
                String bang = "select * from toan_lop_1";
                ganCauHoi = new gancauhoi(jdbc, bang);
                list = new ArrayList();
                list = ganCauHoi.getCauhoi();
            }
        });
        view.eventHoa(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                view.set("Hóa");
                String jdbc = "jdbc:sqlserver://DESKTOP-7946KH9:1433;databaseName=MonLi";
                String bang = "select * from toan_lop_1";
                ganCauHoi = new gancauhoi(jdbc, bang);
                list = new ArrayList();
                list = ganCauHoi.getCauhoi();
            }
        });

        for (i = 0; i < 50; i++) {
            view.cau_X(i, new EventHandler<ActionEvent>() {
                int k = i;
                @Override
                public void handle(ActionEvent event) {
                    view.setCau(list.get(k), view.getX()[k], k);
                }
            });
        }
        view.return_background(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                view.getBackground().getChildren().clear();
                view.return_background();
                view.setOK(true);
            }
        });
        view.start(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                view.setStart();
            }
        });
        view.theEnd(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                view.setTheEnd();
                TinhDiem = new tinhDiem(view.getX(), list);
                TinhDiem.setVgap(10);
                TinhDiem.setPadding(new Insets(10));
                TinhDiem.setLayoutX(250);
                TinhDiem.setLayoutY(120);
                TinhDiem.setPrefSize(950, 480);
                TinhDiem.setStyle("-fx-background-color: #cccccc");
                view.getBackground().getChildren().add(TinhDiem);
                for(int t=0;t<TinhDiem.getWrong().size();t++){
                    view.getList().get(TinhDiem.getWrong().get(t)).setStyle("");
                }
                view.setOK(false);
            }
        });
    }
}
