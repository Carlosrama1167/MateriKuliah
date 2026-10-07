class Kendaraan{
    protected String merk;
    protected String warna;

    public Kendaraan(String merk, String warna){
        this.merk = merk;
        this.warna = warna;
    }

    public void nyalakan(){
        System.out.println(merk + " Dinyalakan"); 
    }

    public void matikan(){
        System.out.println(merk + " Dimatikan");
    }

    public void info(){
        System.out.println("Merk    : " + merk);
        System.out.println("Warna   : " + warna);
    }
}
public class Motor extends Kendaraan{
    private int kecepatan;

    public Motor(String merk, String warna, int kecepatan){
        super(merk, warna);
        this.kecepatan = kecepatan;
    }

    public void tambahkecepatan(){
        System.out.println("Kecepatan Motor " + merk + " bertambah");
    }

    public void kurangikecepatan(){
        System.out.println("Kecepatan Motor " + merk + " berkurang");
    }

    public void nyalakanlampu(){
        System.out.println("Lampu Motor " + merk + " dinyalakan");
    }

    @Override
    public void info(){
        System.out.println("--- Informasi Motor ---");
        super.info();
        System.out.println("Kecepatan Motor: " + kecepatan + " km/h");
    }
}