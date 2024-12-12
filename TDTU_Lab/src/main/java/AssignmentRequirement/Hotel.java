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
public class Hotel extends CommonAccommodation {
    private int rateStarHotel;
    
    public Hotel(int idAccomodation, String nameAccomodation, String addressAccomodation, String cityAccomodaion, ArrayList<Room> rooms, float coeffRating, int rateStarHotel) {
        super(idAccomodation, nameAccomodation, addressAccomodation, cityAccomodaion, rooms, coeffRating);
        this.rateStarHotel = rateStarHotel;
    }
    
    public Hotel(int idAccomodation, String nameAccomodation, String addressAccomodation, String cityAccomodaion, float coeffRating, int rateStarHotel) {
        super(idAccomodation, nameAccomodation, addressAccomodation, cityAccomodaion, coeffRating);
        this.rateStarHotel = rateStarHotel;
    }
    
    @Override
    public String toString() {
        return String.format("Hotel [%d, %d, %s, %s, %s", idAccomodation, this.rateStarHotel, nameAccomodation, addressAccomodation, cityAccomodaion);
    }

    public int getRateStarHotel() {
        return rateStarHotel;
    }

    public void setRateStarHotel(int rateStarHotel) {
        this.rateStarHotel = rateStarHotel;
    }
    
}
