public class TiketDomestik extends TiketPesawat {
    private double pajakBandara;

    public TiketDomestik(String kodeTiket, String namaPenumpang, String rute, double hargaDasar, String maskapai, int beratBagasi, double pajakBandara) {
        super(kodeTiket, namaPenumpang, rute, hargaDasar, maskapai, beratBagasi);
        this.pajakBandara = pajakBandara;
    }

    public double hitungTotalBayar() {
        return hargaDasar + hitungBiayaBagasi() + pajakBandara;
    }

    @Override
    public void tampilkanData() {
        System.out.println("======== Tiket Pesawat Domestik ========");
        super.tampilkanData();
        System.out.println("Pajak Bandara  = " + (int) pajakBandara);
        System.out.println("Total Bayar    = " + (int) hitungTotalBayar());
    }
}