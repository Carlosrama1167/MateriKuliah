public class TiketKereta extends Tiket {
    private int nomorGerbong;
    private String nomorKursi;

    public TiketKereta(String kodeTiket, String namaPenumpang, String rute, double hargaDasar, int nomorGerbong, String nomorKursi) {
        super(kodeTiket, namaPenumpang, rute, hargaDasar);
        this.nomorGerbong = nomorGerbong;
        this.nomorKursi = nomorKursi;
    }

    public double hitungTotalBayar() {
        return hargaDasar;
    }

    @Override
    public void tampilkanData() {
        System.out.println("=========== Tiket Kereta ===========");
        super.tampilkanData();
        System.out.println("Nomor Gerbong  = " + nomorGerbong);
        System.out.println("Nomor Kursi    = " + nomorKursi);
        System.out.println("Total Bayar    = " + (int) hitungTotalBayar());
    }
}