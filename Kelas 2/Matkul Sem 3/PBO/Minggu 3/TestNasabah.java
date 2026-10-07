public class TestNasabah {

    public static void main(String[] args) {

        Nasabah nas = new Nasabah();

        nas.setNomorRekening("123456789");
        nas.setNama("Carlos Rama");

        System.out.println("Nomor Rekening : " + nas.getNomorRekening());
        System.out.println("Nama           : " + nas.getNama());
        System.out.println("Saldo Awal     : " + nas.getSaldo());

        nas.setor(150000);

        System.out.println("Saldo Setelah Setor : " + nas.getSaldo());

        nas.tarik(50000);

        System.out.println("Saldo Setelah Tarik : " + nas.getSaldo());

    }
}