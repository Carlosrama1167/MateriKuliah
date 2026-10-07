public class TestMobil {

    public static void main(String[] args) {

        Mobil avanza = new Mobil();

        avanza.tampilkanStatus();

        avanza.tambahKecepatan();

        avanza.nyalakanMesin();

        avanza.tambahKecepatan();
        avanza.tambahKecepatan();
        avanza.tambahKecepatan();

        avanza.tampilkanStatus();

        avanza.kurangiKecepatan();
        avanza.kurangiKecepatan();

        avanza.tampilkanStatus();

        avanza.matikanMesin();

        avanza.tampilkanStatus();
    }
}