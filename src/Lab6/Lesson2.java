package Lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class Lesson2 {
    //    Bài 2 (3 điểm)
//Nhập vào mảng 5 sản phẩm (mỗi sản phẩm gồm tên, giá và hãng). Xuất thông tin các sản phẩm có hãng là Nokia.
    public static class SanPham {

        private String tenSP;
        private double donGia;
        private String hang;

        public String getTenSP() {
            return tenSP;
        }

        public void setTenSP(String tenSP) {
            this.tenSP = tenSP;
        }

        public String getHang() {
            return hang;
        }

        public void setHang(String hang) {
            this.hang = hang;
        }

        public double getDonGia() {
            return donGia;
        }

        public void setDonGia(double donGia) {
            this.donGia = donGia;
        }

        private void input() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhap ten: ");
            tenSP = scanner.nextLine();
            System.out.print("Nhap don gia: ");
            donGia = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Nhap hang: ");
            hang = scanner.nextLine();

        }

        private void output() {
            System.out.println(tenSP + " - " + donGia + " - " + hang);
        }
    }

    public static void main(String[] args) {
        ArrayList<SanPham> sanPhams = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            SanPham sp = new SanPham();
            sp.input();
            sanPhams.add(sp);
        }

        System.out.println("Danh sach san pham co hang nokia");
        for (SanPham sp: sanPhams){
             if (sp.getHang().equalsIgnoreCase("Nokia")){
                 sp.output();
             }
        }
    }
}
