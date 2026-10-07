

public class Televisi {
    private String deskripsi;
    private int jumlahSaluran;
    private int volume;
    private int gelombang;
    private boolean power;

    public Televisi(String deskripsi, int jumlahSaluran) {
        this.deskripsi = deskripsi;
        this.jumlahSaluran = jumlahSaluran;
        this.volume = 10;
        this.gelombang = 1;
        this.power = false;
    }

    public void setPower(boolean power) {
        this.power = power;
        if (power) {
            System.out.println(deskripsi + " menyala.");
        } else {
            System.out.println(deskripsi + " mati.");
        }
    }

    public boolean getPower() {
        return power;
    }

    public void setVolume(int volume) {
        if (power) {
            this.volume = volume;
            System.out.println("Volume " + deskripsi + " diatur ke: " + this.volume);
        } else {
            System.out.println("Nyalakan TV terlebih dahulu!");
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setGelombang(int gelombang) {
        if (power) {
            if (gelombang > 0 && gelombang <= jumlahSaluran) {
                this.gelombang = gelombang;
                System.out.println("Saluran " + deskripsi + " diubah ke: " + this.gelombang);
            } else {
                System.out.println("Saluran tidak tersedia.");
            }
        } else {
            System.out.println("Nyalakan TV terlebih dahulu!");
        }
    }

    public String getDeskripsi() {
        return deskripsi;
    }
}