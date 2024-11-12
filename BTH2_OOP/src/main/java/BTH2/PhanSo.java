/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTH2;

/**
 *
 * @author admin
 */
public class PhanSo {
    private static int size;

    public static int getSize() {
        return size;
    }
    private int tuSo;
    private int mauSo;
    
    public PhanSo() {
        this.mauSo = 1;
        size++;
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
        size++;
    }
    
    public static int ucln(int a, int b) {
        if (b == 0) return a;
        return ucln(b, a % b);
    }
    
    public PhanSo rutGon() {
        int tu = this.getTuSo() / ucln(this.getTuSo(), this.getMauSo());
        int mau = this.getMauSo() / ucln(this.getTuSo(), this.getMauSo());
        
        return new PhanSo(tu, mau);
    }
    
    public PhanSo cong(PhanSo b) {
        int tu = this.getTuSo() * b.getMauSo() + this.getMauSo() * b.getTuSo();
        int mau = this.getMauSo() * b.getMauSo();
        return new PhanSo(tu, mau);
    }
    
    public int soSanh(PhanSo b) {
        double ps1 = (double)this.getTuSo() / this.getMauSo();
        double ps2 = (double)b.getTuSo() / b.getMauSo();
        
        if (ps1 > ps2) return 1;
        else if (ps1 < ps2) return -1;
        return 0;
    }
    
    public void hienThi() {
        System.out.printf("%d / %d\t", this.tuSo, this.mauSo);
    }
    
    @Override
    public String toString() {
        return this.tuSo + " / " + this.mauSo;
    }

    /**
     * @return the tuSo
     */
    public int getTuSo() {
        return tuSo;
    }

    /**
     * @param tuSo the tuSo to set
     */
    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    /**
     * @return the mauSo
     */
    public int getMauSo() {
        return mauSo;
    }

    /**
     * @param mauSo the mauSo to set
     */
    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    
    
    
}
