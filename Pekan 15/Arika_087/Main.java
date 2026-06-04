class Hewan {
    void suara() {
        System.out.println("Hewan mengeluarkan suara");
    }
}

class Kucing extends Hewan {
    @Override
    void suara() {
        System.out.println("Meong...");
    }
}

class Anjing extends Hewan {
    @Override
    void suara() {
        System.out.println("Guk guk...");
    }
}

public class Main {
    public static void main(String[] args) {
        Hewan h1 = new Kucing(); // Polymorphism
        Hewan h2 = new Anjing(); // Polymorphism

        h1.suara();
        h2.suara();
    }
}
