package Lab3;

public class Lesson2 {
//    Bài 2 (2 điểm)
//Viết chương trình xuất ra màn hình bảng cửu chương
    public static void bangCuuChuong(){
        System.out.println("Bang cuu chuong tu 2 - 9");

        for (int i = 2 ; i <10 ; i++){
            for (int j = 1 ; j <= 10 ; j++){
                System.out.printf( "  %d x %d = %d   \n", i, j, i * j);
            }
            System.out.println("------------------");
        }

    }

    public static void main(String[] args) {
        bangCuuChuong();
    }
}
