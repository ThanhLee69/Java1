package Lab8;

public class Lesson2 {
    //    Bài 2 (2 điểm)
//Bổ sung thêm 2 phương thức tĩnh để tìm số lớn nhất và nhỏ nhất từ tham số biến
//đổi
// XPoly.min(double…x): tìm số nhỏ nhất
// XPoly.max(double …x): tìm số lớn nhất
    public static double min(double... nums) {
        double min = nums[0];
        for (double item : nums) {
            Math.min(min,item);
        }
        return min;
    }
    public static double max(double... nums) {
        double max = nums[0];
        for (double item : nums) {
            Math.max(max,item);
        }
        return max;
    }

    public static void main(String[] args) {
        // Test phương thức Min()
        System.out.println("Min: " + min(1.5, 2.0, 3.7));
        // Test phương thức Max()
        System.out.println("Max: " + max(10.0, 20.0));
    }
}
