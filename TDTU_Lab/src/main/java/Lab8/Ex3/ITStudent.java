/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8.Ex3;

/**
 *
 * @author ADMIN
 */
public class ITStudent extends Student {
    private int sID;

    public ITStudent(int sID, String sName, double gpa) {
        super(sName, gpa);
        this.sID = sID;
    }

    public int getsID() {
        return sID;
    }

    public void setsID(int sID) {
        this.sID = sID;
    }

    @Override
    public String getRank() {
        double gpa = super.getGpa();
        if (gpa <= 5) {
            return "C";
        }else if (gpa  <= 8) {
            return "B";
        }
        else if (gpa <= 10) {
            return "A";
        }else {
            return null;
        }
    }
    
    @Override
    public String toString() {
        return super.getsName() + " - " + this.sID + " - " + super.getGpa();
    }
}
