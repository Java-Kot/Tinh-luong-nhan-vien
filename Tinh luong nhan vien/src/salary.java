import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào hệ số lương:");
        float heso = sc.nextFloat();
        System.out.println("Nhập vào số năm làm việc:");
        int year = sc.nextInt();
        float luong = heso * 4000000 + year * 500000;
        System.out.println("Với " + year + " năm làm việc và hệ số " + heso + " thì lương sẽ là " + luong + "đ");
    }
}
