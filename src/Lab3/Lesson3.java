package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson3 {
//    Viết chương trình nhập mảng số nguyên từ bàn phím.
// Sắp xếp và xuất mảng vừa nhập ra màn hình.
// Xuất phần tử có giá trị nhỏ nhất ra màn hình
// Tính và xuất ra màn hình trung bình cộng các phần tử chia hết cho 3

    public static void Bai3(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong phan tu: ");
        int number = scanner.nextInt();

        int[] numberArray = new int[number];

        System.out.println("Nhap gia tri cho mang: ");
        for (int i = 0 ; i < numberArray.length ; i++){
            numberArray[i] = scanner.nextInt();
        }
        //Sap xep gia tri mang tu nho den lon
        for (int i = 0; i < numberArray.length - 1; i++) {
            for (int j = i + 1; j < numberArray.length; j++) {
                if (numberArray[i] > numberArray[j]) {
                    int temp = numberArray[i];
                    numberArray[i] = numberArray[j];
                    numberArray[j] = temp;
                }
            }
        }

        System.out.println("Mang da sap xep: " + Arrays.toString(numberArray));

        //Tim phan tu nho nhat
        int min = numberArray[0];
        for (int i = 0 ; i < numberArray.length ; i++){
            if (numberArray[i] < min){
                min = numberArray[i];
            }
        }
        System.out.println("Phan tu co gia trij nho nhat: "+min);

        // Tinh trung binh cong cac phan tu chia het cho 3
        double sum = 0;
        int count = 0;
        for (int i = 0; i < numberArray.length ; i++){
            if (numberArray[i] % 3 == 0){
                sum += numberArray[i];
                count ++;
            }
        }

        double arg = sum / count;
        System.out.println("Trung binh cong cac phan tu chia het cho : "+ arg);
    }

    public static void main(String[] args) {
        Bai3();
    }
}
