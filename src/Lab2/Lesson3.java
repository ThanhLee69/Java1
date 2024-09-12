package Lab2;

import java.util.Scanner;

public class Lesson3 {
    //    Bài 3 (2 điểm)
//Viết chương trình nhập vào số điện sử dụng của tháng và tính tiền điện theo
//phương pháp lũy tiến
// Nếu số điện sử dụng từ 0 đến 50 thì giá mỗi số điện là 1000
// Nếu số điện sử dụng trên 50 thì giá mỗi số điện vượt hạn mức là 1200
    public static void tinhTienDien(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so dien: " );
        double soDien = scanner.nextDouble();
        double soTien = 0;
        if (soDien < 0){
            System.out.println("So dien phai lon 0");
            return;
        }else if (soDien > 0 && soDien < 50){
            soTien = soDien * 1000;
        }else{
            soTien =  (50 *1000) + (soDien - 50) * 1200;
        }

        System.out.println("So tien dien can tra: "+ soTien + " VND");
    }

    public static void main(String[] args) {

       tinhTienDien();

    }
}
