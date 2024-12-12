/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AssignmentRequirement;

/**
 *
 * @author ADMIN
 */
public class LuxuryAccommodation extends Accommodation {

    private boolean isServingPersonalPool;
    private boolean isServingGrettingFood;
    private boolean isServingFreeBreakfast;
    private boolean isServingBodyBuildingRoom;

    private int maxPeopleCanServe;
    private int costForANight;

    public LuxuryAccommodation(int idAccomodation, String nameAccomodation, String addressAccomodation, String cityAccomodaion) {
        super(idAccomodation, nameAccomodation, addressAccomodation, cityAccomodaion);
    }

    public LuxuryAccommodation(int idAccomodation, String nameAccomodation, String addressAccomodation, String cityAccomodaion, boolean isServingPersonalPool, boolean isServingGrettingDrink, boolean isServingFreeBreakfast, boolean isServingBodyBuildingRoom, int maxPeopleCanServe, int costForANight) {
        super(idAccomodation, nameAccomodation, addressAccomodation, cityAccomodaion);
        this.isServingPersonalPool = isServingPersonalPool;
        this.isServingGrettingFood = isServingGrettingDrink;
        this.isServingFreeBreakfast = isServingFreeBreakfast;
        this.isServingBodyBuildingRoom = isServingBodyBuildingRoom;
        this.maxPeopleCanServe = maxPeopleCanServe;
        this.costForANight = costForANight;
    }

    public boolean isIsServingPersonalPool() {
        return isServingPersonalPool;
    }

    public void setIsServingPersonalPool(boolean isServingPersonalPool) {
        this.isServingPersonalPool = isServingPersonalPool;
    }

    public boolean isIsServingGrettingFood() {
        return isServingGrettingFood;
    }

    public void setIsServingGrettingFood(boolean isServingGrettingFood) {
        this.isServingGrettingFood = isServingGrettingFood;
    }

    public boolean isIsServingFreeBreakfast() {
        return isServingFreeBreakfast;
    }

    public void setIsServingFreeBreakfast(boolean isServingFreeBreakfast) {
        this.isServingFreeBreakfast = isServingFreeBreakfast;
    }

    public boolean isIsServingBodyBuildingRoom() {
        return isServingBodyBuildingRoom;
    }

    public void setIsServingBodyBuildingRoom(boolean isServingBodyBuildingRoom) {
        this.isServingBodyBuildingRoom = isServingBodyBuildingRoom;
    }

    public int getMaxPeopleCanServe() {
        return maxPeopleCanServe;
    }

    public void setMaxPeopleCanServe(int maxPeopleCanServe) {
        this.maxPeopleCanServe = maxPeopleCanServe;
    }

    public int getCostForANight() {
        return costForANight;
    }

    public void setCostForANight(int costForANight) {
        this.costForANight = costForANight;
    }
}
