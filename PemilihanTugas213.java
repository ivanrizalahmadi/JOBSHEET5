import java.util.Scanner;

public class PemilihanTugas213 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String savedUsername = "ivanrizal"; // Username yang disimpan oleh sistem
        String savedPassword = "12345"; // Password yang disimpan oleh sistem

        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();

        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        if (username.equals(savedUsername) && password.equals(savedPassword)) 
            System.out.println("Selamat datang yang mulia, " + username + "!");
         else 
            System.out.println("Username atau password kamu salah. Silakan coba kembali yaaaaa, Goodluck! .");
        
    }
}
 
    

