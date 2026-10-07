public class ClassB extends ClassA {
    private int z;

    public void setZ(int z) {
        this.z = z;
    }

    public void getNilaiZ() {
        System.out.println("nilai Z:" + z);
    }

    public void getJumlah() {
        // Menggunakan getX() dan getY() karena atribut x dan y bersifat private di ClassA
        System.out.println("jumlah:" + (getX() + getY() + z));
    }
}