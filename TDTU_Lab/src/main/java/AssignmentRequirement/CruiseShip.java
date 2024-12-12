/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AssignmentRequirement;

/**
 *
 * @author ADMIN
 */
public class CruiseShip extends LuxuryAccommodation {
    private boolean isServingPrivateBar;
    
    public CruiseShip(int idAccomodation, String nameAccomodation, String addressAccomodation, String cityAccomodaion, boolean isServingPersonalPool, boolean isServingGrettingFood, boolean isServingFreeBreakfast, boolean isServingBodyBuildingRoom, int maxPeopleCanServe, int costForANight, boolean isServingPrivateBar) {
        super(idAccomodation, nameAccomodation, addressAccomodation, cityAccomodaion, isServingPersonalPool, isServingGrettingFood, isServingFreeBreakfast, isServingBodyBuildingRoom, maxPeopleCanServe, costForANight);
        this.isServingPrivateBar = isServingPrivateBar;
    }
    
    @Override
    public String toString() {
        return String.format("CruiseShip [%d, %s, %s, %s, %b, %b, %b, %b, %b", idAccomodation, nameAccomodation, addressAccomodation, cityAccomodaion, this.isIsServingPrivateBar(), super.isIsServingPersonalPool(), super.isIsServingGrettingFood(), super.isIsServingFreeBreakfast(), super.isIsServingBodyBuildingRoom());
    }
    
    public boolean isIsServingPrivateBar() {
        return isServingPrivateBar;
    }

    public void setIsServingPrivateBar(boolean isServingPrivateBar) {
        this.isServingPrivateBar = isServingPrivateBar;
    }
}
