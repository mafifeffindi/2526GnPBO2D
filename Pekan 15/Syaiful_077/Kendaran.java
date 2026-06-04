class Kendaraan {
    private String merek;

    public Kendaraan(String merek) {
        this.merek = merek;
    }

    // Method yang akan di-override (Polymorphism Dinamis)
    public void isiBahanBakar() {
        System.out.println("Kendaraan ini mengisi bahan bakar umum.");
    }

    // Method Overloading (Polymorphism Statis)
    // Versi 1: Mengisi bbm dengan nominal uang
    public void isiBahanBakar(int biaya) {
        System.out.println("Mengisi bahan bakar senilai: Rp " + biaya);
    }

    // Versi 2: Mengisi bbm dengan volume liter (Overloading lagi)
    public void isiBahanBakar(double liter) {
        System.out.println("Mengisi bahan bakar sebanyak: " + liter + " Liter");
    }

    // Getter untuk mengambil merek kendaraan
    public String getMerek() {
        return merek;
    }
}

// ==========================================
// 2. KELAS ANAK (Subclass) - Mobil Listrik
// ==========================================
class MobilListrik extends Kendaraan {
    
    // Constructor MobilListrik memanggil Constructor Kendaraan
    public MobilListrik(String merek) {
        super(merek);
    }

    // Method Overriding (Polymorphism Dinamis)
    // Mengubah perilaku pengisian bahan bakar khusus untuk mobil listrik
    @Override
    public void isiBahanBakar() {
        System.out.println("Mengisi daya baterai di SPKLU (Dicas)...");
    }
}

// ==========================================
// 3. KELAS ANAK (Subclass) - Motor Konten
// ==========================================
class MotorBalap extends Kendaraan {
    
    public MotorBalap(String merek) {
        super(merek);
    }

    // Method Overriding (Polymorphism Dinamis)
    // Mengubah perilaku pengisian bahan bakar khusus untuk motor balap
    @Override
    public void isiBahanBakar() {
        System.out.println("Mengisi bahan bakar beroktan tinggi (Pertamax Turbo/Racing Fuel)...");
    }
}

// ==========================================
// 4. KELAS UTAMA (Main Class) - Eksekusi
// ==========================================
public class Main {
    public static void main(String[] args) {
        System.out.println("=== DEMO OOP: SISTEM KENDARAAN ===");

        // --------------------------------------------------
        // CONTOH 1: Polimorfisme Statis (Method Overloading)
        // --------------------------------------------------
        System.out.println("\n[1. Demo Overloading pada Kendaraan Biasa]");
        Kendaraan mobilBiasa = new Kendaraan("Toyota Avanza");
        
        System.out.println("Kendaraan: " + mobilBiasa.getMerek());
        mobilBiasa.isiBahanBakar();          // Menggunakan method dasar
        mobilBiasa.isiBahanBakar(100000);    // Menggunakan versi biaya (int)
        mobilBiasa.isiBahanBakar(12.5);      // Menggunakan versi liter (double)

        // --------------------------------------------------
        // CONTOH 2: Pewarisan & Polimorfisme Dinamis (Overriding)
        // --------------------------------------------------
        System.out.println("\n[2. Demo Inheritance & Overriding]");
        
        // Membuat objek dengan tipe referensi kelas induk (Kendaraan)
        // tetapi instansiasinya menggunakan kelas anak yang spesifik
        Kendaraan tesla = new MobilListrik("Tesla Model 3");
        Kendaraan ducati = new MotorBalap("Ducati Panigale");

        // Di bawah ini tipe datanya sama-sama "Kendaraan",
        // tetapi perilakunya otomatis berubah total saat runtime mengikuti objek aslinya.
        System.out.println("Kendaraan: " + tesla.getMerek());
        tesla.isiBahanBakar(); // Outputnya berupa dicas, bukan isi bensin umum

        System.out.println("\nKendaraan: " + ducati.getMerek());
        ducati.isiBahanBakar(); // Outputnya berupa bensin oktan tinggi
    }
}
