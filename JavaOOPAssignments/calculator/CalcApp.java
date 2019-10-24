public class CalcApp {
    public static void main(String[] args) {
        // System.out.println("Hello");
        Calculator cal1 = new Calculator();
        cal1.setOperandOne(10.20);
        cal1.setOperandTwo(20.25);
        cal1.setOperation('+');
        System.out.println(cal1.getResult());
        cal1.setOperation('*');
        System.out.println(cal1.getResult());
        cal1.setOperation('x');
        System.out.println(cal1.getResult());
        cal1.setOperation('/');
        System.out.println(cal1.getResult());
        cal1.setOperation('-');

        System.out.println(
            cal1.getResult()

        );
        // cal1.test();
    }
}