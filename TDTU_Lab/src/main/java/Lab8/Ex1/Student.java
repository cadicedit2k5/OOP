/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8.Ex1;

/**
 *
 * @author ADMIN
 */
public class Student extends Person {
    private String id;
    private int score;
    
    public Student(String id, int score, String name, int birthYear) {
        super(name, birthYear);
        this.id = id;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    @Override
    public String toString() {
        return "Student[id=" + this.id + ", score=" + this.score + "]";
    }
}
