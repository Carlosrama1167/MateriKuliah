package praktikum;

public class Handphone extends Komputer {
    private int jumlahKamera;
    private String jaringanSeluler;

    public Handphone(String merk, int daya, String sistemOperasi, int kapasitasRam, int jumlahKamera, String jaringanSeluler) {
        super(merk, daya, sistemOperasi, kapasitasRam);
        this.jumlahKamera = jumlahKamera;
        this.jaringanSeluler = jaringanSeluler;
    }

    public void ambilFoto() {
        System.out.println("Kamera HP mengambil foto.");
    }

    private void _hp_panggil() {
        // Method bantu pengganti
    }

    public void lakukanPanggilan(String nomor) {
        System.out.println("Melakukan panggilan ke nomor " + nomor);
    }

    @Override
    public void cetakInformasi() {
        System.out.println("--- INFORMASI HANDPHONE (HP) ---");
        super.cetakInformasi();
        System.out.println("Sistem Operasi : " + sistemOperasi);
        System.out.println("Kapasitas RAM  : " + kapasitasRam + " GB");
        System.out.println("Jumlah Kamera  : " + jumlahKamera);
        System.out.println("Jaringan       : " + jaringanSeluler);
    }
}