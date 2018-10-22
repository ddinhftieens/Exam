/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import toJDBC.question;
import toJDBC.run;

/**
 *
 * @author Dell
 */
public class gancauhoi{
    private run Run;
    private List<question> list;
    private List<question> question;
    private Random rd;
    
    public gancauhoi(String jdbc, String bang){
        int k = 50;
        Run = new run(jdbc,bang);
        list = new ArrayList();  
        list = Run.getList();
        question = new ArrayList();
        rd = new Random();
        while(!list.isEmpty()&& k-- >0){
            int index = rd.nextInt(list.size());
            question.add(list.get(index));
            list.remove(index);
        }
    }
    
    public List<question> getCauhoi() {
        return question;
    }
}
