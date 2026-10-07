

public class Supervisor extends Manajer {
    private double insentifProyek;

    public Supervisor(String nama, double gajiPokok, double tunjangan, double insentifProyek) {
        super(nama, gajiPokok, tunjangan);
        this.insentifProyek = insentifProyek;
    }

    public double getInsentifProyek() {
        return insentifProyek;
    }

    @Override
    public double hitungGajiTotal() {
        return super.hitungGajiTotal() + insentifProyek;
    }

    @Override
    public void tampilkanInformasi() {
        super.tampilkanInformasi();
        System.out.println("Insentif    : Rp " + insentifProyek);
        System.out.println("Total Gaji  : Rp " + hitungGajiTotal());
    }
}
