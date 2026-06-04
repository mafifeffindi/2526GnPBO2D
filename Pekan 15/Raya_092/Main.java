class Hewan {

    void suara() {
        System.out.println("Hewan bersuara");
    }
}

class Kucing extends Hewan {

    @Override
    void suara() {
        System.out.println("Kucing mengeong");
    }
}

class Anjing extends Hewan {

    @Override
    void suara() {
        System.out.println("Anjing menggonggong");
    }
}

public class Main {

    public static void main(String[] args) {

        Hewan h1 = new Kucing();
        Hewan h2 = new Anjing();

        h1.suara();
        h2.suara();
    }
}
