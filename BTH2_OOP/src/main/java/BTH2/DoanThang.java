/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTH2;

/**
 *
 * @author admin
 */
public class DoanThang {
    private Diem d1;
    private Diem d2;

    public DoanThang(Diem d1, Diem d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
    
    public void hienThi() {
        System.out.printf("[(%.1f, %.1f)(%.1f, %.1f)]\t", this.d1.getX(), this.d2.getX(), this.d1.getY(), this.d2.getY());
    }
    
    public double doDaiDoanThang() {
        return d1.khoangCach(d2);
    }
    
    public Diem timTrungDiem() {
        return new Diem((this.d1.getX() + this.d2.getX())/ 2, (this.d1.getY() + this.d2.getY()) / 2);
    }
    
    public boolean isSongSong(DoanThang b) {
        return ((this.d1.getX() - this.d2.getX()) / (this.d1.getY()- this.d2.getY()) == (b.getD1().getX() - b.getD2().getX()) / (b.getD1().getY() - b.getD2().getY()));
    }

    /**
     * @return the d1
     */
    public Diem getD1() {
        return d1;
    }

    /**
     * @param d1 the d1 to set
     */
    public void setD1(Diem d1) {
        this.d1 = d1;
    }

    /**
     * @return the d2
     */
    public Diem getD2() {
        return d2;
    }

    /**
     * @param d2 the d2 to set
     */
    public void setD2(Diem d2) {
        this.d2 = d2;
    }
    
    
}
