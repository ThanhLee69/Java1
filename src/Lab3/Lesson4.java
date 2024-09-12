package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson4 {

    //    Bài 4 (2 điểm)
//Viết chương trình nhập 2 mảng họ tên và điểm của sinh viên.
// Xuất 2 mảng đã nhập, mỗi sinh viên có thêm học lực
//o Yếu: điểm < 5
//o Trung bình: 5 <= điểm < 6.5
//o Khá: 6.5 <= điểm < 7.5
//o Giỏi: 7.5<= điểm < 9
//o Xuất sắc: điểm >= 9
// Sắp xếp danh sách sinh viên đã nhập tăng dần theo điểm
    public static void Bai4() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so phan tu cho mang: ");
        int number = scanner.nextInt();
        scanner.nextLine(); //loại bỏ ký tự xuống dòng còn sót lại.

        String[] fullNameArrays = new String[number];
        double[] scoreArrays = new double[number];

        for (int i = 0; i < number; i++) {

            System.out.printf("Nhap ho va ten sv[%d]: ", i++);
            fullNameArrays[i] = scanner.nextLine();
            System.out.printf("Nhap diem sv[%d]: ", i++);
            scoreArrays[i] = scanner.nextDouble();
            scanner.nextLine(); //loại bỏ ký tự xuống dòng còn sót lại.
        }
        System.out.println("\nDanh sách sinh viên:");
        getStudentList(scoreArrays, fullNameArrays);

        sortByScore(scoreArrays, fullNameArrays);

        System.out.println("\nDanh sách sinh viên sau khi sắp xếp theo điểm tăng dần:");
        getStudentList(scoreArrays, fullNameArrays);

    }

    public static void getStudentList(double[] scoreArrays, String[] fullNameArrays) {
        for (int i = 0; i < scoreArrays.length; i++) {
            System.out.println("Họ tên: " + fullNameArrays[i] + ", Điểm: " + scoreArrays[i] + ", Học lực: " + getClassification(scoreArrays[i]));
        }
    }

    public static void sortByScore(double[] scoreArrays, String[] fullNameArrays) {
        for (int i = 0; i < scoreArrays.length - 1; i++) {
            for (int j = i + 1; j < scoreArrays.length; j++) {
                if (scoreArrays[i] > scoreArrays[j]) {
                    double tempScore = scoreArrays[i];
                    scoreArrays[i] = scoreArrays[j];
                    scoreArrays[j] = tempScore;

                    String tempName = fullNameArrays[i];
                    fullNameArrays[i] = fullNameArrays[j];
                    fullNameArrays[j] = tempName;
                }
            }
        }

    }

    public static String getClassification(double score) {
        if (score < 5) {
            return "Yếu";
        } else if (score < 6.5) {
            return "Trung bình";
        } else if (score < 7.5) {
            return "Khá";
        } else if (score < 9) {
            return "Giỏi";
        } else {
            return "Xuất sắc";
        }
    }

    public static void main(String[] args) {
        Bai4();
    }
}
