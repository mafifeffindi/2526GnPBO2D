* @author Noor Fathiatul Alea
 */
// Superclass
class Kendaraan {
    protected String nama;
    public Kendaraan(String nama) {
        this.nama = nama;
    }
    public void bergerak() {
        System.out.println(nama + " sedang bergerak.");
    }
}
// Subclass Mobil
class Mobil extends Kendaraan {

    public Mobil(String nama) {
        super(nama);
    }
    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan roda di jalan.");
    }
}
// Subclass Motor
class Motor extends Kendaraan {
    public Motor(String nama) {
        super(nama);
    }
    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan dua roda.");
    }
}
// Main Class
public class Main {
    public static void main(String[] args) {

        // Polymorphism
        Kendaraan kendaraan1 = new Mobil("Toyota Avanza");
        Kendaraan kendaraan2 = new Motor("Honda Vario");

        kendaraan1.bergerak();
        kendaraan2.bergerak();
    }
}
