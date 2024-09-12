package Lab2;

import java.util.Scanner;

public class Lesson2 {
    //    Bài 2 (2 điểm)
//Viết chương trình cho phép giải phương trình bậc hai trong đó các hệ số a, b và c
//nhập từ bàn phim

    public static void giaiPTBac2(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhap c: ");
        double c = scanner.nextDouble();

        if (a == 0)
        {
            if (b == 0){
                System.out.println("Phuong trinh vo nghiem");
            }else{
                double x = -c / b;
                System.out.println("Phuong trinh co nghiem duy nhat x = "+ x);
            }
        }
        else
        {
            double delta = Math.pow(b,2) - 4 * a * c;
            System.out.println("Delta: "+ delta);

            if (delta < 0){
                System.out.println("Phuong trinh vo nghiem");
            }else if (delta == 0){
                double x = -(b) / (2 * a) ;
                System.out.println("Phuong trinh co 1 nghiem kep : x = " + x);
            }else {
                double x1 = (-(b) + Math.sqrt(delta)) / (2 * a) ;
                double x2 = (-(b) - Math.sqrt(delta)) / (2 * a) ;
                System.out.println("Phuong trinh co 2 nghiem phan biet x = " + x1 +" x2 = "+ x2);
            }

        }
    }
    public static void main(String[] args) {
        giaiPTBac2();
    }
}
