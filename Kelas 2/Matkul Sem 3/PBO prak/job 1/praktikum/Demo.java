package praktikum;

public class Demo {
    public static void main(String[] args) {
        // H. Instansiasikan satu buah objek untuk setiap class
        Mouse mouseObj = new Mouse("Logitech", 5, "Wireless", 6);
        Keyboard keyboardObj = new Keyboard("Logitech", 10, "Mechanical", true);
        Laptop laptopObj = new Laptop("Zyrex", 65, "Windows 11", 8, 14.0, 1.5);
        Handphone hpObj = new Handphone("Apple", 15, "iOS", 6, 3, "5G");

        // I. Terapkan setiap method untuk setiap objek yang dibuat
        
        // Pengujian Mouse
        mouseObj.nyalakan();
        mouseObj.klikKanan();
        mouseObj.gulirRoda();
        mouseObj.cetakInformasi();
        mouseObj.matikan();
        
        System.out.println();

        // Pengujian Keyboard
        keyboardObj.nyalakan();
        keyboardObj.ketikHuruf("Praktikum PBO");
        keyboardObj.ubahWarnaRgb();
        keyboardObj.cetakInformasi();
        keyboardObj.matikan();

        System.out.println();

        // Pengujian Laptop
        laptopObj.nyalakan();
        laptopObj.bukaLayar();
        laptopObj.jalankanIde();
        laptopObj.cetakInformasi();
        laptopObj.matikan();

        System.out.println();

        // Pengujian HP
        hpObj.nyalakan();
        hpObj.ambilFoto();
        hpObj.lakukanPanggilan("08123456789");
        hpObj.cetakInformasi();
        hpObj.matikan();
    }
}
