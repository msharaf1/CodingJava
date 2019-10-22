package vehicls;

public class VTester {
    public static void main(String[] args) {
        // Vehicle v1 = new Vehicle("make", model, initialSpeed)
        Vehicle v2 = new Vehicle();
        v2.setCurrentSpeed(100);
        System.out.println(v2.getCurrentSpeed());
    }
}