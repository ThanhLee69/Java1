package Lab5;

import java.util.*;


public class Lesson3 {
//    Bài 3 (3 điểm)
//Xây dựng ứng dụng quản lý sản phẩm (thông tin mỗi sản phẩm gồm tên và giá)
//theo menu sau
//1. Nhập danh sách sản phẩm từ bàn phím
//2. Sắp xếp giảm dần theo giá và xuất ra màn hình
//3. Tìm và xóa sản phẩm theo tên nhập từ bàn phím
//4. Xuất giá trung bình của các sản phẩm

    public static class SanPham {
        private String name;
        private double price;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public SanPham(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public SanPham() {

        }

    }

   private static Scanner scanner = new Scanner(System.in);
   private static ArrayList<SanPham> sanPhams = new ArrayList<>();

    private static void input() {
        do {
            SanPham sanPham = new SanPham();
            System.out.print("Nhap ten san pham: ");
            String name = scanner.nextLine();

            System.out.print("Nhap gia san pham: ");
            double price = scanner.nextDouble();

            sanPham.setName(name);
            sanPham.setPrice(price);

            sanPhams.add(sanPham);
            scanner.nextLine();
            System.out.print("Nhap them (Y/N)?   ");
            if (scanner.nextLine().equalsIgnoreCase("N")){
                break;
            }
        }while (true);

    }

    private static void getSortProducts(List<SanPham> productList) {
        productList.sort((SanPham o1, SanPham o2) ->
                Double.compare(o2.price, o1.price));
        System.out.println("\nDanh sach san pham giam dan theo gia:");
        for (SanPham sanPham: productList){
            System.out.println("Ten: "+ sanPham.getName() + "  -  Gia: "+sanPham.getPrice());
        }
        if (productList.isEmpty()){
            System.out.println("Khong co san pham nao!");
        }
    }

    private static void deleteProductByName() {
        System.out.print("Nhap ten san pham muon xoa: ");
        String name = scanner.nextLine();

        for (SanPham sanPham: sanPhams){
            if (sanPham.getName().contains(name)) {
                sanPhams.remove(sanPham);
                System.out.println("Xoa thanh cong!");
                return;
            }
        }

        System.out.println("San pham khong ton tai!");
    }

    private static void getAveragePrice(){
        double avg = 0;
        int count = 0;
        for (int i = 0; i < sanPhams.size(); i++) {
            avg += sanPhams.get(i).price;
            count++;
        }
        System.out.println("Gia trung binh cua cac san pham: "+ avg/count);
    }

    private static void menu() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("+-----------------------------------------------------+");
            System.out.println("|  1. Nhập danh sách sản phẩm từ bàn phím             |");
            System.out.println("|  2. Sắp xếp giảm dần theo giá và xuất ra màn hình   |");
            System.out.println("|  3. Tìm và xóa sản phẩm theo tên nhập từ bàn phím   |");
            System.out.println("|  4. Xuất giá trung bình của các sản phẩm            |");
            System.out.println("|  5. Kết thúc                                        |");
            System.out.println("+-----------------------------------------------------+");

            System.out.print("Chon chuc nang: ");
            int chon = scanner.nextInt();

            switch (chon) {
                case 1:  input();
                    break;
                case 2:  getSortProducts(sanPhams);
                    break;
                case 3:  deleteProductByName();
                    break;
                case 4:  getAveragePrice();
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



    public static void main(String[] args) {
        menu();
    }
}
