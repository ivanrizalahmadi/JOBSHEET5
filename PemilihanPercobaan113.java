import java.util.Scanner;

public class PemilihanPercobaan113 {
    public static void main (String[] args) {
        Scanner input13 = new Scanner(System.in);
        System.out.print("Masukan angka: ");
        int angka = input13.nextInt();

        String JenisBilangan = (angka % 2 == 0) ?"genap" : "ganjil";
        System.out.println("Angka "+angka+" adalah bilangan " + JenisBilangan + ".");

        





    }
}