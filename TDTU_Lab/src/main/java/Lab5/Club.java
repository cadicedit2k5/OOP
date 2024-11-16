/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5;

/**
 *
 * @author ADMIN
 */
public class Club {
    private String name;
    private int wins;
    private int draws;
    private int losses;

    public Club() {
        this.name = "";
        this.wins = 0;
        this.draws = 0;
        this.losses = 0;
    }

    public Club(String name, int wins, int draws, int losses) {
        this.name = name;
        this.wins = wins;
        this.draws = draws;
        this.losses = losses;
    }
    
    public int numMatchesPlayed() {
        return this.wins + this.draws + this.losses;
    }
    
    public boolean isFinish() {
        return numMatchesPlayed() >= 10;
    }
    
    public int getPoints() {
        return this.wins * 3 + this.draws * 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }
    
    
    @Override
    public String toString() {
        return this.name + " club: " + this.wins + "/" + this.draws
                + "/" + this.losses + " - " + this.getPoints();
    }
    
    public static void main(String[] args) {
        Club cb = new Club("Chelsa", 1, 2, 0);
        System.out.println(cb);
    }
}
