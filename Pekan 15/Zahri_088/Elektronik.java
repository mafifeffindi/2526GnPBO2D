class Elektronik {//superclass
    String merk; // Atribut
    public Elektronik(String merk) { //constructor
        this.merk = merk;
    }
    public void nyalakan() { //method
        System.out.println("Perangkat elektronik dinyalakan."); 
    }
}
class Smartphone extends Elektronik { //subclass1
    public Smartphone(String merk) { // Constructor
        super(merk);
    }
    //POLYMORPHISM 
    @Override
    public void nyalakan() {
        System.out.println(" HP " + merk + " menyala: Menampilkan logo");
    }
}
class Laptop extends Elektronik {//subclass2
    public Laptop(String merk) {//constructor
        super(merk);
    }
    //POLYMORPHISM 
    @Override 
    public void nyalakan() {
        System.out.println(" Laptop " + merk + " hidup dan masuk ke Desktop...");
    }
}
public class ZahriGadget { // mainclass
    public static void main(String[] args) {
        //Polimorfisme
        Elektronik gadget1 = new Smartphone("Samsung"); 
        Elektronik gadget2 = new Laptop("ASUS");

        System.out.print("1."); 
        gadget1.nyalakan(); 
        System.out.print("2.");
        gadget2.nyalakan(); 
    }
}
