public class ClassA {
    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Method getter tambahan agar nilai x dan y dari ClassA dapat diakses oleh subclass/luar class
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void getNilai() {
        System.out.println("nilai x:" + x);
        System.out.println("nilai y:" + y);
    }
}