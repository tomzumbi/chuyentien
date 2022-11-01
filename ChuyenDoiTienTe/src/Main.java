import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so USD");
        double tien = scanner.nextDouble();
        double vnd = 23000 * tien;
        System.out.println("bang " +vnd + "dong" );
    }

}