/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import javafx.application.Application;
import javafx.stage.Stage;
import main.view.View;

/**
 *
 * @author Dell
 */
public class main extends Application{
    private View view;
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage){
        
        view = new View();
        primaryStage.setTitle("The first product");
        primaryStage.setScene(view.getScene());
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
