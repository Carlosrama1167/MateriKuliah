public class TestBioskop {

    public static void main(String[] args) {

        // Tiket pertama (harga normal)
        Tiket tiket1 = new Tiket("Avengers: Endgame", 50000);

        System.out.println("=== DATA TIKET 1 ===");
        System.out.println("Judul Film        : " + tiket1.getJudulFilm());
        System.out.println("Harga Dasar       : Rp " + tiket1.getHargaDasar());
        System.out.println("Status Pembayaran : " + tiket1.getStatusPembayaran());

        tiket1.lakukanPembayaran();

        System.out.println("\nSetelah melakukan pembayaran");
        System.out.println("Status Pembayaran : " + tiket1.getStatusPembayaran());

        // Tiket kedua (harga negatif)
        Tiket tiket2 = new Tiket("Naruto The Movie", -10000);

        System.out.println("\n=== DATA TIKET 2 ===");
        System.out.println("Judul Film        : " + tiket2.getJudulFilm());
        System.out.println("Harga Dasar       : Rp " + tiket2.getHargaDasar());
        System.out.println("Status Pembayaran : " + tiket2.getStatusPembayaran());
    }
}