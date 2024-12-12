/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AssignmentRequirement;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Resort extends CommonAccommodation{
    private int ratingStar;
    private boolean isServingSwimmingPool;

    public Resort(int idAccomodation, String nameAccomodation, String addressAccomodation, String cityAccomodaion, ArrayList<Room> rooms, float coeffRating, int ratingStar, boolean isServingSwimmingPool) {
        super(idAccomodation, nameAccomodation, addressAccomodation, cityAccomodaion, rooms, coeffRating);
        this.ratingStar = ratingStar;
        this.isServingSwimmingPool = isServingSwimmingPool;
    }

    public Resort(int idAccomodation, String nameAccomodation, String addressAccomodation, String cityAccomodaion, float coeffRating, int ratingStar, boolean isServingSwimmingPool) {
        super(idAccomodation, nameAccomodation, addressAccomodation, cityAccomodaion, coeffRating);
        this.ratingStar = ratingStar;
        this.isServingSwimmingPool = isServingSwimmingPool;
    }
    
    @Override
    public String toString() {
        return String.format("Resort [%d, %s, %d, %s, %b, %s",
                idAccomodation, nameAccomodation, this.getRatingStar(),
                addressAccomodation, this.isServingSwimmingPool, cityAccomodaion);
    }

    public int getRatingStar() {
        return ratingStar;
    }

    public void setRatingStar(int ratingStar) {
        this.ratingStar = ratingStar;
    }

    public boolean isIsServingSwimmingPool() {
        return isServingSwimmingPool;
    }

    public void setIsServingSwimmingPool(boolean isServingSwimmingPool) {
        this.isServingSwimmingPool = isServingSwimmingPool;
    }

    
}
