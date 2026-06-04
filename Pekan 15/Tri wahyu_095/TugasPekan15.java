class Kendaraan {
    void bergerak() {
        System.out.println("Kendaraan sedang bergerak");
    }
}

// Subclass Mobil
class Mobil extends Kendaraan {
    @Override
    void bergerak() {
        System.out.println("Mobil berjalan di jalan raya");
    }
}

// Subclass Motor
class Motor extends Kendaraan {
    @Override
    void bergerak() {
        System.out.println("Motor melaju dengan cepat");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        // Inheritance
        Mobil mobil = new Mobil();
        mobil.bergerak();

        // Polymorphism
        Kendaraan k1 = new Mobil();
        Kendaraan k2 = new Motor();

        k1.bergerak();
        k2.bergerak();
    }
}
