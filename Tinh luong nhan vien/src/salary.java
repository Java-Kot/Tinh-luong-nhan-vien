import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào hệ số lương:");
        float heso = sc.nextFloat();
        System.out.println("Nhập vào số năm làm việc:");
        int year = sc.nextInt();
        float luong = heso * 4000000 + year * 500000;
        System.out.printf("Với %d năm làm việc và hệ số %.2f thì lương sẽ la %,3.0f đ", year, heso, luong);
    }
}