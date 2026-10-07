package praktikum;

class PerangkatElektronik {
    protected String merk;
    protected int daya;

    public PerangkatElektronik(String merk, int daya) {
        this.merk = merk;
        this.daya = daya;
    }

    public void nyalakan() {
        System.out.println(merk + " diaktifkan.");
    }

    public void matikan() {
        System.out.println(merk + " dimatikan.");
    }

    public void cetakInformasi() {
        System.out.println("Merk : " + merk);
        System.out.println("Daya : " + daya + " Watt");
    }
}

public class Mouse extends PerangkatElektronik {
    private String jenisKoneksi;
    private int jumlahTombol;

    public Mouse(String merk, int daya, String jenisKoneksi, int jumlahTombol) {
        super(merk, daya);
        this.jenisKoneksi = jenisKoneksi;
        this.jumlahTombol = jumlahTombol;
    }

    public void klikKanan() {
        System.out.println("Mouse melakukan klik kanan.");
    }

    public void gulirRoda() {
        System.out.println("Roda mouse digulir ke atas/bawah.");
    }

    @Override
    public void cetakInformasi() {
        System.out.println("--- INFORMASI MOUSE ---");
        super.cetakInformasi();
        System.out.println("Jenis Koneksi  : " + jenisKoneksi);
        System.out.println("Jumlah Tombol  : " + jumlahTombol);
    }
}
