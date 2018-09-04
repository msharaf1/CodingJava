public class StringDemo2 {
    public static void main(String[] args) {
        String ninja = "Coding Java is Awesome!";
        int length = ninja.length();
        System.out.println("String Length is: " + length);
        System.out.println(ninja);

        String myNameIs = "My Name is ";
        String nameItself = "John";
        String fullSentence = myNameIs.concat(nameItself);
        System.out.println(fullSentence);
        System.out.println("******");

        int a = ninja.indexOf("Coding");
        int b = ninja.indexOf("Java");
        int c = ninja.indexOf("pizza");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        String setenceExample = "    spaces Everywhere! 'Trim removes all of the extra spaces'      ";
        System.out.println(setenceExample.trim());

        String H = "HELLO";
        String w = "world";

        System.out.println(H.toLowerCase() + "Convertes var H to lower case");
        System.out.println(w.toUpperCase() + "Convertes var w 'world' to upper case");

    }
}
