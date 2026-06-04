/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
class SuaraHewan {

    protected String nama;

    public SuaraHewan(String nama) {
        this.nama = nama;
    }

    public void suara() {
        System.out.println("Hewan bersuara");
    }
}

// Inheritance
class Kucing extends SuaraHewan {

    public Kucing(String nama) {
        super(nama);
    }

    // Polymorphism (Method Overriding)
    @Override
    public void suara() {
        System.out.println(nama + " berkata: Meong...");
    }
}

// Inheritance
class Anjing extends SuaraHewan {

    public Anjing(String nama) {
        super(nama);
    }

    // Polymorphism (Method Overriding)
    @Override
    public void suara() {
        System.out.println(nama + " berkata: Guk Guk...");
    }
}

public class Hewan {

    public static void main(String[] args) {

        SuaraHewan hewan1 = new Kucing("Kitty");
        SuaraHewan hewan2 = new Anjing("Doggy");

        hewan1.suara();
        hewan2.suara();
    }
}