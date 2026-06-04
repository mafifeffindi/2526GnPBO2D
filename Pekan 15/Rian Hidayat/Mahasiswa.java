class Mahasiswa {
    String nama;

    Mahasiswa(String nama) {
        this.nama = nama;
    }

    void aktivitas() {
        System.out.println(nama + " adalah seorang mahasiswa.");
    }
}

class MahasiswaInformatika extends Mahasiswa {

    MahasiswaInformatika(String nama) {
        super(nama);
    }

    @Override
    void aktivitas() {
        System.out.println(nama + " sedang belajar pemrograman Java.");
    }
}

class MahasiswaSI extends Mahasiswa {

    MahasiswaSI(String nama) {
        super(nama);
    }

    @Override
    void aktivitas() {
        System.out.println(nama + " sedang menganalisis sistem informasi.");
    }
}

public class Main {
    public static void main(String[] args) {

        Mahasiswa mhs1 = new MahasiswaInformatika("Rian");
        Mahasiswa mhs2 = new MahasiswaSI("Rivaldi");

        mhs1.aktivitas();
        mhs2.aktivitas();
    }
}
