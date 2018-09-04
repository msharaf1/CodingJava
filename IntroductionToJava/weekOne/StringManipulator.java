public class StringManipulator {
    public static void main(String[] args){
     String h = "    Hello    ";
     String w = "  World   ";
     String sentenceExample = "Hello, today is your first Java class. Welcome!";

     String hw = h.trim() +" " + w.trim();

     System.out.println(h.trim() + " " + w.trim());

     System.out.println(hw);
     char letter = 'o';

     Integer a = hw.indexOf("World");
     System.out.println(a);

     Integer b = sentenceExample.getIndexOrNull("World", letter);
     
    }
}