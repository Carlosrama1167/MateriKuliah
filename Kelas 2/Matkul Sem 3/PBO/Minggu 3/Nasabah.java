
public class Nasabah {

    private String nomorRekening;
    private String nama;
    private int saldo;

    // Setter Nomor Rekening
    public void setNomorRekening(String norek) {
        nomorRekening = norek;
    }

    // Getter Nomor Rekening
    public String getNomorRekening() {
        return nomorRekening;
    }

    // Setter Nama
    public void setNama(String nm) {
        nama = nm;
    }

    // Getter Nama
    public String getNama() {
        return nama;
    }

    // Getter Saldo
    public int getSaldo() {
        return saldo;
    }

    // Menambah saldo
    public void setor(int nominal) {
        saldo += nominal;
        System.out.println("Setor Rp" + nominal);
    }

    // Mengurangi saldo
    public void tarik(int nominal) {
        if (saldo >= nominal) {
            saldo -= nominal;
            System.out.println("Tarik Rp" + nominal);
        } else {
            System.out.println("Saldo tidak cukup!");
        }
    }
}