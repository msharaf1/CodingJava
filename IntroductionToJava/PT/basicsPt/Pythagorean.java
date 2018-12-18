public class Pythagorean {
    public double calcP(int legA, int legB){
        double c = (legA * legA + legB * legB);
        double c2 = Math.sqrt(c);
        return c2;
    }
}