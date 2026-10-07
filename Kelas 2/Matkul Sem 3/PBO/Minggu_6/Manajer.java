

public class Manajer extends Pegawai {
    private double tunjangan;

    public Manajer(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    @Override
    public double hitungGajiTotal() {
        return super.getGajiPokok() + tunjangan;
    }

    @Override
    public void tampilkanInformasi() {
        super.tampilkanInformasi();
        System.out.println("Tunjangan   : Rp " + tunjangan);
    }
}
