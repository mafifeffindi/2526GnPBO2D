/*@author Taufiq*/
class Hewan {
    String nama;

    public Hewan(String nama) {
        this.nama = nama;
    }
    public void suara() {
        System.out.println("Hewan bersuara...");
    }
}
class Kucing extends Hewan {
    
    public Kucing(String nama) {
        super(nama);
    }

    @Override//nama method dan isi
    public void suara() {
        System.out.println(nama + " berkata: Meong");
    }
}
class Bebek extends Hewan {

    public Bebek(String nama) {
        super(nama);
    }
    
    @Override
    public void suara() {
        System.out.println(nama + " berkata: Guk guk");
    }
}
public class Main {
    public static void main(String[] args) {

        Hewan h1 = new Kucing("Kitty");
        Hewan h2 = new Bebek("Wekwek");

        h1.suara();
        h2.suara();
    }
}
