public class EncapDemo {
    public static void main(String[] args) {

        EncapTest encap = new EncapTest();

        encap.setName("Carlos");

        encap.setAge(15);
        System.out.println("Umur setelah input 15 : " + encap.getAge());

        encap.setAge(22);
        System.out.println("Umur setelah input 22 : " + encap.getAge());

        encap.setAge(35);
        System.out.println("Umur setelah input 35 : " + encap.getAge());
    }
}