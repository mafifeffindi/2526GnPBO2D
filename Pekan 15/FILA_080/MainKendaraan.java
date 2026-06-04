class Kendaraan {
    String merk;
    String warna;

    Kendaraan(String merk, String warna) {
        this.merk = merk;
        this.warna = warna;
    }

    void tampilData() {
        System.out.println("Merk  : " + merk);
        System.out.println("Warna : " + warna);
    }

    void jenis() {
        System.out.println("Jenis Kendaraan");
    }
}

class Mobil extends Kendaraan {
    int jumlahPintu;

    Mobil(String merk, String warna, int jumlahPintu) {
        super(merk, warna);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    void jenis() {
        System.out.println("Jenis: Mobil");
    }

    @Override
    void tampilData() {
        super.tampilData();
        System.out.println("Jumlah Pintu : " + jumlahPintu);
    }
}

class Motor extends Kendaraan {
    String tipe;

    Motor(String merk, String warna, String tipe) {
        super(merk, warna);
        this.tipe = tipe;
    }

    @Override
    void jenis() {
        System.out.println("Jenis: Motor");
    }

    @Override
    void tampilData() {
        super.tampilData();
        System.out.println("Tipe : " + tipe);
    }
}

public class MainKendaraan {
    public static void main(String[] args) {

        // Polymorphism
        Kendaraan k1 = new Mobil("Toyota", "Hitam", 4);
        Kendaraan k2 = new Motor("Honda", "Merah", "Matic");

        System.out.println("=== Data Mobil ===");
        k1.tampilData();
        k1.jenis();

        System.out.println();

        System.out.println("=== Data Motor ===");
        k2.tampilData();
        k2.jenis();
    }
}