import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat positif: ");
        int bilangan = input.nextInt();
        long hasilFaktorial = hitungFaktorial(bilangan);
        if (hasilFaktorial > 0) {
            System.out.println("Faktorial dari " + bilangan + " adalah: " + hasilFaktorial);
        }
        input.close();
    }
    public static long hitungFaktorial(int n) {
        if (n < 0) {
            System.out.println("Bilangan harus positif.");
            return -1;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long faktorial = 1;        
        for (int i = 2; i <= n; i++) {
            faktorial *= i;
        }
        return faktorial;
    }
}
