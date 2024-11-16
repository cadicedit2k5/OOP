/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AssignmentRequirement;

import java.util.List;

/**
 *
 * @author ADMIN
 */
public class Resort extends CommonAccomodation{
    private int ratingStar;
    private boolean isServingSwimingPool;

    public Resort(int ratingStar, boolean isServingSwimingPool, float coeffRating, int idAccomodation, String nameAccomodation, String addressAccomodation, String cityAccomodaion) {
        super(coeffRating, idAccomodation, nameAccomodation, addressAccomodation, cityAccomodaion);
        this.ratingStar = ratingStar;
        this.isServingSwimingPool = isServingSwimingPool;
    }

    public Resort(int ratingStar, boolean isServingSwimingPool, float coeffRating, List<Room> rooms, int idAccomodation, String nameAccomodation, String addressAccomodation, String cityAccomodaion) {
        super(coeffRating, rooms, idAccomodation, nameAccomodation, addressAccomodation, cityAccomodaion);
        this.ratingStar = ratingStar;
        this.isServingSwimingPool = isServingSwimingPool;
    }
    
    @Override
    public String toString() {
        return String.format("Resort [%d, %s, %d, %s, %b, %s",
                super.getIdAccomodation(), super.getNameAccomodation(), this.ratingStar,
                super.getAddressAccomodation(), this.isServingSwimingPool, super.getCityAccomodaion());
    }

    public int getRatingStar() {
        return ratingStar;
    }

    public void setRatingStar(int ratingStar) {
        this.ratingStar = ratingStar;
    }

    public boolean isIsServingSwimingPool() {
        return isServingSwimingPool;
    }

    public void setIsServingSwimingPool(boolean isServingSwimingPool) {
        this.isServingSwimingPool = isServingSwimingPool;
    }
}
