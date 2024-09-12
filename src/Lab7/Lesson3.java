package Lab7;

public class Lesson3 {
    //    Bài 3 (2 điểm)
//Tạo lớp SinhVienIT và SinhVienBiz kế thừa từ lớp SinhVienPoly.
// SinhVienIT gồm các thuộc tính điểm java, html, css. Ghi đè phương thức
//getDiem() để tính điểm cho sinh viên IT theo công thức (2*java + html + css)/4
// SinhVienBiz gồm các thuộc tính điểm marketing, sales. Ghi đè phương thức
//getDiem() để tính điểm cho sinh viên Biz theo công thức (2*marketting + sales)/3
//    Ghi đè phương thức getDiem() trên 2 lớp SinhVienIT và SinhVienBiz theo
//yêu cầu của đề để tính điểm cho các sinh viên của các ngành.
    public static class SinhVienIT extends Lesson2.SinhVienPoly {
        private double diemJava;
        private double diemCss;
        private double diemHtml;

        public SinhVienIT(String fullName, String major, double diemJava, double diemHtml, double diemCss) {
            super(fullName, major);
            this.diemJava = diemJava;
            this.diemHtml = diemHtml;
            this.diemCss = diemCss;
        }

        @Override
        public double getDiem() {
            return (2 * diemJava + diemHtml + diemCss) / 4;
        }
    }

    public static class SinhVienBiz extends Lesson2.SinhVienPoly {

        private double diemMarketing;
        private double diemSales;

        public SinhVienBiz(String fullName, String major, double diemMarketing, double diemSales) {
            super(fullName, major);
            this.diemMarketing = diemMarketing;
            this.diemSales = diemSales;
        }

        @Override
        public double getDiem() {
            return (2 * diemMarketing + diemSales) / 3;
        }
    }
}
