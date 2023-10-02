import java.util.Scanner;

public class PemilihanTugas113 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("BERAPA JARAK COMBAT LU (angka berapa meter): ");
        int jarakPertarungan = scanner.nextInt();

        if (jarakPertarungan <= 5) 
            System.out.println("PAKAI MELEE WEAPON DAH LO. ");
         else if (jarakPertarungan > 5 && jarakPertarungan <= 1000) 
            System.out.println("MENDING PAKAI RANGED WEAPON WOY !!!. ");
         else 
            System.out.println("kabur aja yuk . ");
        
    }
}
 
    

