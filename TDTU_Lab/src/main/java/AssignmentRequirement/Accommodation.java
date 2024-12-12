/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AssignmentRequirement;

/**
 *
 * @author ADMIN
 */
public abstract class Accommodation {

    protected int idAccomodation;
    protected String nameAccomodation;
    protected String addressAccomodation;
    protected String cityAccomodaion;

    public Accommodation(int idAccomodation, String nameAccomodation, String addressAccomodation, String cityAccomodaion) {
        this.idAccomodation = idAccomodation;
        this.nameAccomodation = nameAccomodation;
        this.addressAccomodation = addressAccomodation;
        this.cityAccomodaion = cityAccomodaion;
    }
    
    public int compareTwoCity(Accommodation acc2) {
        return this.cityAccomodaion.compareTo(acc2.cityAccomodaion);
    }

    public int getIdAccomodation() {
        return idAccomodation;
    }

    public void setIdAccomodation(int idAccomodation) {
        this.idAccomodation = idAccomodation;
    }

    public String getNameAccomodation() {
        return nameAccomodation;
    }

    public void setNameAccomodation(String nameAccomodation) {
        this.nameAccomodation = nameAccomodation;
    }

    public String getAddressAccomodation() {
        return addressAccomodation;
    }

    public void setAddressAccomodation(String addressAccomodation) {
        this.addressAccomodation = addressAccomodation;
    }

    public String getCityAccomodaion() {
        return cityAccomodaion;
    }

    public void setCityAccomodaion(String cityAccomodaion) {
        this.cityAccomodaion = cityAccomodaion;
    }
}
