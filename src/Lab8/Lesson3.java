package Lab8;

public class Lesson3 {
    //    Bài 3 (2 điểm)
//Bổ sung thêm 1 phương thức tĩnh toUpperFirstChar(String s) để chuyển đổi các ký
//tự đầu tiên của mỗi từ sang ký tự hoa. Ví dụ: “nguyen van teo” sẽ đổi thành
//“Nguyen Van Teo”.

    public static String toUpperFirstChar(String s) {
        // Tách chuỗi thành các từ
        String[] words = s.split(" ");

        // Sử dụng StringBuilder để kết hợp các từ
        StringBuilder result = new StringBuilder();

        // Duyệt qua từng từ trong mảng words
        for (String word : words) {
            if (word.length() > 0) {
                // Chuyển ký tự đầu tiên của từ thành chữ hoa và kết hợp với phần còn lại
                String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                result.append(capitalizedWord).append(" ");
            }
        }

        // Loại bỏ khoảng trắng thừa ở cuối chuỗi
        return result.toString().trim();
    }

    public static void main(String[] args) {
        // Test phương thức toUpperFirstChar()
        System.out.println(toUpperFirstChar("nguyen van teo"));
        System.out.println(toUpperFirstChar("hello world"));

    }
}
