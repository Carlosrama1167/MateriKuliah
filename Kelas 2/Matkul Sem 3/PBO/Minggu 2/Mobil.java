public class Mobil extends Kendaraan {
    private String nomorplat;
    private String statuspintu;
    private int kapasitasbagasi;

    public Mobil(String merk, String warna, String nomorplat, String statuspintu, int kapasitasbagasi) {
        super(merk, warna);
        this.nomorplat = nomorplat;
        this.statuspintu = statuspintu;
        this.kapasitasbagasi = kapasitasbagasi;
    }

    public void kuncipintu(){
        System.out.println("Pintu Mobil " + merk + " dikunci");
    }

    public void bukabagasi(){
        System.out.println("Bagasi Mobil " + merk + " dibuka");
    }

    public void isibensin(){
        System.out.println("Mobil " + merk + " diisi bensin");
    }

    @Override
    public void info(){
        System.out.println("--- Informasi Mobil ---");
        super.info();
        System.out.println("Nomor Plat: " + nomorplat);
        System.out.println("Status Pintu: " + statuspintu);
        System.out.println("Kapasitas Bagasi: " + kapasitasbagasi + " liter");
    }
}
