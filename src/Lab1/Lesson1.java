package Lab1;

import java.util.Scanner;

public class Lesson1 {
    //    Bài 1
//Viết chương trình cho phép nhập họ và tên sinh viên, điểm trung bình từ bàn
//phím sau đó xuất ra màn hình với định dạng: <<họ và tên>> <<điểm>> điểm.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhap ho va ten: ");
        String fullName = scanner.nextLine();
        System.out.print("Nhap diem TB: ");
        double averageGrade = scanner.nextDouble();

        System.out.println(fullName + " - " + averageGrade  + " diem");
    }
}
