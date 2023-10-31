import java.util.Scanner;

public class Selection2Exp1Student12 {
    public static void main(String[] args) {
        // Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Minta pengguna memasukkan angka
        System.out.print("Input year : ");
        int year = scanner.nextInt();

        // Periksa apakah adalah kelipatan 4
        if (year % 4 == 0) {
            if(year%100 != 0 || year % 400==0) {
                System.out.println("Leap year");
            } else {
                System.out.println("not a leap year");
            }
        } 
        else {
            System.out.println("not a leap year");
        }

    }
}