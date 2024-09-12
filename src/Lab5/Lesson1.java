package Lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class Lesson1 {

//    Bài 1 (2 điểm)
//Nhập danh sách số thực với số lượng tùy ý từ bàn phím sau đó xuất danh sách
//vừa nhập và tổng của nó.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numberList = new ArrayList<>();

        do {

            System.out.print("Nhap so thuc: ");
            double number = scanner.nextDouble();
            numberList.add(number);

            scanner.nextLine();

            System.out.print("Nhap them ( Y/N ) ?   ");
            if (scanner.nextLine().equalsIgnoreCase("N")){
                break;
            }

        }while (true);

        System.out.println("\nDanh sach so thuc: ");
        for (int i = 0; i < numberList.size(); i++) {
            System.out.println(numberList.get(i));
        }
        scanner.close();
    }
}
