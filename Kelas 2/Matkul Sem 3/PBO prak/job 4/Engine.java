public class Engine {
    private String tipe;

    public Engine() {
        this.tipe = "4-silinder";
    }
    public String getTipe(){
        return tipe;
    }
}

class Car {
    private String merek;
    private Engine mesin;

    public Car (String merek){
        this.merek=merek;
        this.mesin=new Engine();
    }
    public void Tampilkaninfo(){
        System.out.println("Merek Mobil: "+merek);
        System.out.println("Tipe Mesin: "+mesin.getTipe());
    }
}
