package Lab8;

public class Lesson1 {
    //    Bài 1 (2 điểm)
//Thêm một phương thức tĩnh có tên là sum() với tham số biến đổi kiểu double.
//Viết mã cho phương thức này để thực hiện tính tổng các tham số truyền vào]

    public static double sum(double... x) {
        double total = 0;

        for (double num : x) {
            total += num;
        }

        return total;
    }
    public static void main(String[] args) {
        // Test phương thức sum()
        System.out.println("Tổng: " + sum(1.5, 2.0, 3.7));
        System.out.println("Tổng: " + sum(10.0, 20.0));
        System.out.println("Tổng: " + sum());
    }
}
