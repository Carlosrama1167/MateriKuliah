public class SepedaMotor {
    private String merek;
    private String warna;
    private int maxSpeed;
    private int kecepatanSaatIni; 
    private Mesin mesin; // Relasi Has-A

    // Constructor
    public SepedaMotor(String merek, String warna, int maxSpeed, Mesin mesin) {
        this.merek = merek;
        this.warna = warna;
        setMaxSpeed(maxSpeed);
        setMesin(mesin);
        this.kecepatanSaatIni = 0; 
    }

    // Behavior: Menambah Kecepatan
    public void tambahKecepatan(int tambahan) {
        // Defensive Programming
        if (tambahan < 0) {
            System.out.println("Gagal: Input penambahan kecepatan tidak boleh negatif!");
            return;
        }
        
        if (this.kecepatanSaatIni + tambahan > maxSpeed) {
            this.kecepatanSaatIni = maxSpeed;
            System.out.println("Peringatan: Kecepatan maksimal (" + maxSpeed + " km/jam) telah tercapai!");
        } else {
            this.kecepatanSaatIni += tambahan;
            System.out.println("Kecepatan motor " + merek + " naik menjadi " + kecepatanSaatIni + " km/jam.");
        }
    }

    // Behavior: Mengurangi Kecepatan
    public void kurangiKecepatan(int pengurangan) {
        // Defensive Programming
        if (pengurangan < 0) {
            System.out.println("Gagal: Input pengurangan kecepatan tidak boleh negatif!");
            return;
        }

        if (this.kecepatanSaatIni - pengurangan < 0) {
            this.kecepatanSaatIni = 0;
            System.out.println("Motor berhenti.");
        } else {
            this.kecepatanSaatIni -= pengurangan;
            System.out.println("Kecepatan motor turun menjadi " + kecepatanSaatIni + " km/jam.");
        }
    }

    // Getter & Setter
    public Mesin getMesin() {
        return mesin;
    }

    public void setMesin(Mesin mesin) {
        // Defensive Programming: Mencegah mesin kosong
        if (mesin == null) {
            throw new IllegalArgumentException("Sepeda motor harus memiliki mesin (tidak boleh null)!");
        }
        this.mesin = mesin;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            throw new IllegalArgumentException("Kecepatan maksimal harus lebih dari 0!");
        }
        this.maxSpeed = maxSpeed;
    }
    
    public String getMerek() { return merek; }
}