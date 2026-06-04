class AlatTulis {
    protected String nama;
    protected int harga;

    public AlatTulis(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public void tampilInfo() {
        System.out.println("Nama  : " + nama);
        System.out.println("Harga : Rp" + harga);
    }

    public void fungsi() {
        System.out.println("Alat tulis memiliki fungsi umum.");
    }
}

class Pensil extends AlatTulis {
    private String jenis;

    public Pensil(String nama, int harga, String jenis) {
        super(nama, harga); //super() untuk memanggil constructor milik superclass sehingga atribut nama dan harga dapat diinisialisasi
        this.jenis = jenis;
    }

    @Override //menggantikan method superclass
    public void tampilInfo() {
        super.tampilInfo();//memanggil method milik class induk
        System.out.println("Jenis : " + jenis);
    }

    @Override
    public void fungsi() {
        System.out.println("Pensil digunakan untuk menulis dan menggambar.");
    }
}

class Pulpen extends AlatTulis {
    private String warnaTinta;

    public Pulpen(String nama, int harga, String warnaTinta) {
        super(nama, harga);
        this.warnaTinta = warnaTinta;
    }
    @Override//menggantikan method dari super class
    public void tampilInfo() {

        super.tampilInfo();//memanggil method tampil info milik class induk
        System.out.println("Warna Tinta : " + warnaTinta);
    }

    @Override
    public void fungsi() {
        System.out.println("Pulpen digunakan untuk menulis dengan tinta.");
    }
}

class Main {
    public static void main(String[] args) {

        System.out.println("=== DATA PENSIL ===");
        AlatTulis alat1 = new Pensil("Pensil 2B", 3000, "2B");
        alat1.tampilInfo();
        alat1.fungsi();

        System.out.println();

        System.out.println("=== DATA PULPEN ===");
        AlatTulis alat2 = new Pulpen("Pulpen Pilot", 5000, "Biru");
        alat2.tampilInfo();
        alat2.fungsi();
    }
}
