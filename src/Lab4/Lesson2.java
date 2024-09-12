package Lab4;

public class Lesson2 {

    //    Bài 2 (2 điểm)
//Viết chương trình tạo ra 2 sản phẩm thông tin được nhập từ bàn phím sau đó gọi
//phương thức xuất để xuất thông tin 2 đối tượng sản phẩm đã tạo

    public static void main(String[] args) {

        Lesson1.SanPham sanPham1 = new Lesson1.SanPham();
        Lesson1.SanPham sanPham2 = new Lesson1.SanPham();

        System.out.println("\nNhap thong tin san pham thu 1");
        sanPham1.input();

        System.out.println("\nNhap thong tin san pham thu 2");
        sanPham2.input();

        System.out.println("\nThong tin 2 san pham \n");
        sanPham1.output();
        System.out.println("--------------------------------");
        sanPham2.output();

    }
}
