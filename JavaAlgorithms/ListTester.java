public class ListTester{
    public static void main(String[] args) {
        SinglyLinkedList ssl = new SinglyLinkedList();

        ssl.add(3);
        ssl.add(3);
        ssl.add(5);
        ssl.add(4);

        System.out.println(ssl.findValue(4));
        
        // ssl.printValue();
        // ssl.remove();
        // ssl.printValue();
        // ssl.add(90);
        // ssl.removeAt(1);
        // ssl.printValue();
    }
}