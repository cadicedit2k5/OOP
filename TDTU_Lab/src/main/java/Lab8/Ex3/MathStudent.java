/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8.Ex3;

/**
 *
 * @author ADMIN
 */
public class MathStudent extends Student {
    private String sID;

    public MathStudent(String sID, String sName, double gpa) {
        super(sName, gpa);
        this.sID = sID;
    }

    public String getsID() {
        return sID;
    }

    public void setsID(String sID) {
        this.sID = sID;
    }

    @Override
    public String getRank() {
        double gpa = super.getGpa();
        if (gpa >= 5) return "Passed";
        return "Failed";
    }
    
    @Override
    public String toString() {
        return super.getsName() + " - " + this.sID + " - " + super.getGpa();
    }
}
