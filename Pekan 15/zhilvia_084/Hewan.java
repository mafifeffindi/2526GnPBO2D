class Hewan {
    public void suara() {
        System.out.println("Hewan mengeluarkan suara");
    }
}

class Kucing extends Hewan {
    @Override
    public void suara() {
        System.out.println("Meong...");
    }
}

class Anjing extends Hewan {
    @Override
    public void suara() {
        System.out.println("Guk guk...");
    }
}

public class Main {
    public static void main(String[] args) {

        // Polymorphism
        Hewan h1 = new Kucing();
        Hewan h2 = new Anjing();

        h1.suara();
        h2.suara();
    }
}
