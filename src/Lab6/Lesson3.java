package Lab6;

import java.util.Scanner;

public class Lesson3 {
//    Bài 3 (3 điểm)
//Nhập mảng 5 sinh viên (mỗi sinh viên gồm họ tên, email, số điện thoại, chứng
//minh nhân dân). Kiểm tra và thông báo lỗi nếu nhập không đúng định dạng email,
//số điện thoại và CMND.

    public static class Student{

        private String fullName;
        private String email;
        private String phoneNumber;
        private String canCuocCongDan;

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getcanCuocCongDan() {
            return canCuocCongDan;
        }

        public void setcanCuocCongDan(String canCuocCongDan) {
            this.canCuocCongDan = canCuocCongDan;
        }


        private void input() {
            Scanner scanner = new Scanner(System.in);

            // Nhập họ và tên
            System.out.print("Nhập họ và tên: ");
            fullName = scanner.nextLine();

            // Nhập email và kiểm tra định dạng
            String reEmail = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
            while (true) {
                System.out.print("Nhập email: ");
                email = scanner.nextLine();
                if (email.matches(reEmail)) {
                    break;
                } else {
                    System.out.println("Vui lòng nhập đúng định dạng email!");
                }
            }

            // Nhập số điện thoại và kiểm tra định dạng
            String rePhone = "^(0[23578]{1})[0-9]{8}$|^(09)[0-9]{8}$";
            while (true) {
                System.out.print("Nhập số điện thoại: ");
                phoneNumber = scanner.nextLine();
                if (phoneNumber.matches(rePhone)) {
                    break;
                } else {
                    System.out.println("Vui lòng nhập đúng định dạng số điện thoại!");
                }
            }

            // Nhập chứng minh nhân dân và kiểm tra định dạng
            String reCCCD = "[0-9]{12}";
            while (true) {
                System.out.print("Nhập căn cước công dân: ");
                canCuocCongDan = scanner.nextLine();
                if (canCuocCongDan.matches(reCCCD)) {
                    break;
                } else {
                    System.out.println("Vui lòng nhập đúng định dạng CCCD!");
                }
            }

            scanner.close();
        }
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.input();
    }
}
