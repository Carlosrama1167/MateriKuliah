public class TiketKereta extends kertas {
    private int nomortiket;
    private int harga;
    private String namakereta;

    public TiketKereta(int nomortiket, int harga, String namakereta, String jenis){
        super(jenis);
        this.nomortiket = nomortiket;
        this.harga = harga;
        this.namakereta = namakereta;
    }

    public void cetaktiket(){
        System.out.println("Tiket Kereta " + namakereta + " dicetak");
    }

    public void bataltiket(){
        System.out.println("Tiket Kereta " + namakereta + " dibatalkan");
    }

    public void checkin(){
        System.out.println("Tiket Kereta " + namakereta + " check-in");
    }

    @Override
    public void info() {
        System.out.println("--- Informasi Tiket Kereta ---");
        System.out.println("Nomor Tiket: " + nomortiket);
        System.out.println("Harga: " + harga);
        System.out.println("Nama Kereta: " + namakereta);
        super.info();
    }
}
