public class Mekanik {
    private String namaMekanik;

    public Mekanik(String nama) {
        this.namaMekanik = nama;
    }

    // Relasi Uses-A: Menerima objek SepedaMotor sebagai parameter
    public void servisMotor(SepedaMotor motor) {
        // Defensive Programming: Cek apakah motor yang dibawa beneran ada
        if (motor == null) {
            System.out.println(namaMekanik + " bingung, tidak ada motor yang dibawa untuk diservis!");
            return;
        }
        System.out.println(namaMekanik + " sedang menservis motor " + motor.getMerek() + " dengan mesin " + motor.getMesin().getKapasitas() + "cc.");
    }
}