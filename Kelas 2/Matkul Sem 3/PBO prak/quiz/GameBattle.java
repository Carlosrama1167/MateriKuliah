import java.util.Random;

public class GameBattle {
    public static void main(String[] args) {
        Random rand = new Random();

        // Membuat object Playerutama dan Musuh dari kelas Hero
        Hero playerUtama = new Hero("PlayerUtama", 10, 10);
        Hero musuh       = new Hero("Musuh", 10, 10);

        // Membuat 3 Skill (damage & biaya energi beda, selisih maks 2)
        //        Nama      Dmg  Energi
        Skill pukul  = new Skill("Pukul",  3, 2);
        Skill cubit  = new Skill("Cubit",  2, 1);
        Skill tampar = new Skill("Tampar", 4, 3);

        // Setiap hero punya skill (objek terpisah agar independen)
        playerUtama.setSkill(0, new Skill(pukul.getNama(),  pukul.getDamage(),  pukul.getBiayaEnergi()));
        playerUtama.setSkill(1, new Skill(cubit.getNama(),  cubit.getDamage(),  cubit.getBiayaEnergi()));
        playerUtama.setSkill(2, new Skill(tampar.getNama(), tampar.getDamage(), tampar.getBiayaEnergi()));

        musuh.setSkill(0, new Skill(pukul.getNama(),  pukul.getDamage(),  pukul.getBiayaEnergi()));
        musuh.setSkill(1, new Skill(cubit.getNama(),  cubit.getDamage(),  cubit.getBiayaEnergi()));
        musuh.setSkill(2, new Skill(tampar.getNama(), tampar.getDamage(), tampar.getBiayaEnergi()));

        System.out.println("=== PERTARUNGAN DIMULAI ===");
        System.out.println(playerUtama.getNama() + " (Nyawa=" + playerUtama.getNyawa()
                + ", Energi=" + playerUtama.getEnergi() + ")");
        System.out.println(musuh.getNama() + " (Nyawa=" + musuh.getNyawa()
                + ", Energi=" + musuh.getEnergi() + ")");
        System.out.println();

        int ronde = 1;
        int seranganPlayer = 0;
        int seranganMusuh = 0;

        // Loop pertarungan: lanjut sampai salah satu nyawa = 0
        while (playerUtama.isAlive() && musuh.isAlive()) {
            System.out.println("--- Ronde " + ronde + " ---");

            // === Giliran PlayerUtama (minimal 3 kali serangan) ===
            if (playerUtama.isAlive() && (seranganPlayer < 3 || rand.nextBoolean())) {
                Skill s = pilihSkillAcak(playerUtama, rand);
                if (s != null) {
                    playerUtama.serang(musuh, s);
                    seranganPlayer++;
                } else {
                    System.out.println("  " + playerUtama.getNama() + " kehabisan energi!");
                }
            }

            if (!musuh.isAlive()) break;

            // === Giliran Musuh (minimal 3 kali serangan) ===
            if (musuh.isAlive() && (seranganMusuh < 3 || rand.nextBoolean())) {
                Skill s = pilihSkillAcak(musuh, rand);
                if (s != null) {
                    musuh.serang(playerUtama, s);
                    seranganMusuh++;
                } else {
                    System.out.println("  " + musuh.getNama() + " kehabisan energi!");
                }
            }

            System.out.println();
            ronde++;

            // Jika keduanya tidak bisa menyerang, hentikan
            if (!playerUtama.bisaMenyerang() && !musuh.bisaMenyerang()) {
                System.out.println("Kedua pihak kehabisan energi!");
                break;
            }
        }

        // === Umumkan pemenang ===
        System.out.println("=== PERTARUNGAN SELESAI ===");
        System.out.println("Total serangan " + playerUtama.getNama() + ": " + seranganPlayer);
        System.out.println("Total serangan " + musuh.getNama() + ": " + seranganMusuh);
        System.out.println();

        if (!playerUtama.isAlive() && !musuh.isAlive()) {
            System.out.println("Pertarungan berakhir SERI!");
        } else if (!musuh.isAlive()) {
            System.out.println("🏆 PEMENANG: " + playerUtama.getNama()
                    + " (Nyawa tersisa: " + playerUtama.getNyawa() + ")");
        } else if (!playerUtama.isAlive()) {
            System.out.println("🏆 PEMENANG: " + musuh.getNama()
                    + " (Nyawa tersisa: " + musuh.getNyawa() + ")");
        } else {
            // Tidak ada yang mati karena kehabisan energi
            if (playerUtama.getNyawa() > musuh.getNyawa()) {
                System.out.println("🏆 PEMENANG (nyawa tertinggi): " + playerUtama.getNama()
                        + " (Nyawa: " + playerUtama.getNyawa() + ")");
            } else if (musuh.getNyawa() > playerUtama.getNyawa()) {
                System.out.println("🏆 PEMENANG (nyawa tertinggi): " + musuh.getNama()
                        + " (Nyawa: " + musuh.getNyawa() + ")");
            } else {
                System.out.println("Pertarungan berakhir SERI!");
            }
        }
    }

    // Pilih skill acak yang energinya mencukupi
    private static Skill pilihSkillAcak(Hero hero, Random rand) {
        Skill[] skills = hero.getSkills();
        int start = rand.nextInt(skills.length);
        for (int i = 0; i < skills.length; i++) {
            Skill s = skills[(start + i) % skills.length];
            if (s != null && hero.getEnergi() >= s.getBiayaEnergi()) {
                return s;
            }
        }
        return null;
    }
}