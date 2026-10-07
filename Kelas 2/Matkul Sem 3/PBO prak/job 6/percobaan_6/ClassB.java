public class ClassB extends ClassA {
    public int x = 20; // Variable shadowing

    @Override
    public void tampilkanNilai() { // Method overriding
        System.out.println("Method milik ClassB");
    }

    public void cetak() {
        // Mengakses atribut milik ClassB sendiri
        System.out.println("Nilai x di ClassB : " + x);
        
        // Mengakses atribut milik ClassA menggunakan kata kunci super
        System.out.println("Nilai x di ClassA : " + super.x);

        // Memanggil method milik ClassB sendiri
        tampilkanNilai();

        // Memanggil method milik ClassA menggunakan kata kunci super
        super.tampilkanNilai();
    }
}