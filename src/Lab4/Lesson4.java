package Lab4;

public class Lesson4 {
    //    Bài 4 (2 điểm)
//Nâng cấp lớp SanPham bằng cách khai báo các trường dữ liệu với đặc tả truy xuất
//là private để hạn chế truy xuất trực tiếp đến các trường này sau đó bổ sung các
//phương thức getter và setter để đọc ghi dữ liệu các trường.

    public static class SanPham {
        private String tenSP;
        private double donGia;
        private double giamGia;

        public String getTenSP(){
            return this.tenSP;
        }
        public void setTenSP(String tenSP){
            this.tenSP = tenSP;
        }

        public double getDonGia() {
            return this.donGia;
        }

        public void setDonGia(double donGia) {
            this.donGia = donGia;
        }

        public double getGiamGia() {
            return this.giamGia;
        }

        public void setGiamGia(double giamGia) {
            this.giamGia = giamGia;
        }

        private double calculateImportTax() {
            return getDonGia() * 0.1;
        }

        public void output() {
            System.out.println("Tên sản phẩm: " + getTenSP());
            System.out.println("Đơn giá: " + getDonGia());
            System.out.println("Giảm giá: " + getDonGia());
            System.out.println("Thuế nhập khẩu: " + calculateImportTax());
        }
    }
    public static void main(String[] args) {
        System.out.println("\nSan pham co giam gia:");
        Lesson3.SanPham sanPham1 = new Lesson3.SanPham("Ao",342444,10000);
        sanPham1.output();

        System.out.println("\nSan pham khong co giam gia:");
        Lesson3.SanPham sanPham2 = new Lesson3.SanPham("Quan",4656786);
        sanPham2.output();
    }
}
