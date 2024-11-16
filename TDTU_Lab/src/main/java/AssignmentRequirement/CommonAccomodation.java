/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AssignmentRequirement;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class CommonAccomodation extends Accomodation{
    private List<Room> rooms = new ArrayList<>();
    private float coeffRating;

    public CommonAccomodation(float coeffRating, int idAccomodation, String nameAccomodation, String addressAccomodation, String cityAccomodaion) {
        super(idAccomodation, nameAccomodation, addressAccomodation, cityAccomodaion);
        this.coeffRating = coeffRating;
    }
    public CommonAccomodation(float coeffRating, List<Room> rooms, int idAccomodation, String nameAccomodation, String addressAccomodation, String cityAccomodaion) {
        super(idAccomodation, nameAccomodation, addressAccomodation, cityAccomodaion);
        this.coeffRating = coeffRating;
        this.rooms = rooms;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public float getCoeffRating() {
        return coeffRating;
    }

    public void setCoeffRating(float coeffRating) {
        this.coeffRating = coeffRating;
    }
}
