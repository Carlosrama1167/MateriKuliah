package oop_praktikum.id.ac.polinema;

public class main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        System.out.println("Rectangle: " + r.width + " x " + r.height);

        System.out.println();

        Rectangle[] shapes = new Rectangle[3];
        shapes[0] = new Rectangle(6, 4);
        shapes[1] = new Rectangle(3, 3);
        shapes[2] = new Rectangle(8, 2);

        for (Rectangle shape : shapes) {
            System.out.println("Area: " + shape.area() + ", Perimeter: " + shape.perimeter());
        }

        System.out.println();

        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());

        System.out.println();

        Rectangle copy = r;
        copy.width = 10;
        System.out.println("via r : " + r.area());
        System.out.println("via copy : " + copy.area());

        System.out.println();

        student s = new student("nadia", "5001", 3.8);
        System.out.println(s.describe());

        System.out.println();
        // Tugas Mandiri 1: Pengujian Kelas Circle (Radius 5)
        Circle c = new Circle(5);
        System.out.println("Circle Area: " + c.area());
        System.out.println("Circle Circumference: " + c.circumference());

    }
}
