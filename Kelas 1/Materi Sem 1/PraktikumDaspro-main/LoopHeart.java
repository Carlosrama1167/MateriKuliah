public class LoopHeart {
    public static void main(String [] args) throws InterruptedException {
        int min =2;
        int max =10;
        int size = min;
        boolean naik = true;

        while (true) { 
            clear();
            printHeart(size);
            Thread.sleep(120);

          if (naik) {
              size++;
              if (size >= max) naik = false;
              
          } else {
              size--;
              if (size <= min) naik=true;
            }
        }
    }
    static void printHeart(int size) {

        // bagian atas
        for (int i = size / 2;i < size; i += 2) 
{
        for (int j = 1; j< size - i; j += 2)
            System.out.print(" ");
        for (int j = 1; j <= i; j++)
            System.out.print("*");
        for (int j = 1; j <= size - i; j++)
            System.out.print(" ");
        for (int j = 1; j <= i; j++)
            System.out.print("*");

        System.out.println();
    
}
        for (int i = size; i >= 1; i--) {
            for (int j = i; j < size; j++)
                System.out.print(" ");

            for (int j = 1; j <= (i * 2) - 1; j++)
                System.out.print("*");

            System.out.println();
        }
    }

    static void clear() {

        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
\\\\\\\\\\\\\\\\\\
                
        
        
