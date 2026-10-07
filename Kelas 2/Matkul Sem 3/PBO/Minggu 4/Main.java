
public class Main {
    public static void main(String[] args) {
        // 1. Buat objek mesin terlebih dahulu
        Mesin mesinHonda = new Mesin(150, "Bensin");

        // 2. Buat objek sepeda motor dengan memasukkan objek mesin (Has-A)
        SepedaMotor motorAndi = new SepedaMotor("Honda Vario", "Hitam", 110, mesinHonda);

        // 3. Tes behavior Sepeda Motor
        motorAndi.tambahKecepatan(50);
        motorAndi.tambahKecepatan(70); // Akan tertahan di batas maxSpeed 110

        // 4. Buat objek mekanik
        Mekanik mekanikBudi = new Mekanik("Budi");

        // 5. Mekanik menggunakan/berinteraksi dengan motor Andi (Uses-A)
        mekanikBudi.servisMotor(motorAndi);
    }
}