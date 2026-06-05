class Person {
    String nama;
    int umur;

    void tampilData() {
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
    }
}

public class Main {
    public static void main(String[] args) {

        Person orang1 = new Person();

        orang1.nama = "Raya";
        orang1.umur = 18;

        orang1.tampilData();
    }
}
