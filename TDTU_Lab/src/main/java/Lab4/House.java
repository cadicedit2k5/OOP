/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4;

/**
 *
 * @author ADMIN
 */
public class House {
    private String houseCode;
    private int numOfBedRooms;
    private boolean hasSwimmingPool;
    private double area;
    private double costPerSqaureMeter;

    public House() {
        this.houseCode = "A01";
        this.numOfBedRooms = 2;
        this.hasSwimmingPool = false;
        this.area = 0.0;
        this.costPerSqaureMeter = 0.0;
    }

    public House(String houseCode, int numOfBedRooms, boolean hasSwimmingPool, double area, double costPerSqaureMeter) {
        this.houseCode = houseCode;
        this.numOfBedRooms = numOfBedRooms;
        this.hasSwimmingPool = hasSwimmingPool;
        this.area = area;
        this.costPerSqaureMeter = costPerSqaureMeter;
    }
    
    public double calculateSellingPrice() {
        double subTotal = this.area * this.costPerSqaureMeter;
        
        if (this.hasSwimmingPool) {
            subTotal = subTotal + subTotal * 0.15;
        }
        
        return subTotal;
    }

    public String getHouseCode() {
        return houseCode;
    }

    public void setHouseCode(String houseCode) {
        this.houseCode = houseCode;
    }

    public int getNumOfBedRooms() {
        return numOfBedRooms;
    }

    public void setNumOfBedRooms(int numOfBedRooms) {
        this.numOfBedRooms = numOfBedRooms;
    }

    public boolean isHasSwimmingPool() {
        return hasSwimmingPool;
    }

    public void setHasSwimmingPool(boolean hasSwimmingPool) {
        this.hasSwimmingPool = hasSwimmingPool;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCostPerSqaureMeter() {
        return costPerSqaureMeter;
    }

    public void setCostPerSqaureMeter(double costPerSqaureMeter) {
        this.costPerSqaureMeter = costPerSqaureMeter;
    }
    
    @Override
    public String toString() {
        return "House[" + this.houseCode + ", " + this.numOfBedRooms 
                + ", " + this.hasSwimmingPool + ", " + this.calculateSellingPrice() + "]";
    }
}
