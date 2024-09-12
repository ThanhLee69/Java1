package Lab4;

import java.util.Scanner;

public class Lesson1 {
    //    Tạo lớp SanPham gồm 3 thuộc tính là tên, giá và giảm giá. Lớp cũng gồm 2
//phương thức là tính thuế nhập khẩu (10% giá sản phẩm) và xuất thông tin ra màn
//hình. Thông tin xuất ra màn hình gồm:
// Tên sản phẩm:
// Đơn giá:
// Giảm giá:
// Thuế nhập khẩu:
    public static class SanPham {

        String tenSP;
        double donGia;
        double giamGia;


        public void input(){
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhap ten san pham: ");
            tenSP = scanner.nextLine();

            System.out.print("Nhap don gia: ");
            donGia = scanner.nextDouble();

            System.out.print("Nhap giam gia: ");
            giamGia = scanner.nextDouble();
        }

        public double calculateImportTax(){
            return  donGia * 0.1;
        }

        public  void output(){
            System.out.println("Tên sản phẩm: " + tenSP);
            System.out.println("Đơn giá: " + donGia);
            System.out.println("Giảm giá: " + giamGia);
            System.out.println("Thuế nhập khẩu: " + calculateImportTax());
        }


    }
    public static void main(String[] args) {
        SanPham sanPham = new SanPham();
        sanPham.input();
        sanPham.output();
    }
}
