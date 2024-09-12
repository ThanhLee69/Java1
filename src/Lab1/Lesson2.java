package Lab1;

import java.util.Scanner;

public class Lesson2 {
    //Bài 2
//Viết chương trình nhập từ bàn phím 2 cạnh của hình chữ nhật. Tính và xuất chu vi,
//diện tích và cạnh nhỏ của hình chữ nhật.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chieu dai: ");
        double chieuDai = scanner.nextDouble();
        System.out.print("Nhap chieu rong: ");
        double chieuRong = scanner.nextDouble();

        double chuVi = (chieuDai + chieuRong) * 2;

        double dienTich = chieuDai * chieuRong;

        double canhNho = Math.min(chieuRong,chieuDai);

        System.out.println("Chu vi hinh chu nhat: "+ chuVi);
        System.out.println("Dien tich hinh chu nhat: " + dienTich);
        System.out.println("Canh nho nhat cua hinh chu nhat: " + canhNho);



    }
}
