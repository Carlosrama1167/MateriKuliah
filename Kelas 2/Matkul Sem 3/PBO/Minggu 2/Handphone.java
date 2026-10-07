
public class Handphone extends Kendaraan {
    private String StatusJaringan;
    private int LevelBaterai;
    private int KecerahanLayar;

    public Handphone(String merk, String warna, String StatusJaringan, int LevelBaterai, int KecerahanLayar) {
        super(merk, warna);
        this.StatusJaringan = StatusJaringan;
        this.LevelBaterai = LevelBaterai;
        this.KecerahanLayar = KecerahanLayar;
    }

    public void isidaya(){
        System.out.println("Handphone " + merk + " Sedang diisi daya");
    }

    public void aturkecerahan(){
        System.out.println("Kecerahan Layar Handphone " + merk + " diatur");
    }

    public void aturjaringan(){
        System.out.println("Jaringan Handphone " + merk + " diatur");
    }
    
    @Override
    public void info(){
        System.out.println("--- Informasi Handphone ---");
        super.info();
        System.out.println("Status Jaringan: " + StatusJaringan);
        System.out.println("Level Baterai: " + LevelBaterai + "%");
        System.out.println("Kecerahan Layar: " + KecerahanLayar + "%");
    }


}
