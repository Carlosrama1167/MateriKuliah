public class Mobil {

    // atribut private (enkapsulasi)
    private int kecepatan;
    private boolean kontakOn;

    // menyalakan mesin
    public void nyalakanMesin() {
        kontakOn = true;
        System.out.println("Mesin dinyalakan.");
    }

    // mematikan mesin
    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
        System.out.println("Mesin dimatikan.");
    }

    // menambah kecepatan
    public void tambahKecepatan() {
        if (kontakOn) {
            kecepatan += 10;
            System.out.println("Kecepatan bertambah 10 km/jam.");
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena mesin OFF!");
        }
    }

    // mengurangi kecepatan
    public void kurangiKecepatan() {
        if (kontakOn) {
            kecepatan -= 10;

            if (kecepatan < 0) {
                kecepatan = 0;
            }

            System.out.println("Kecepatan berkurang 10 km/jam.");
        } else {
            System.out.println("Mesin masih OFF.");
        }
    }

    // tampil status mobil
    public void tampilkanStatus() {
        System.out.println("=== STATUS MOBIL ===");
        System.out.println("Kontak : " + (kontakOn ? "ON" : "OFF"));
        System.out.println("Kecepatan : " + kecepatan + " km/jam");
        System.out.println();
    }
}