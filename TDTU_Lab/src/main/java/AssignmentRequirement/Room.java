/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AssignmentRequirement;

/**
 *
 * @author ADMIN
 */
public class Room {
    private int roomID;
    private String roomName;
    private int numFloor;
    private String roomType;
    private int numBed;
    private int maxPeople;
    private double roomArea;
    private double roomCost;

    public Room(int roomID, String roomName, int numFloor, String roomType, int numBed, int maxPeople, double roomArea, double roomCost) {
        this.roomID = roomID;
        this.roomName = roomName;
        this.numFloor = numFloor;
        this.roomType = roomType;
        this.numBed = numBed;
        this.maxPeople = maxPeople;
        this.roomArea = roomArea;
        this.roomCost = roomCost;
    }
    
    @Override
    public String toString() {
        return String.format("Room[%d, %s, %d, %s, %d, %d, %.1f, %.1f",
                this.roomID, this.roomName, this.numFloor, this.roomType,
                this.numBed, this.maxPeople, this.roomArea, this.roomCost);
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getNumFloor() {
        return numFloor;
    }

    public void setNumFloor(int numFloor) {
        this.numFloor = numFloor;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumBed() {
        return numBed;
    }

    public void setNumBed(int numBed) {
        this.numBed = numBed;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public double getRoomArea() {
        return roomArea;
    }

    public void setRoomArea(double roomArea) {
        this.roomArea = roomArea;
    }

    public double getRoomCost() {
        return roomCost;
    }

    public void setRoomCost(double roomCost) {
        this.roomCost = roomCost;
    }    
}
