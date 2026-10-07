public class TiketPesawat extends Tiket {
    protected String maskapai;
    protected int beratBagasi;

    public TiketPesawat(String kodeTiket, String namaPenumpang, String rute, double hargaDasar, String maskapai, int beratBagasi) {
        super(kodeTiket, namaPenumpang, rute, hargaDasar);
        this.maskapai = maskapai;
        this.beratBagasi = beratBagasi;
    }

    public double hitungBiayaBagasi() {
        // Contoh ketentuan: jika bagasi melebihi 20kg, dikenakan biaya Rp 50.000/kg
        if (beratBagasi > 20) {
            return (beratBagasi - 20) * 50000;
        }
        return 0;
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Maskapai       = " + maskapai);
        System.out.println("Berat Bagasi   = " + beratBagasi + " kg");
        System.out.println("Biaya Bagasi   = " + (int) hitungBiayaBagasi());
    }
}