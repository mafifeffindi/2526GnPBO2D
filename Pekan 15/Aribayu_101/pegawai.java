// Parent Class (Superclass)
class Pegawai {

    // Method yang akan diwariskan ke class turunan
    void hitungGaji() {
        System.out.println("Menghitung gaji pegawai");
    }
}

// Child Class (Subclass) yang mewarisi class Pegawai
class PegawaiTetap extends Pegawai {

    // Override method hitungGaji() milik parent class
    @Override
    void hitungGaji() {
        System.out.println("Gaji Pegawai Tetap = Rp5.000.000");
    }
}

// Child Class (Subclass) yang mewarisi class Pegawai
class PegawaiKontrak extends Pegawai {

    // Override method hitungGaji() milik parent class
    @Override
    void hitungGaji() {
        System.out.println("Gaji Pegawai Kontrak = Rp3.000.000");
    }
}

// Class utama
public class Main {

    public static void main(String[] args) {

        // Polymorphism:
        // Variabel bertipe Pegawai (parent)
        // menyimpan objek PegawaiTetap (child)
        Pegawai p1 = new PegawaiTetap();

        // Polymorphism:
        // Variabel bertipe Pegawai (parent)
        // menyimpan objek PegawaiKontrak (child)
        Pegawai p2 = new PegawaiKontrak();

        // Memanggil method hitungGaji()
        // Java akan menjalankan method milik PegawaiTetap
        p1.hitungGaji();

        // Memanggil method hitungGaji()
        // Java akan menjalankan method milik PegawaiKontrak
        p2.hitungGaji();
    }
}
