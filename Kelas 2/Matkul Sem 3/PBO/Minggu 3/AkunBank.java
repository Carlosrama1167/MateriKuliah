
public class AkunBank {

    protected String jenisAkun = "Tabungan";
    protected int saldo = 1000000;

    public void tampilkanInfo() {
        System.out.println("Jenis Akun : " + jenisAkun);
        System.out.println("Saldo      : Rp" + saldo);
    }
}