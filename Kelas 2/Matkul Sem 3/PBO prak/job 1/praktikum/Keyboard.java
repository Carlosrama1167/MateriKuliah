package praktikum;

public class Keyboard extends PerangkatElektronik {
    private String tipeSwitch;
    private boolean adaLampuRgb;

    public Keyboard(String merk, int daya, String tipeSwitch, boolean adaLampuRgb) {
        super(merk, daya);
        this.tipeSwitch = tipeSwitch;
        this.adaLampuRgb = adaLampuRgb;
    }

    public void ketikHuruf(String teks) {
        System.out.println("Mengetik teks: \"" + teks + "\"");
    }

    public void ubahWarnaRgb() {
        System.out.println("Lampu latar RGB keyboard diubah.");
    }

    @Override
    public void cetakInformasi() {
        System.out.println("--- INFORMASI KEYBOARD ---");
        super.cetakInformasi();
        System.out.println("Tipe Switch    : " + tipeSwitch);
        System.out.println("Lampu RGB      : " + (adaLampuRgb ? "Ada" : "Tidak Ada"));
    }
}
