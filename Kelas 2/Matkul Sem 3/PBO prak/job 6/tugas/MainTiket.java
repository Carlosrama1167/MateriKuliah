public class MainTiket {
    public static void main(String[] args) {
        // Tiket Kereta
        TiketKereta tk = new TiketKereta("KA-001", "Andi", "Malang - Jakarta", 350000, 3, "12A");
        tk.tampilkanData();

        // Tiket Pesawat Domestik
        TiketDomestik td = new TiketDomestik("GA-102", "Sinta", "Surabaya - Denpasar", 900000, "Garuda Indonesia", 25, 75000);
        td.tampilkanData();

        // Tiket Pesawat Internasional
        TiketInternasional ti = new TiketInternasional("SQ-205", "Budi", "Jakarta - Singapura", 2500000, "Singapore Airlines", 20, "C1234567", 150000);
        ti.tampilkanData();
    }
}