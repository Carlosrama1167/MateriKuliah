
public class TestAkun {

    public static void main(String[] args) {

        AkunPremium akun = new AkunPremium();

        System.out.println("=== Sebelum Upgrade ===");
        akun.tampilkanInfo();

        akun.upgradeAkun();

        System.out.println("\n=== Setelah Upgrade ===");
        akun.tampilkanInfo();
    }
}