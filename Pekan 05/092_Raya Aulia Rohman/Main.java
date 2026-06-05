package kampus;//package

//Abstraction
abstract class Orang {
    protected String nama;

    public Orang(String nama) {
        this.nama = nama;
    }

    abstract void tampilInfo();
}

class Mahasiswa extends Orang { //inheritance
    
 // encapsulation
    private int umur;

    public Mahasiswa(String nama, int umur) {
        super(nama);// super keyword
        this.umur = umur;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    //Inner Class
class Nilai {
        int nilai;

        Nilai(int nilai) {
            this.nilai = nilai;
        }

        void tampilNilai() {
            System.out.println("Nilai Mahasiswa: " + nilai);
        }
    }
//Polymorphism
@Override
    void tampilInfo() {
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Umur: " + umur);
    }
    public static void main(String[] args) {

        Mahasiswa mhs = new Mahasiswa("Raya", 18);

        mhs.tampilInfo();

        Mahasiswa.Nilai nilai = mhs.new Nilai(90);
        nilai.tampilNilai();
    }
}
