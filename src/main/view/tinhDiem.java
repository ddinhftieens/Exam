/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.view;

import java.util.ArrayList;
import java.util.List;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import toJDBC.question;

/**
 *
 * @author Dell
 */
public class tinhDiem extends GridPane{
    private GridPane gridPane;
    private Label label,answerWrong;
    private int right;
    private List<Integer> wrong;
    public tinhDiem(int[] x,List<question> list){
        right = 0;
        wrong = new ArrayList();
        for(int i=0;i<50;i++){
            switch (x[i]) {
                case 1:
                    if((int) list.get(i).getAnswer().charAt(0) == 65){
                        right++;
                        
                    }else wrong.add(i);
                    break;
                case 2:
                    if((int) list.get(i).getAnswer().charAt(0) == 66){
                        right++;
                        
                    }else wrong.add(i);
                    break;
                case 3:
                    if((int) list.get(i).getAnswer().charAt(0) == 67){
                        right++;
                        
                    }else wrong.add(i);
                    break;
                case 4:
                    if((int) list.get(i).getAnswer().charAt(0) == 68){
                        right++;
                        
                    }else wrong.add(i);
                    break;
                case 0: wrong.add(i);
                default:
                    break;
            }
        }
        gridPane = new GridPane();
        setVgap(10);
        setHgap(10);
        setPadding(new Insets(15));
        label = new Label();
        label.setText("Tổng số câu hỏi: 50");
        label.setFont(new Font(30));
        add(label,0,0,10,1);
        label = new Label();
        label.setText("Số câu trả lời đúng: " + right);
        label.setFont(new Font(30));
        add(label,0,1,10,1);
        label = new Label();
        label.setText("Các câu trả lời sai và đáp án:                   ");
        label.setFont(new Font(30));
        add(label,0,2,10,1);
        label = new Label();
        label.setText("Điểm");
        label.setFont(new Font(30));
        add(label,10,0);
        label = new Label();
        label.setText(""+ (float)(right*0.2) +"");
        label.setFont(new Font(120));
        label.setTextFill(Color.RED);
        add(label,10,1,1,4);
        int k = 0,t = 3;
        if(wrong.size()>=10) for(int i=0;i<wrong.size()/10;i++){
            for(int j =0;j<10;j++){
                answerWrong = new Label(wrong.get(k)+1+list.get(wrong.get(k++)).getAnswer());
                answerWrong.setTextFill(Color.RED);
                answerWrong.setFont(new Font(15));
                add(answerWrong,j,t);
            }
            t++;
        }
        for(int i = 0;i< wrong.size() - (wrong.size()/10)*10;i++){
            answerWrong = new Label(wrong.get(k)+1+list.get(wrong.get(k++)).getAnswer());
            answerWrong.setTextFill(Color.RED);
            answerWrong.setFont(new Font(15));
            add(answerWrong,i,t);
        }
    }
}
