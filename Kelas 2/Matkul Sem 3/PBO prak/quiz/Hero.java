public class Hero {
    private String nama;
    private int nyawa;
    private int energi;
    private Skill[] skills;

    public Hero(String nama, int nyawa, int energi) {
        this.nama = nama;
        this.nyawa = nyawa;
        this.energi = energi;
        this.skills = new Skill[3];
    }

    public void setSkill(int index, Skill skill) {
        skills[index] = skill;
    }

    public String getNama() { return nama; }
    public int getNyawa() { return nyawa; }
    public int getEnergi() { return energi; }
    public Skill[] getSkills() { return skills; }

    public boolean isAlive() { return nyawa > 0; }

    // Cek apakah masih punya energi untuk minimal 1 skill
    public boolean bisaMenyerang() {
        for (Skill s : skills) {
            if (s != null && energi >= s.getBiayaEnergi()) return true;
        }
        return false;
    }

    // Menyerang target dengan skill tertentu
    public void serang(Hero target, Skill skill) {
        if (energi < skill.getBiayaEnergi()) {
            System.out.println("  [!] " + nama + " tidak cukup energi untuk " + skill.getNama());
            return;
        }
        energi -= skill.getBiayaEnergi();
        target.terimaDamage(skill.getDamage());

        System.out.println("  " + nama + " menggunakan [" + skill.getNama() + "]"
                + " -> damage: " + skill.getDamage()
                + ", biaya energi: " + skill.getBiayaEnergi());
        System.out.println("     Status " + nama + "   : NYAWA=" + nyawa + ", ENERGI=" + energi);
        System.out.println("     Status " + target.getNama() + ": NYAWA=" + target.getNyawa()
                + ", ENERGI=" + target.getEnergi());
    }

    private void terimaDamage(int dmg) {
        nyawa -= dmg;
        if (nyawa < 0) nyawa = 0;
    }
}