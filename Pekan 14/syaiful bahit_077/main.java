// 1. Membuat Class Mahasiswa
class Mahasiswa {
    // 2. Mendefinisikan Atribut
    String nama;
    String nim;
    String jurusan;

    // 3. Constructor: Mengisi semua atribut
    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    // 4. Method: tampilData()
    public void tampilData() {
        System.out.println("Nama    : " + this.nama);
        System.out.println("NIM     : " + this.nim);
        System.out.println("Jurusan : " + this.jurusan);
        System.out.println("---------------------------");
    }
}

// Class Utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        
        // 5. Membuat minimal 2 object
        // Objek Pertama
        Mahasiswa mhs1 = new Mahasiswa("Sipul", "25063110077", "Pendidikan Informatika");
        
        // Objek Kedua
        Mahasiswa mhs2 = new Mahasiswa("Siti Anti Peluru", "220101002", "Pendidikan Informatika");
        
        // Memanggil method tampilData() untuk setiap objek
        System.out.println("=== DATA MAHASISWA ===");
        mhs1.tampilData();
        mhs2.tampilData();
    }
}
