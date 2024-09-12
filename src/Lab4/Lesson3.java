package Lab4;

public class Lesson3 {
    //    Bài 3 (2 điểm)
//Nâng cấp lớp SanPham bằng cách bổ sung public cho các đặt tả truy xuất cho
//phương thức xuat() và private cho getThueThuNhap(). Đồng thời bổ sung 2 hàm
//tạo, hàm tạo thứ nhất gồm 3 tham số là tên, giá và giảm giá, hàm tạo thứ 2 gồm 2
//tham số là tên và giá (ngầm hiểu không giảm giá).
//Viết chương trình tạo 2 sản phẩm có giảm giá và không giảm giá sau đó xuất
//thông tin 2 sản phẩm ra màn hình
    public static class SanPham {
        String tenSP;
        double donGia;
        double giamGia;

        public SanPham (String tenSP,  double donGia, double giamGia){
            this.tenSP = tenSP;
            this.donGia = donGia;
            this.giamGia = giamGia;
        }

        public SanPham (String tenSP,  double donGia){
            this.tenSP = tenSP;
            this.donGia = donGia;
            this.giamGia = 0;
        }

        private double calculateImportTax() {
            return donGia * 0.1;
        }

        public void output() {
            System.out.println("Tên sản phẩm: " + tenSP);
            System.out.println("Đơn giá: " + donGia);
            System.out.println("Giảm giá: " + giamGia);
            System.out.println("Thuế nhập khẩu: " + calculateImportTax());
        }
    }

    public static void main(String[] args) {
        System.out.println("\nSan pham co giam gia:");
        SanPham sanPham1 = new SanPham("Ao",342444,10000);
        sanPham1.output();

        System.out.println("\nSan pham khong co giam gia:");
        SanPham sanPham2 = new SanPham("Quan",4656786);
        sanPham2.output();
    }
}
