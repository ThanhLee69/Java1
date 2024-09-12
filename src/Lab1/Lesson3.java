package Lab1;

import java.util.Scanner;

public class Lesson3 {
    //    Bài 3 (2 điểm)
//Viết chương trình nhập từ bàn phím cạnh của một khối lập phương. Tính và xuất
//thể tích của khối chữ nhật
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap canh: ");
        double cach = scanner.nextDouble();

        double theTich = Math.pow(cach,3);

        System.out.println("The tich hinh lap phuong: "+ theTich);
    }
}
