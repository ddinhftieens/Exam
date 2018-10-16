/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toJDBC;

/**
 *
 * @author Dell
 */
public class question {
    private int ID;
    private String cauhoi,A,B,C,D,answer;

    public question(int ID, String cauhoi, String A, String B, String C, String D,String answer) {
        this.ID = ID;
        this.cauhoi = cauhoi;
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
        this.answer = answer;
    }

    public int getID() {
        return ID;
    }

    public String getCauhoi() {
        return cauhoi;
    }

    public String getA() {
        return A;
    }

    public String getB() {
        return B;
    }

    public String getC() {
        return C;
    }

    public String getD() {
        return D;
    }

    public String getAnswer() {
        return answer;
    }
    
    @Override
    public String toString(){
        return ID + " " + cauhoi + " "+ A + " " + B + " " + C + " " + D + " " + answer;
    }
}
