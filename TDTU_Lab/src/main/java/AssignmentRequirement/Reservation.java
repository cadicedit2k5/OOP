/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AssignmentRequirement;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class Reservation {
    private int reservationId;
    private int accId;
    private int roomId;
    private Date checkin;
    private Date checkout;

    public Reservation(int reservationId, int accId, int roomId, Date checkin, Date checkout) {
        this.reservationId = reservationId;
        this.accId = accId;
        this.roomId = roomId;
        this.checkin = checkin;
        this.checkout = checkout;
    }
    
    @Override
    public String toString() {
        return String.format("Reservation [%d, %d, %d, %s, %s", this.getReservationId(), this.getAccId(), this.getRoomId(), this.getCheckin(), this.getCheckout());
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public int getAccId() {
        return accId;
    }

    public void setAccId(int accId) {
        this.accId = accId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }
}
