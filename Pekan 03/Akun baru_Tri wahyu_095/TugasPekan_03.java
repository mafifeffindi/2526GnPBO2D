
import java.util.Scanner;

public class Mahasiswa {
    

    // 
    private String name;
    private int age;
    private String city;

    // 
    public Mahasiswa(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    // 
    public void displayInfo() {
        System.out.println("Nama  : " + name);
        System.out.println("Umur  : " + age);
        System.out.println("Kota  : " + city);
    }

    // 
    public static void main(String[] args) {

        // 
        Mahasiswa mhs1 = new Mahasiswa("Tri wahyu fajar malik", 20, "Jombang");

        // 
        mhs1.displayInfo();
    }
}
