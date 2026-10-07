import java.util.Scanner;

public class TestLogistik {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Kontainer kontainerAlfa = new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println("Nama Pemilik Kontainer: " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + " kg");

        // Input tambah muatan
        System.out.print("\nMasukkan berat muatan yang ingin ditambahkan (kg): ");
        double tambah = input.nextDouble();

        kontainerAlfa.tambahMuatan(tambah);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        // Input turunkan muatan
        System.out.print("\nMasukkan berat muatan yang ingin dibongkar (kg): ");
        double turun = input.nextDouble();

        kontainerAlfa.turunkanMuatan(turun);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        input.close();
    }
}