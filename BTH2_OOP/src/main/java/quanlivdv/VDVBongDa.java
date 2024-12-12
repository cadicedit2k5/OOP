/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlivdv;

/**
 *
 * @author ADMIN
 */
public class VDVBongDa extends VanDongVien{
    private String viTriDa;
    private int soAo;
    private String cauLacBo;

    public VDVBongDa(String hoTen, String monThiDau, String viTriDa, int soAo, String cauLacBo) {
        super(hoTen, monThiDau);
        this.viTriDa = viTriDa;
        this.soAo = soAo;
        this.cauLacBo = cauLacBo;
    }

    public String getViTriDa() {
        return viTriDa;
    }

    public void setViTriDa(String viTriDa) {
        this.viTriDa = viTriDa;
    }

    public int getSoAo() {
        return soAo;
    }

    public void setSoAo(int soAo) {
        this.soAo = soAo;
    }

    public String getCauLacBo() {
        return cauLacBo;
    }

    public void setCauLacBo(String cauLacBo) {
        this.cauLacBo = cauLacBo;
    }
    
    
}
