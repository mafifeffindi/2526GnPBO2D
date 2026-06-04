import java.util.Scanner;
// sepurclass
class Buku {
    String judul;
    int tahunTerbit;
//constructor buku
    Buku(String judul, int tahunTerbit) {
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }
//metod tampil
    void tampil() {
        System.out.println("Judul : " + judul);
        System.out.println("Tahun Terbit : " + tahunTerbit);
    }
}
//inherintance
class BukuData extends Buku {
    String pengarang;
    String penerbit;
    String kategori;
    int stok;

    BukuData(String judul, int tahun, String pengarang, String penerbit,
            String kategori, int stok) {
        super(judul, tahun);
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.kategori = kategori;
        this.stok = stok;
    }

    void tampilData() {
        tampil();
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Penerbit : " + penerbit);
        System.out.println("Kategori : " + kategori);
        System.out.println("Stok : " + stok);
    }
}
//atribut
class Novel extends Buku {
    String penulis;
    String kategoriNovel;
    String status;

    Novel(String judul, int tahun, String penulis, 
            String kategoriNovel, String status) {
        super(judul, tahun);
        this.penulis = penulis;
        this.kategoriNovel = kategoriNovel;
        this.status = status;
    }

    void tampilNovel() {
        tampil();
        System.out.println("Penulis : " + penulis);
        System.out.println("Kategori Novel : " + kategoriNovel);
        System.out.println("Status Peminjaman : " + status);
    }
}

//turunan untuk Novel Lama
class NovelLama extends Novel {

    NovelLama(String judul, int tahun, String penulis, 
            String kategoriNovel, String status) {
        super(judul, tahun, penulis, kategoriNovel, status);
    }

    void info() {
        System.out.println("Jenis : Novel Lama");
    }
}

//turunan untuk Novel Baru
class NovelBaru extends Novel {

    NovelBaru(String judul, int tahun, String penulis, 
            String kategoriNovel, String status) {
        super(judul, tahun, penulis, kategoriNovel, status);
    }

    void info() {
        System.out.println("Jenis : Novel Baru");
    }
}

public class Main {
//method cek tahun
    static void cekTahun(Novel n, int batasTahun) {
        if (n.tahunTerbit < batasTahun) {
            System.out.println(n.judul + " termasuk Novel Lama");
        } else {
            System.out.println(n.judul + " termasuk Novel Baru");
        }
    }
//mthod main
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        BukuData b1 = new BukuData("Pendidikan Karakter", 2024, "rama",
                "Trunojoyo", "Buku Pendidikan", 10);
        BukuData b2 = new BukuData("Pemrograman Java", 2023, "alan",
                "Informatika", "Buku Teknik", 5);
        BukuData b3 = new BukuData("Fiqih Islam", 2022, "Ratu",
                "Mizan", "Buku Agama", 7);
        BukuData b4 = new BukuData("Ilmu Sosial Dasar", 2021,
                "Rina", "Gramedia", "Buku Sosial", 8);

        System.out.println("Data Buku 1");
        b1.tampilData();
        System.out.println("Data Buku 2");
        b2.tampilData();
        System.out.println("Data Buku 3");
        b3.tampilData();
        System.out.println("Data Buku 4");
        b4.tampilData();

        Novel n1 = new Novel("Cinta Senja",2025,"Budi","Romantis","Dipinjam");
        Novel n2 = new Novel("Medan Pertempuran",2024,"Putri","Novel Perang",
                "Tersedia");
        Novel n3 = new Novel("Rumah Tua",2023,"Dina","Novel Horor","Dipinjam");

        System.out.print("\nMasukkan batas tahun novel: ");
        int batas = input.nextInt();

        System.out.println("\nData Novel");
        n1.tampilNovel();
        cekTahun(n1, batas);

        System.out.println();
        n2.tampilNovel();
        cekTahun(n2, batas);

        System.out.println();
        n3.tampilNovel();
        cekTahun(n3, batas);
    }
}
