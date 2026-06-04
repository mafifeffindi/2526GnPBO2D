package pbo;

class Pasien {
    protected String nama;
    protected int umur;

    public Pasien(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void informasi() {
        System.out.println("Nama Pasien : " + nama);
        System.out.println("Umur Pasien : " + umur + " tahun");
        System.out.println("Pasien sedang menjalani pemeriksaan.");
    }
}

class PasienUmum extends Pasien {

    public PasienUmum(String nama, int umur) {
        super(nama, umur);
    }

    @Override
    public void informasi() {
        System.out.println("Nama Pasien : " + nama);
        System.out.println("Umur Pasien : " + umur + " tahun");
        System.out.println("Membayar biaya pemeriksaan secara mandiri.");
    }
}

class PasienBPJS extends Pasien {

    public PasienBPJS(String nama, int umur) {
        super(nama, umur);
    }

    @Override
    public void informasi() {
        System.out.println("Nama Pasien : " + nama);
        System.out.println("Umur Pasien : " + umur + " tahun");
        System.out.println("Menggunakan fasilitas BPJS untuk berobat.");
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("====== Selamat Datang di RS Sehat Selalu ======\n");

        Pasien p1 = new PasienUmum("Budi", 25);
        Pasien p2 = new PasienBPJS("cinta", 30);

        p1.informasi();
        System.out.println();
        p2.informasi();

        System.out.println("\n=============== Terimakasih :) ================");
    }
}
