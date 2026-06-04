import java.util.Scanner;

class Siswa {
    String nama;
    String nis;

    // Constructor untuk memulai sebuah objek Siswa
    public Siswa(String nama, String nis) {
        this.nama = nama;
        this.nis = nis;
    }

    // Method untuk menampilkan informasi siswa
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIS: " + nis);
    }
}
// CLASS TURUNAN ( inheritance) SPP
class PembayaranSPP extends Siswa {
    // Polymorphism (Overloading)
    public static void bayar(Siswa siswa, int bulan, boolean terlambat) {
        Scanner input = new Scanner(System.in);
        int biayaSPP = 100000; 
        int biayaAdmin = 5000; 
        int denda = terlambat ? 15000 : 0; 
        int total = biayaSPP * bulan + biayaAdmin + denda;

        // Menampilkan informasi pembayaran SPP
        siswa.tampilkanInfo();
        System.out.println("Bulan Pembayaran: " + bulan);
        System.out.println("Biaya Pokok: Rp" + (biayaSPP * bulan));
        System.out.println("Denda: Rp" + denda);
        System.out.println("Total Pembayaran: Rp" + total);
    }

    public PembayaranSPP(String nama, String nis) {
        super(nama, nis);
    }
}
// CLASS TURUNAN SERAGAM
class PembayaranSeragam  extends Siswa {
    // CLASS TURUNAN SERAGAM
    public static void bayar(Siswa siswa, String ukuran, boolean isXL) {
        Scanner input = new Scanner(System.in);
        int biayaSeragam = 150000; 
        int biayaAdmin = 5000; 
        int biayaTambahan = isXL ? 20000 : 0; 

        // Menghitung total biaya seragam
        int total = biayaSeragam + biayaAdmin + biayaTambahan;

        // Menampilkan informasi pembayaran seragam
        siswa.tampilkanInfo();
        System.out.println("Ukuran Seragam: " + ukuran);
        System.out.println("Biaya Dasar: Rp" + biayaSeragam);
        System.out.println("Biaya Tambahan: Rp" + biayaTambahan);
        System.out.println("Total Pembayaran: Rp" + total);
    }

    public PembayaranSeragam(String nama, String nis) {
        super(nama, nis);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membuat objek siswa
        Siswa siswa = new Siswa("Tiara Fitri Ramadani", "081");

        // Pilihan transaksi
        System.out.println("Pilih jenis pembayaran:");
        System.out.println("1. Pembayaran SPP");
        System.out.println("2. Pembayaran Seragam");
        System.out.print("Pilih (1/2): ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            // Pembayaran SPP
            System.out.print("Masukkan bulan pembayaran: ");
            int bulan = input.nextInt();
            System.out.print("Apakah pembayaran terlambat (true/false): ");
            boolean terlambat = input.nextBoolean();
            PembayaranSPP.bayar(siswa, bulan, terlambat);
        } else if (pilihan == 2) {
            // Pembayaran Seragam
            System.out.print("Masukkan ukuran seragam (S/M/L/XL): ");
            String ukuran = input.next();
            System.out.print("Apakah ukuran XL (true/false): ");
            boolean isXL = input.nextBoolean();
            PembayaranSeragam.bayar(siswa, ukuran, isXL);
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }
}