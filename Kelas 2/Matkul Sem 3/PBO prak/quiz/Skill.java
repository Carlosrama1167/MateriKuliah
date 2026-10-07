public class Skill {
    private String nama;
    private int damage;      // pengurangan nyawa lawan
    private int biayaEnergi; // pengurangan energi sendiri

    public Skill(String nama, int damage, int biayaEnergi) {
        this.nama = nama;
        this.damage = damage;
        this.biayaEnergi = biayaEnergi;
    }

    public String getNama() { return nama; }
    public int getDamage() { return damage; }
    public int getBiayaEnergi() { return biayaEnergi; }
}