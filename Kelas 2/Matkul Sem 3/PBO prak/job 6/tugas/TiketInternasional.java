public class TiketInternasional extends TiketPesawat {
    private String nomorPaspor;
    private double asuransi;

    public TiketInternasional(String kodeTiket, String namaPenumpang, String rute, double hargaDasar, String maskapai, int beratBagasi, String nomorPaspor, double asuransi) {
        super(kodeTiket, namaPenumpang, rute, hargaDasar, maskapai, beratBagasi);
        this.nomorPaspor = nomorPaspor;
        this.asuransi = asuransi;
    }

    public double hitungTotalBayar() {
        return hargaDasar + hitungBiayaBagasi() + asuransi;
    }

    @Override
    public void tampilkanData() {
        System.out.println("====== Tiket Pesawat Internasional ======");
        super.tampilkanData();
        System.out.println("Nomor Paspor   = " + nomorPaspor);
        System.out.println("Asuransi       = " + (int) asuransi);
        System.out.println("Total Bayar    = " + (int) hitungTotalBayar());
    }
}