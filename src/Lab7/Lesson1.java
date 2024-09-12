package Lab7;

import java.util.Scanner;

public class Lesson1 {
    //    Bài 1 (2 điểm)
//Xây dựng lớp ChuNhat gồm 2 thuộc tính là rong và dai và các phương thức
//getChuVi() và getDienTich() để tính chu vi và diện tích. Phương thức xuat() sẽ xuất
//ra màn hình chiều rộng, chiều dài, diện tích và chu vi.
//Xây dựng lớp Vuong kế thừa từ lớp ChuNhat và ghi đè phương thức xuat() để xuất thông tin cạnh, diện tích và chu vi.
//Viết chương trình nhập 2 hình chữ nhật và một hình vuông sau đó xuất ra màn hình.
    public static class ChuNhat {

        protected double chieuDai;
        protected double chieuRong;

        public ChuNhat(double chieuDai, double chieuRong) {
            this.chieuDai = chieuDai;
            this.chieuRong = chieuRong;
        }

        public double getChuVi(){
           return (chieuRong + chieuDai) * 2;
        }

        public double getDienTich(){
            return chieuRong * chieuDai;
        }
        public void xuat(){
            System.out.println("+------------------------+");
            System.out.println("Chiều rộng: " + chieuRong);
            System.out.println("Chiều dài: " + chieuDai);
            System.out.println("Diện tích: " + getDienTich());
            System.out.println("Chu vi: " + getChuVi());
        }
    }

    public static class Vuong extends ChuNhat{

        public Vuong(double canh) {
            super(canh, canh);
        }

        @Override
        public void xuat(){
            System.out.println("+------------------------+");
            System.out.println("Cạnh: " + chieuDai); // Ở đây dai và rong bằng nhau
            System.out.println("Diện tích: " + getDienTich());
            System.out.println("Chu vi: " + getChuVi());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập hai hình chữ nhật
        System.out.println("Nhập hình chữ nhật thứ nhất:");
        System.out.print("Chiều rộng: ");
        double rong1 = scanner.nextDouble();
        System.out.print("Chiều dài: ");
        double dai1 = scanner.nextDouble();
        ChuNhat hcn1 = new ChuNhat(rong1, dai1);

        System.out.println("Nhập hình chữ nhật thứ hai:");
        System.out.print("Chiều rộng: ");
        double rong2 = scanner.nextDouble();
        System.out.print("Chiều dài: ");
        double dai2 = scanner.nextDouble();
        ChuNhat hcn2 = new ChuNhat(rong2, dai2);

        // Nhập một hình vuông
        System.out.println("Nhập hình vuông:");
        System.out.print("Cạnh: ");
        double canh = scanner.nextDouble();
        Vuong hv = new Vuong(canh);

        // Xuất thông tin các hình
        System.out.println("\nThông tin hình chữ nhật thứ nhất:");
        hcn1.xuat();

        System.out.println("\nThông tin hình chữ nhật thứ hai:");
        hcn2.xuat();

        System.out.println("\nThông tin hình vuông:");
        hv.xuat();

        scanner.close();
    }
}
