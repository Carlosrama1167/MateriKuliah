
public class Demo {
    public static void main(String[] args) {
        Motor Motor1 = new Motor("Honda", "Hitam", 100);
        Handphone Handphone1 = new Handphone("Samsung","putih", "5G", 80, 70);
        Mobil Mobil1 = new Mobil("INOVA", "Hitam", "AD 1167 CR", "Hidrolik", 300);
        Buku Buku1 = new Buku("Pemrograman Java", "John Doe", 50, "HVS");
        TiketKereta Tiket1 = new TiketKereta(8, 1000000, "Batik", "HVS");

        // menyalakan motor
        Motor1.nyalakan();
        Motor1.nyalakanlampu();
        Motor1.tambahkecepatan();
        Motor1.kurangikecepatan();
        Motor1.info();
        Motor1.matikan();

        System.out.println();
        // menyalakan handphone
        Handphone1.isidaya();
        Handphone1.aturkecerahan();
        Handphone1.aturjaringan();
        Handphone1.info();

        System.out.println();
        // menyalakan mobil
        Mobil1.kuncipintu();
        Mobil1.bukabagasi();
        Mobil1.isibensin();
        Mobil1.info();

        System.out.println();
        // membaca buku
        Buku1.balikhalaman();
        Buku1.setHalamanSekarang(23);
        Buku1.pinjamkan();
        Buku1.info();

        System.out.println();
        // membeli tiket kereta
        Tiket1.checkin();
        Tiket1.cetaktiket();
        Tiket1.info();
        Tiket1.bataltiket();

    }
}
