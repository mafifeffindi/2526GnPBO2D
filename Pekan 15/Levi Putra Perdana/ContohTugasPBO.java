// Parent Class
class Hewan {
    public void suara() {
        System.out.println("Hewan mengeluarkan suara");
    }
}

// Child Class
class Kucing extends Hewan {
    @Override
    public void suara() {
        System.out.println("Meong");
    }
}

class Anjing extends Hewan {
    @Override
    public void suara() {
        System.out.println("Guk guk");
    }
}

class Sapi extends Hewan {
    @Override
    public void suara() {
        System.out.println("Moo");
    }
}

public class ContohTugasPBO {
    public static void main(String[] args) {

        // Polymorphism
        Hewan hewan1 = new Kucing();
        Hewan hewan2 = new Anjing();
        Hewan hewan3 = new Sapi();

        hewan1.suara();
        hewan2.suara();
        hewan3.suara();
    }
}
