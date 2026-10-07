public class MotorDemo {

    public static void main(String[] args) {

        Motor motor = new Motor();

        motor.printStatus();

        motor.tambahKecepatan();

        motor.nyalakanMesin();

        for (int i = 0; i < 5; i++) {
            motor.tambahKecepatan();
        }

        motor.printStatus();

        motor.kurangiKecepatan();
        motor.printStatus();

        motor.matikanMesin();
        motor.printStatus();
    }
}