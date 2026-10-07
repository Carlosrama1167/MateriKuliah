import java.util.concurrent.TimeUnit;

public class NgajakBalikanAnimation {

    // Fungsi untuk menampilkan teks dengan efek mengetik
    public static void typeWriter(String text, long delayMillis) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(delayMillis); // jeda antar karakter
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("\nAnimasi terhenti.");
                return;
            }
        }
        System.out.println();
    }

    // Fungsi untuk membuat jeda antar pesan
    public static void pause(long seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        // Pesan animasi
        String[] messages = {
            "Alooo...",
            "Aku cuma mau bilang sesuatu...",
            "Aku kangen banget ma kamu...",
            "Maafin akuu yaa...",
            "Eeemmm...",
            "Aku pengen kita mulai lagi dari awal...",
            "Mau engga... balikan sama aku? hehe❤️"
        };

        // Menampilkan animasi
        for (String msg : messages) {
            typeWriter(msg, 80); // kecepatan ketik 80ms per huruf
            pause(1); // jeda 1 detik antar pesan
        }

        System.out.println("\n(Program selesai)");
    }
}

