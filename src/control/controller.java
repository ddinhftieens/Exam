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
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import main.view.View;

public class controller {
    private View view;
    
    public controller(View vieww){
        this.view = vieww;
        view.chonbatdau(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                view.background2();
            }
        });
    }
}
