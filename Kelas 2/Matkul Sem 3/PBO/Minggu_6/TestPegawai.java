

public class TestPegawai {
    public static void main(String[] args) {
        System.out.println("=== Pengujian Multilevel Inheritance ===\n");

        System.out.println("--- Data Pegawai ---");
        Pegawai p1 = new Pegawai("Budi Santoso", 5000000);
        p1.tampilkanInformasi();
        System.out.println("Total Gaji  : Rp " + p1.hitungGajiTotal());

        System.out.println("\n--- Data Manajer ---");
        Manajer m1 = new Manajer("Siti Aminah", 8000000, 3000000);
        m1.tampilkanInformasi();
        System.out.println("Total Gaji  : Rp " + m1.hitungGajiTotal());

        System.out.println("\n--- Data Supervisor ---");
        Supervisor s1 = new Supervisor("Eko Prasetyo", 10000000, 4000000, 2500000);
        s1.tampilkanInformasi();
    }
}