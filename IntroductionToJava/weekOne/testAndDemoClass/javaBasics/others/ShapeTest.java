public class ShapeTest{
  public static void main(String[] args){
    // Shape sqr = new Shape(int sides, String color, String angles);
    Shape sqr = new Shape(4, "Red", "Rec");

    Shape tsqr = new Shape(8);

    int testsides = tsqr.takeSides();
    System.out.println(testsides);

    int mySides = sqr.getSides();

    System.out.println(mySides);
  }
}
