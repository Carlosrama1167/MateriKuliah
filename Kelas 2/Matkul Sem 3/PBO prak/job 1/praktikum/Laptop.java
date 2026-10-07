package praktikum;

class Komputer extends PerangkatElektronik {
    protected String sistemOperasi;
    protected int kapasitasRam;

    public Komputer(String merk, int daya, String sistemOperasi, int kapasitasRam) {
        super(merk, daya);
        this.sistemOperasi = sistemOperasi;
        this.kapasitasRam = kapasitasRam;
    }
}

public class Laptop extends Komputer {
    private double ukuranLayar;
    private double berat;

    public Laptop(String merk, int daya, String sistemOperasi, int kapasitasRam, double ukuranLayar, double berat) {
        super(merk, daya, sistemOperasi, kapasitasRam);
        this.ukuranLayar = ukuranLayar;
        this.berat = berat;
    }

    public void bukaLayar() {
        System.out.println("Layar laptop dibuka.");
    }

    public void jalankanIde() {
        System.out.println("Menjalankan program coding di laptop.");
    }

    @Override
    public void cetakInformasi() {
        System.out.println("--- INFORMASI LAPTOP ---");
        super.cetakInformasi();
        System.out.println("Sistem Operasi : " + sistemOperasi);
        System.out.println("Kapasitas RAM  : " + kapasitasRam + " GB");
        System.out.println("Ukuran Layar   : " + ukuranLayar + " Inch");
        System.out.println("Berat          : " + berat + " kg");
    }
}
