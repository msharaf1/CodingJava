public class HumanTest{
    public static void main(String[] args) {
        Human samari = new Human();
        int a = samari.attack(100);
        int h = samari.getHealth();

        
        System.out.println(h); System.out.println(a);
    }
}