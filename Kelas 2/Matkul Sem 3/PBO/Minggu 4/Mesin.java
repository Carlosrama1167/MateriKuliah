public class Mesin {
    private int kapasitas; // dalam cc
    private String tipeBahanBakar;

    // Constructor
    public Mesin(int kapasitas, String tipeBahanBakar) {
        setKapasitas(kapasitas); // Menggunakan setter untuk validasi awal
        this.tipeBahanBakar = tipeBahanBakar;
    }

    // Getter & Setter
    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        // Defensive Programming
        if (kapasitas <= 0) {
            throw new IllegalArgumentException("Kapasitas mesin harus lebih dari 0 cc!");
        }
        this.kapasitas = kapasitas;
    }

    public String getTipeBahanBakar() {
        return tipeBahanBakar;
    }

    public void setTipeBahanBakar(String tipeBahanBakar) {
        this.tipeBahanBakar = tipeBahanBakar;
    }
}