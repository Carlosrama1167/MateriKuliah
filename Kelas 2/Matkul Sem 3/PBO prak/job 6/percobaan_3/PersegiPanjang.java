public class PersegiPanjang extends Bangun {
    public int panjang;
    public int lebar;

    // Overriding method hitungLuas() dari superclass Bangun
    @Override
    public void hitungLuas() {
        int luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang: " + luas);
    }

    // Overriding method hitungKeliling() dari superclass Bangun
    @Override
    public void hitungKeliling() {
        int keliling = 2 * (panjang + lebar);
        System.out.println("Keliling Persegi Panjang: " + keliling);
    }
}