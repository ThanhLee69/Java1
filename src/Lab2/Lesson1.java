package Lab2;

import java.util.Scanner;

public class Lesson1 {
    // Bài 1
//Viết chương trình cho phép giải phương trình bậc nhất trong đó các hệ số a và b
//nhập từ bàn phím
    public static void giaiPTBac1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else {
            double x = -b / a;
            System.out.println("Phuong trinh co nghiem duy nhat x = " + x);
        }
    }

    public static void main(String[] args) {
        giaiPTBac1();
    }
}