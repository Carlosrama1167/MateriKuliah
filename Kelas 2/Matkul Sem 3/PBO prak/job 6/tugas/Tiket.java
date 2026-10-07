public class Tiket {
    protected String kodeTiket;
    protected String namaPenumpang;
    protected String rute;
    protected double hargaDasar;

    public Tiket(String kodeTiket, String namaPenumpang, String rute, double hargaDasar) {
        this.kodeTiket = kodeTiket;
        this.namaPenumpang = namaPenumpang;
        this.rute = rute;
        this.hargaDasar = hargaDasar;
    }

    public double getHargaDasar() {
        return hargaDasar;
    }

    public void tampilkanData() {
        System.out.println("Kode Tiket     = " + kodeTiket);
        System.out.println("Nama Penumpang = " + namaPenumpang);
        System.out.println("Rute           = " + rute);
        System.out.println("Harga Dasar    = " + (int) hargaDasar);
    }
}