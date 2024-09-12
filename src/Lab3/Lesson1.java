package Lab3;

import java.util.Scanner;

public class Lesson1 {
    //    Bài 1 (2 điểm)
//Viết chương trình nhập một số nguyên từ bàn phím và cho biết số đó có phải là số
//nguyên tố hay không (số nguyên tố là số chỉ chia hết cho 1 và chính nó).

    public static void timSoNguyenTo(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so nguyen: ");
        int number = scanner.nextInt();

        boolean checkNumber = true;

        for (int i = 2; i < number; i++){
            if (number % i == 0){
                checkNumber = false;
                break;
            }
        }
        if (checkNumber){
            System.out.println(number +" la so nguyen to");
        }else {
            System.out.println(number +" khong phai la so nguyen to");
        }

    }
    public static void main(String[] args) {
        timSoNguyenTo();
    }
}
