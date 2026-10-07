public class Percobaan3 {

    public static void main(String[] args) {

        // Membuat objek PersegiPanjang
        PersegiPanjang pp = new PersegiPanjang();
        pp.panjang = 10;
        pp.lebar = 5;
        pp.hitungLuas();
        pp.hitungKeliling();

        System.out.println("----------------------------------");

        // Membuat objek Tabung
        Tabung tabung = new Tabung();
        tabung.r = 7;
        tabung.t = 10;
        tabung.hitungLuas();
        tabung.hitungKeliling();
    }
}