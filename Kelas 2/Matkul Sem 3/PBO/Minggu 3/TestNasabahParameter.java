public class TestNasabahParameter {

    public static void main(String[] args) {

        Nasabah nas = new Nasabah();
        nas.setNomorRekening("987654321");
        nas.setNama("Carlos Rama");
        nas.setor(250000);

        System.out.println("=== DATA NASABAH ===");
        System.out.println("Nomor Rekening : " + nas.getNomorRekening());
        System.out.println("Nama           : " + nas.getNama());
        System.out.println("Saldo Awal     : " + nas.getSaldo());

        nas.setor(50000);

        System.out.println("Saldo Setelah Setor : " + nas.getSaldo());

        nas.tarik(100000);

        System.out.println("Saldo Setelah Tarik : " + nas.getSaldo());

    }
}