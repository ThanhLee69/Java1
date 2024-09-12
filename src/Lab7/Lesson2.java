package Lab7;

public class Lesson2 {
    //    Bài 2 (2 điểm)
//Tạo lớp SinhVienPoly gồm 2 thuộc tính họ tên và ngành cùng với phương thức
//trừu tượng là getDiem(). Thêm phương thức getHocLuc() để xếp loại học lực. Lớp
//cũng bao gồm một phương thức xuat() để xuất họ tên, ngành, điểm và học lực ra màn hình.
    public abstract static class SinhVienPoly {
        private String fullName;
        private String major;

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public String getMajor() {
            return major;
        }

        public void setMajor(String major) {
            this.major = major;
        }

        public SinhVienPoly(String fullName, String major) {
            this.fullName = fullName;
            this.major = major;
        }

        public abstract double getDiem();

        public String getHocLuc() {
            double diem = getDiem();
            if (diem < 5) {
                return "Yếu";
            } else if (diem < 6.5) {
                return "Trung bình";
            } else if (diem < 7.5) {
                return "Khá";
            } else if (diem < 9) {
                return "Giỏi";
            } else {
                return "Xuất sắc";
            }
        }
    }

}
