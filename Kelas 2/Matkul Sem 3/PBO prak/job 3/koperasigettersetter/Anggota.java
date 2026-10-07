public class Anggota {

    private String nama;
    private String alamat;
    private int simpanan;

    Anggota(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        this.simpanan = 0;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getSimpanan() {
        return simpanan;
    }

    public void setor(int uang) {
        simpanan += uang;
    }

    public void pinjam(int uang) {
        simpanan -= uang;
    }
}