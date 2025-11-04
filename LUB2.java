import java.util.Scanner;

public class LUB2 {
    // Fungsi untuk menghitung volume tabung
    static double volumeTabung(double r, double t) {
        double volume = 3.14 * r * r * t; // rumus volume tabung = π × r² × t
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan jari-jari tabung (cm): ");
        double r = input.nextDouble();

        System.out.print("Masukkan tinggi tabung (cm): ");
        double t = input.nextDouble();

        // Memanggil fungsi dan menampilkan hasil
        double hasil = volumeTabung(r, t);

        System.out.println("\nVolume tabung adalah: " + hasil + " cm³");

        input.close();
    }
}
