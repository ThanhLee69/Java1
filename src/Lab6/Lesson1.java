package Lab6;

import java.util.Scanner;

public class Lesson1 {
    //Bài 1 (2 điểm)
//Nhập họ và tên từ bàn phím. Xuất tên, họ và tên đệm ra màn hình trong đó tên và
//họ xuất IN HOA.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập họ và tên: ");
        String fullName = scanner.nextLine().trim();

        // Tìm vị trí của các khoảng trắng đầu tiên và cuối cùng
        int firstSpaceIndex = fullName.indexOf(" ");
        int lastSpaceIndex = fullName.lastIndexOf(" ");

        if (firstSpaceIndex == -1 || firstSpaceIndex == lastSpaceIndex) {
            // Không có khoảng trắng nào hoặc chỉ có một khoảng trắng
            System.out.println("Vui lòng nhập đầy đủ họ và tên.");
        } else {
            // Tách họ, tên đệm và tên
            String lastName = fullName.substring(0, firstSpaceIndex).toUpperCase();
            String middleName = fullName.substring(firstSpaceIndex + 1, lastSpaceIndex);
            String firstName = fullName.substring(lastSpaceIndex + 1).toUpperCase();

            // Xuất kết quả
            System.out.println("Họ: " + lastName);
            System.out.println("Tên đệm: " + middleName);
            System.out.println("Tên: " + firstName);
        }

        scanner.close();
    }

}
