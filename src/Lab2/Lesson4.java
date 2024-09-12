package Lab2;

import java.util.Scanner;

public class Lesson4 {
    //        Bài 4
//Viết chương trình tổ chức 1 menu gồm 3 chức năng để gọi 3 bài trên và một chức
//năng để thoát khỏi ứng dụng.
// Tạo phương thức menu() xuất ra màn hình thực đơn như sau
//+---------------------------------------------------+
//1. Giải phương trình bậc nhất
//2. Giải phương trình bậc 2
//3. Tính tiền điện
//4. Kết thúc
//+---------------------------------------------------+
//Chọn chức năng: _
// Viết mã vào phương thức menu để nhận vào 1 số từ 1 đến 4.
// Sử dụng lệnh switch để gọi đến các hàm chức năng tương ứng.
//o giaiPTB1()
//Chứa mã của bài 1
//o giaiPTB2()
//Chứa mã của bài 2
//o tinhTienDien()
//Chứa mã của bài 3

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);;
        do {
            System.out.println("+-----------------------------------+");
            System.out.println("|  1. Giải phương trình bậc nhất    |");
            System.out.println("|  2. Giải phương trình bậc 2       |");
            System.out.println("|  3. Tính tiền điện                |");
            System.out.println("|  4. Kết thúc                      |");
            System.out.println("+-----------------------------------+");

            System.out.print("Chon chuc nang: ");
            int chon = scanner.nextInt();

            switch (chon) {
                case 1:
                    Lesson1.giaiPTBac1();
                    break;
                case 2:
                    Lesson2.giaiPTBac2();
                    break;
                case 3:
                    Lesson3.tinhTienDien();
                    break;
                case 4:
                    System.out.println("Ban da thoat chuong trinh!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui long chon dung chuc nang!");
            }
        } while (true);
    }

}
