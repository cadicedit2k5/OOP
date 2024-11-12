/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTH2;

/**
 *
 * @author admin
 */
public class BTH2_OOP {
    public static void main(String[] args) throws Exception {
        //Bai 1
        System.out.println("1) Bai 1");
        Diem d1 = new Diem(5, 4);
        Diem d2 = new Diem(3, 4);
        Diem d3 = new Diem(2, 5);
        Diem d4 = new Diem(10, 1);
        
        d1.hienThi();
        
        double kc = d1.khoangCach(d2);
        System.out.printf("Khoang cach = %.1f", kc);
        //Bai 2
        System.out.println();
        System.out.println("2) Bai 2");
        DoanThang a = new DoanThang(d1, d2);
        DoanThang b = new DoanThang(d3, d4);
        
        a.hienThi();
        b.hienThi();
        
        double doDai = a.doDaiDoanThang();
        Diem trungDiem = a.timTrungDiem();
//        
        System.out.printf("Do dai doan thang = %.1f", doDai);
        trungDiem.hienThi(); 
//        
//        boolean isSS = a.isSongSong(b);
//        System.out.println("A song song voi B = "+ isSS);
        //Bai 3
        System.out.println();
        System.out.println("3) Bai 3");
        Diem tren = new Diem(2, 5);
        Diem duoi = new Diem(4, 1);
        HinhChuNhat hcn = new HinhChuNhat(tren, duoi);
        hcn.hienThi();
        
        // Bai 4
        System.out.println();
        System.out.println("4) Bai 4");
        
        HinhTron h1 = new HinhTron(1, new Diem(0, 0));
        HinhTron h2 = new HinhTron(2, new Diem(1, 1));
        
        System.out.println("Chu vi hinh 1 = " + h1.chuVi());
        System.out.println("Dien tich hinh 1 = " + h1.dienTich());
        
        System.out.println("Vi tri tuong doi so voi (1, 1)" + h1.viTriTuongDoiDiem(new Diem (0, 1)));
        //Bai 5
        System.out.println("5) Bai 5");
        PhanSo ps1 = new PhanSo(3, 4);
        PhanSo ps2 = new PhanSo(5, 6);
        PhanSo[] arr = {ps1, ps2};
        
        //Hien thi cac phan so
        for (int i = 0; i < PhanSo.getSize(); i++) {
            arr[i].hienThi();
        }
        
        System.out.println(PhanSo.getSize());
        PhanSo tong = new PhanSo();
//        System.out.println(arr[0]);
        
        for (var x : arr) {
            tong = tong.cong(x);
        }
        
        PhanSo max = arr[0];
        
        for (var x : arr) {
            if (x.soSanh(max) == 1) {
                max = x;
            }
        }
        
        System.out.println("Tong = ");
        tong.hienThi();
        System.out.println("Max = ");
        max.hienThi();
        
//        System.out.println("ps1 + ps2 = ");
//        ps1.cong(ps2).hienThi();
//        System.out.println("So sanh ps1 va ps2 " + ps1.soSanh(ps2));
//        System.out.println("Phan so rut gon la: ");
//        ps1.cong(ps2).rutGon().hienThi();
    }
}
