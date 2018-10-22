/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toJDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class run {
    private List<question> list;
    public run(String jdbc, String bang){
//        List<question> list = new ArrayList<>();
        list = new ArrayList();
        connection conn = new connection();
        Connection connection = conn.getconnection(jdbc);
        try {
            Statement stm = connection.createStatement();
            ResultSet  rul = stm.executeQuery(bang);
            while(rul.next()){
                list.add(new question(rul.getInt(1),rul.getString(2),rul.getString(3),rul.getString(4),rul.getString(5),rul.getString(6),rul.getString(7)));
            }
//            Collections.sort(list,new sortmaQuestion());
            
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(run.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<question> getList() {
        return list;
    }
    
}
