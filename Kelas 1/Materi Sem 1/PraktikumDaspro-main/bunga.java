import java.util.Scanner;

public class bunga {
    public static void main(String [] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("pilih jenis bunga:");
        System.out.println("1.tulip");
        System.out.println("2.adelweiss");

        int pilihan = scanner.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("anda memilih bunga tulip");
                break;
            case 2:
                System.out.println("anda memilih bunga adelweiss");
                break;
            default:
                System.out.println("pilihan tidak tersedia");
                break;
                        
        }
    }
}








