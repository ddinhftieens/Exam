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
import main.view.*;
import toJDBC.question;

public class controller {
    private View view;
    private gancauhoi ganCauHoi;
    private List<question> list;
    
    public controller(View vieww){
        ganCauHoi = new gancauhoi();
        list = new ArrayList();
        list = ganCauHoi.getCauhoi();
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
                view.setLop1();
            }
        });
        view.eventLop2(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                view.setLop2();
            }
        });
        view.eventLop3(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                view.setLop3();
            }
        });
        view.eventLop4(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                view.setLop4();
            }
        });
        view.eventLop5(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                view.setLop5();
            }
        });
        view.eventLop6(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                view.setLop6();
            }
        });
        view.eventLop7(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                view.setLop7();
            }
        });
        view.eventLop8(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                view.setLop8();
            }
        });
        view.eventLop9(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                view.setLop9();
            }
        });
        view.eventLop10(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                view.setLop10();
            }
        });
        view.eventLop11(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                view.setLop11();
            }
        });
        view.eventLop12(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                view.setLop12();
            }
        });
        view.eventToan(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                view.setToan();
            }
        });
        view.eventLi(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                view.setLi();
            }
        });
        view.eventHoa(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                view.setHoa();
            }
        });
        view.cau1(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                view.setCau(list.get(0));
            }
        });
        view.cau2(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                view.setCau(list.get(1));
            }
        });
        view.cau3(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                view.setCau(list.get(2));
            }
        });
        view.cau4(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                view.setCau(list.get(3));
            }
        });
        view.start(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                view.setStart();
            }
        });
    }
}
