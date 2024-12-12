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
public class Homestay extends CommonAccommodation{

    public Homestay(int idAccomodation, String nameAccomodation, String addressAccomodation, String cityAccomodaion, ArrayList<Room> rooms, float coeffRating) {
        super(idAccomodation, nameAccomodation, addressAccomodation, cityAccomodaion, rooms, coeffRating);
    }
    
    public Homestay(int idAccomodation, String nameAccomodation, String addressAccomodation, String cityAccomodaion, float coeffRating) {
        super(idAccomodation, nameAccomodation, addressAccomodation, cityAccomodaion, coeffRating);
    }
    
    @Override
    public String toString() {
        return String.format("Homestay [%d, %s, %s, %.1f, %s", idAccomodation, nameAccomodation, addressAccomodation, super.getCoeffRating(), cityAccomodaion);
    }
}
