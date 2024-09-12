package Asm;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private final ArrayList<NhanVien> nhanViens = new ArrayList<>();

    public void menu() {
        do {
            System.out.println("+-----------------------------------------------------------+");
            System.out.println("|  1. Nhập danh sách nhân viên từ bàn phím.                   |");
            System.out.println("|  2. Xuất danh sách nhân viên ra màn hình.                   |");
            System.out.println("|  3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím.     |");
            System.out.println("|  4. Xóa nhân viên theo mã nhập từ bàn phím.                 |");
            System.out.println("|  5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím.  |");
            System.out.println("|  6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím.   |");
            System.out.println("|  7. Sắp xếp nhân viên theo họ và tên.                       |");
            System.out.println("|  8. Sắp xếp nhân viên theo thu nhập.                        |");
            System.out.println("|  9. Xuất 5 nhân viên có thu nhập cao nhất.                  |");
            System.out.println("|  0. Thoát chương trình.                                     |");
            System.out.println("+-------------------------------------------------------------+");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Chọn chức năng: ");
            int chon = scanner.nextInt();

            switch (chon) {
                case 1: nhap();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 0:
                    System.out.println("Bạn đã thoát chương trình!");
                    break;
                default:
                    System.out.println("Vui lòng chọn đúng chức năng!");
                    break;
            }
        } while (true);
    }

    private void nhap() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập thông tin nhân viên.");


            System.out.print("Nhập mã: ");
            String maNV = scanner.nextLine();

            System.out.print("Nhập họ tên: ");
            String hoTen = scanner.nextLine();

            System.out.print("Nhập lương: ");
            double luong = scanner.nextDouble();


            System.out.println("(HC: Hành chính) - (TT: Tiếp thị) - (TP: Trưởng phòng)");
            System.out.print("Chọn nhân viên (HC/TT/TP)?   ");
            String checkNV = scanner.nextLine();
            if (checkNV.equalsIgnoreCase("TT")) {

                System.out.print("Nhập doanh số: ");
                double doanhSo = scanner.nextDouble();

                System.out.print("Nhập hoa hồng: ");
                double hoaHong = scanner.nextDouble();

                TiepThi tiepThi = new TiepThi(maNV, hoTen, luong, doanhSo, hoaHong);
                nhanViens.add(tiepThi);

            } else if (checkNV.equalsIgnoreCase("TP")) {

                System.out.print("Nhập trách nhiệm: ");
                double trachNhiem = scanner.nextDouble();

                TruongPhong truongPhong = new TruongPhong(maNV, hoTen, luong, trachNhiem);

            } else if (checkNV.equalsIgnoreCase("HT")) {
                break;
            }
            System.out.print("Bạn có muốn nhập thêm nhân viên? (Y/N): ");
            String response = scanner.nextLine().trim();
            if (response.equalsIgnoreCase("N")) {
                break;
            }

        } while (true);

    }

    public static void main(String[] args) {

    }
}
