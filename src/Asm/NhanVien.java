package Asm;

import java.util.ArrayList;

public abstract class NhanVien {

    private String maNV;

    private String hoTen;

    private double luong;

    public NhanVien(String maNV, String hoTen, double luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public abstract double getThuNhap();

    public  double getThueTN(){
        double thue = 0;
        if (getThuNhap() < 9000000){
            thue = 0;
        }else if(getThuNhap() > 15000000){
            thue = getThuNhap() * 0.1;
        }else {
            thue = getLuong() * 0.12;
        }
        return 0;
    }
//    public void xuatThongTin(ArrayList<NhanVien> nhanViens){
//        System.out.println("+-----------------------------------------------------------");
//        System.out.println("| Mã      |  Họ và tên              |  Lương    |  Doanh số   |  Hoa hồng  | Trách nhiệm|");
//         for (NhanVien nv : nhanViens){
//             System.out.printf("| %s | %s  | %.0f | %.0f | %.0f | %.0f| ",nv.maNV,nv.hoTen,nv.luong,);
//         }
//    }
}
