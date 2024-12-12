/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlivdv;

/**
 *
 * @author ADMIN
 */
public class VDVBoi extends VanDongVien {
    private String monSoTruong;
    private String cauLacBo;

    public VDVBoi(String hoTen, String monThiDau, String monSoTruong, String cauLacBo) {
        super(hoTen, monThiDau);
        this.monSoTruong = monSoTruong;
        this.cauLacBo = cauLacBo;
    }

    public String getMonSoTruong() {
        return monSoTruong;
    }

    public void setMonSoTruong(String monSoTruong) {
        this.monSoTruong = monSoTruong;
    }

    public String getCauLacBo() {
        return cauLacBo;
    }

    public void setCauLacBo(String cauLacBo) {
        this.cauLacBo = cauLacBo;
    }
    
    
}
