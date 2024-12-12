/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AssignmentRequirement;

/**
 *
 * @author ADMIN
 */
public class Villa extends LuxuryAccommodation {
    public Villa(int idAccomodation, String nameAccomodation, String addressAccomodation, String cityAccomodaion, boolean isServingPersonalPool, boolean isServingGrettingFood, boolean isServingFreeBreakfast, boolean isServingBodyBuildingRoom, int maxPeopleCanServe, int costForANight) {
        super(idAccomodation, nameAccomodation, addressAccomodation, cityAccomodaion, isServingPersonalPool, isServingGrettingFood, isServingFreeBreakfast, isServingBodyBuildingRoom, maxPeopleCanServe, costForANight);
    }
    
    @Override
    public String toString() {
        return String.format("Villa [%d, %s, %s, %s, %b, %b, %b, %b, %d, %d", idAccomodation, nameAccomodation, addressAccomodation, cityAccomodaion, super.isIsServingPersonalPool(), super.isIsServingGrettingFood(), super.isIsServingFreeBreakfast(), super.isIsServingBodyBuildingRoom(), super.getMaxPeopleCanServe(), super.getCostForANight());
    }

}
