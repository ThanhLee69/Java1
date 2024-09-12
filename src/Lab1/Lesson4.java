package Lab1;

import java.util.Scanner;

public class Lesson4 {
    //Bài 4 (2 điểm)
    //Viết chương trình nhập các hệ số của phương trình bậc 2. Tính delta và xuất căn
    //delta ra màn hình.
    //     ax2 + b + c = 0 => a khac 0
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhap c: ");
        double c = scanner.nextDouble();

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
