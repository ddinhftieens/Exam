/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toJDBC;

import java.util.Comparator;

/**
 *
 * @author Dell
 */
public class sortmaQuestion implements Comparator<question>{
    @Override
    public int compare(question a, question b){
        return a.getID() - b.getID();
    }
}
