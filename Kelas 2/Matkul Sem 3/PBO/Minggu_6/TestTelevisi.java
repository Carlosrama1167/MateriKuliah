
public class TestTelevisi {
    public static void main(String[] args) {
        System.out.println("=== Pengujian Single Inheritance ===");
        
        TelevisiModern tvSmart = new TelevisiModern("Samsung Smart TV 55 Inch", 100);
        
        // Menyalakan TV
        tvSmart.setPower(true);
        
        // Menggunakan method dari Superclass (Televisi)
        tvSmart.setGelombang(5);
        tvSmart.setVolume(25);
        
        // Menggunakan method khusus dari Subclass (TelevisiModern)
        tvSmart.setModusTampilan("HDMI 1 / DVD");
        tvSmart.playDVD();
        
        // Mematikan TV
        tvSmart.setPower(false);
    }
}