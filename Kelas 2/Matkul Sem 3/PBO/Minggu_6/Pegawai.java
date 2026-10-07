

public class Pegawai {
    private String nama;
    private double gajiPokok;

    public Pegawai(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public String getNama() {
        return nama;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public double hitungGajiTotal() {
        return gajiPokok;
    }

    public void tampilkanInformasi() {
        System.out.println("Nama        : " + nama);
        System.out.println("Gaji Pokok  : Rp " + gajiPokok);
    }
}
