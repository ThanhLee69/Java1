package Lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lesson2 {
    //    Bài 2 (3 điểm)
//Viết chương trình thực hiện các chức năng sau
//1. Nhập danh sách họ và tên
//2. Xuất danh sách vừa nhập
//3. Xuất danh sách ngẫu nhiên
//4. Sắp xếp giảm dần và xuất danh sách
//5. Tìm và xóa họ tên nhập từ bàn phím
//6. Kết thúc
   static ArrayList<String> hoTenlist = new ArrayList<>();
   static Scanner scanner = new Scanner(System.in);

    private static void input(){
        do {

            System.out.print("Nhap ho va ten: ");
            String hoTen = scanner.nextLine();
            hoTenlist.add(hoTen);

            System.out.print("Nhap them (Y/N)?   ");
            if (scanner.nextLine().equalsIgnoreCase("N")){
                break;
            }

        }while (true);
    }

    private static void output(){

        for (String hoTen : hoTenlist){
            System.out.println(hoTen);
        }
    }

    private static void getRandomList(){
        Collections.shuffle(hoTenlist);
        output();
    }

    private static void sortList() {
        Collections.sort(hoTenlist);
        output();
    }

    private static void deleteByName() {
        System.out.print("\nNhap ten can xoa: ");
        String name = scanner.nextLine();

        for (int i = 0; i < hoTenlist.size(); i++) {
            if (hoTenlist.get(i).equals(name)){
                hoTenlist.remove(i);
                System.out.println("Xoa thanh cong!");
                break;
            }
        }
    }

    private static void menu() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("+-----------------------------------------+");
            System.out.println("|  1. Nhập danh sách họ và tên            |");
            System.out.println("|  2. Xuất danh sách vừa nhập             |");
            System.out.println("|  3. Xuất danh sách ngẫu nhiên           |");
            System.out.println("|  4. Sắp xếp giảm dần và xuất danh sách  |");
            System.out.println("|  5. Tìm và xóa họ tên nhập từ bàn phím  |");
            System.out.println("|  6. Kết thúc                            |");
            System.out.println("+-----------------------------------------+");

            System.out.print("Chon chuc nang: ");
            int chon = scanner.nextInt();

            switch (chon) {
                case 1:  input();
                    break;
                case 2:  output();
                    break;
                case 3:  getRandomList();
                    break;
                case 4:  sortList();
                    break;
                case 5: deleteByName();
                    break;
                case 6:
                    System.out.println("Cam on ban!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Khong co chuc nang nay!");
                    break;
            }
        } while (true);
    }


    public static void main(String[] args) {
        menu();
    }
}
