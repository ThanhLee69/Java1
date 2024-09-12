package Lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Lesson4 {
    //Bài 4 (2 điểm)
//Viết chương trình quản lý sinh viên:
//1. Nhập danh sách sinh viên
//2. Xuất thông tin danh sách sinh viên
//3. Xuất danh sách sinh viên có học lực giỏi
//4. Sắp xếp danh sách sinh viên theo điểm
//5. Kết thúc
    private final static ArrayList<Lesson2.SinhVienPoly> sinhVienPolies = new ArrayList<>();

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("+------------------------------------------------+");
            System.out.println("|  1. Nhập danh sách sinh viên                   |");
            System.out.println("|  2. Xuất thông tin danh sách sinh viên         |");
            System.out.println("|  3. Xuất danh sách sinh viên có học lực giỏi   |");
            System.out.println("|  4. Sắp xếp danh sách sinh viên theo điểm      |");
            System.out.println("|  5. Kết thúc                                   |");
            System.out.println("+------------------------------------------------+");

            System.out.print("Chon chuc nang: ");
            int chon = scanner.nextInt();

            switch (chon) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    xuatSVHocLucGioi();
                    break;
                case 4:
                    xuatSVTheoDiem();
                    break;
                case 5:
                    System.out.println("Cam on ban!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Khong co chuc nang nay!");
                    break;
            }

        } while (true);
    }

    public static void nhap() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhap ten: ");
            String ten = scanner.nextLine().trim();

            while (true) {
                System.out.print("Nhap nganh (IT/Biz): ");
                String nganh = scanner.nextLine().trim();

                if (!nganh.equalsIgnoreCase("IT") && !nganh.equalsIgnoreCase("Biz")) {
                    System.out.println("Khong co nganh nay vui long nhap lai!");
                } else if (nganh.equalsIgnoreCase("IT")) {
                    System.out.print("Nhap diem Java: ");
                    double diemJava = scanner.nextDouble();
                    System.out.print("Nhap diem CSS: ");
                    double diemCss = scanner.nextDouble();
                    System.out.print("Nhap diem HTML: ");
                    double diemHtml = scanner.nextDouble();
                    scanner.nextLine();

                    Lesson3.SinhVienIT sinhVienIT = new Lesson3.SinhVienIT(ten, nganh, diemJava, diemHtml, diemCss);
                    sinhVienPolies.add(sinhVienIT);
                    break;
                } else {
                    System.out.print("Nhap diem Marketing: ");
                    double diemMarketing = scanner.nextDouble();
                    System.out.print("Nhap diem Sales: ");
                    double diemSales = scanner.nextDouble();
                    scanner.nextLine();

                    Lesson3.SinhVienBiz sinhVienBiz = new Lesson3.SinhVienBiz(ten, nganh, diemMarketing, diemSales);
                    sinhVienPolies.add(sinhVienBiz);
                    break;
                }
            }

            System.out.print("Ban co muon nhap them sinh vien khong? (Y/N): ");
            String response = scanner.nextLine().trim();
            if (response.equalsIgnoreCase("N")) {
                break;
            }
        } while (true);

    }

    public static void xuat() {
        System.out.println("\nDanh sach sinh vien:");
        for (Lesson2.SinhVienPoly sv : sinhVienPolies) {
            System.out.printf("Ho ten: %s - Nganh: %s - DiemTB: %.1f - Hoc luc: %s \n", sv.getFullName(), sv.getMajor(), sv.getDiem(), sv.getHocLuc());
        }
    }

    public static void xuatSVHocLucGioi() {
        System.out.println("\nDanh sach sinh vien co hoc luc gioi:");
        for (Lesson2.SinhVienPoly sv : sinhVienPolies) {
            if (sv.getHocLuc().equalsIgnoreCase("Giỏi")) {
                System.out.printf("Ho ten: %s - Nganh: %s - DiemTB: %.1f - Hoc luc: %s \n", sv.getFullName(), sv.getMajor(), sv.getDiem(), sv.getHocLuc());
            }
        }
    }

    public static void xuatSVTheoDiem() {
        System.out.println("\nDanh sach sinh vien co hoc luc gioi:");
        sinhVienPolies.sort(Comparator.comparingDouble(Lesson2.SinhVienPoly::getDiem));
        for (Lesson2.SinhVienPoly sv : sinhVienPolies) {
            System.out.printf("Ho ten: %s - Nganh: %s - DiemTB: %.1f - Hoc luc: %s \n", sv.getFullName(), sv.getMajor(), sv.getDiem(), sv.getHocLuc());
        }
    }

    public static void main(String[] args) {
        menu();

    }
}
