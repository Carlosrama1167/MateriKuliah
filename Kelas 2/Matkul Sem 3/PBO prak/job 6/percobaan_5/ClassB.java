public class ClassB extends ClassA {
    
    // Konstruktor ClassB yang meneruskan parameter ke ClassA
    public ClassB(String pesanA, String pesanB) {
        // Memanggil konstruktor berparameter milik superclass (ClassA)
        super(pesanA);
        System.out.println("Konstruktor ClassB dijalankan dengan pesan: " + pesanB);
    }
}