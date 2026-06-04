class Hewan {
    String nama;

    public Hewan(String nama) {
        this.nama = nama;
    }

    public void suara() {
        System.out.println("Hewan bersuara");
    }
}

class Kucing extends Hewan {

    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void suara() {
        System.out.println(nama + " mengeong");
    }
}

class Anjing extends Hewan {

    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void suara() {
        System.out.println(nama + " menggonggong");
    }
}

public class Mainn {
    public static void main(String[] args) {

        Hewan h1 = new Kucing("Milo");
        Hewan h2 = new Anjing("Buddy");

        h1.suara();
        h2.suara();
    }
}
