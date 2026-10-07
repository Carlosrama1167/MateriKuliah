public class Buku extends kertas{
    private String judul;
    private String pengarang;
    private int halamansekarang;

    public Buku(String judul, String pengarang, int halamansekarang, String jenis) {
        super(jenis);
        this.judul = judul;
        this.pengarang = pengarang;
        this.halamansekarang = halamansekarang;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return pengarang;
    }

    public void setPenulis(String penulis) {
        this.pengarang = penulis;
    }

    public int getHalamanSekarang() {
        return halamansekarang;
    }

    public void setHalamanSekarang(int halamansekarang) {
        this.halamansekarang = halamansekarang;
    }

    public void balikhalaman(){
        System.out.println("Halaman Buku " + judul + " dibalik");
    }

    public void pinjamkan(){
        System.out.println("Buku " + judul + " dipinjam");
    }

    @Override

    public void info() {
        System.out.println("--- Informasi Buku ---");
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Halaman Sekarang: " + halamansekarang);
        super.info();
    }

}

class kertas{
    protected String jenis;

    public kertas(String jenis){
        this.jenis = jenis;
    }

    public void info(){
        System.out.println("Jenis Kertas: " + jenis);
    }
}


