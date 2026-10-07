

public class TelevisiModern extends Televisi {
    private String modusTampilan;

    public TelevisiModern(String deskripsi, int jumlahSaluran) {
        super(deskripsi, jumlahSaluran);
        this.modusTampilan = "TV";
    }

    public void setModusTampilan(String modus) {
        if (getPower()) {
            this.modusTampilan = modus;
            System.out.println(getDeskripsi() + " mengubah modus tampilan ke: " + this.modusTampilan);
        } else {
            System.out.println("Nyalakan TV terlebih dahulu!");
        }
    }

    public void playDVD() {
        if (getPower()) {
            System.out.println("Memutar DVD pada " + getDeskripsi());
        } else {
            System.out.println("Nyalakan TV terlebih dahulu!");
        }
    }
}