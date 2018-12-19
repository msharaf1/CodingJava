public class Shape{
  private int sides;
  private String color;
  private String angles;

  public Shape(int sides, String color, String angles){
    this.sides = sides;
    this.color = color;
    this.angles = angles;
  }
  public Shape(int sides){
    this.sides = sides;
  }

  public int takeSides(){
    return sides;
  }
  public void addSides(int sides){
    this.sides = sides;
  }


  public int getSides(){
    return sides;
  }

  public void setSides(int sides){
    this.sides = sides;
  }
}
