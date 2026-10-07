public class Tiket {

    // Atribut private
    private String judulFilm;
    private double hargaDasar;
    private boolean statusPembayaran;

    // Konstruktor
    public Tiket(String judulFilm, double hargaDasar) {
        this.judulFilm = judulFilm;

        // Validasi harga
        if (hargaDasar < 0) {
            this.hargaDasar = 35000;
        } else {
            this.hargaDasar = hargaDasar;
        }

        // Status awal belum dibayar
        this.statusPembayaran = false;
    }

    // Getter
    public String getJudulFilm() {
        return judulFilm;
    }

    public double getHargaDasar() {
        return hargaDasar;
    }

    public boolean getStatusPembayaran() {
        return statusPembayaran;
    }

    // Method pembayaran
    public void lakukanPembayaran() {
        statusPembayaran = true;
    }
}