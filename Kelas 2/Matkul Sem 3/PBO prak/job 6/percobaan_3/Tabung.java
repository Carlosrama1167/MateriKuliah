public class Tabung extends Bangun {
    public int r;
    public int t;

    // Overriding method hitungLuas() dari superclass Bangun (Luas Permukaan Tabung)
    @Override
    public void hitungLuas() {
        double luas = 2 * Math.PI * r * (r + t);
        System.out.println("Luas Permukaan Tabung: " + luas);
    }

    // Overriding method hitungKeliling() dari superclass Bangun (Keliling Alas Tabung)
    @Override
    public void hitungKeliling() {
        double keliling = 2 * Math.PI * r;
        System.out.println("Keliling Alas Tabung: " + keliling);
    }
}