//Couting String's length.

/* public class StringDemo {
    public static void main(String [] args) {
        String ninja = "Coding Dojo is Awesome";
        int length = ninja.length();
        System.out.println("String Length is: " + length);
    }
} */

//Concatenate:

/* public class StringDemo {
    public static void main(String[] args) {
        String myNameIs = "My name is ";
        String myName = "John";
        String introduction = myNameIs.concat(myName);
        System.out.println(introduction);

        System.out.println("Thank " + myName + "!");

        String student = String.format("Hi %s, the class costs about $%.2f !", myName, 300.00);
        System.out.println(student);
    }
} */


public class StringDemo {
    public static void main(String[] args) {
        String ninja = "Welcome to Coding Dojo!";
        String ninja2 = "   Jumping Around like a Ninaj    !";
        // int a = ninja.indexof("Coding");
        // int b = ninja.indexof("Dojo");
        // int c = ninja.indexof("co");
        // int d = ninja.indexof("Pizza");

        System.out.println(ninja);
        // System.out.println(a);
        sentence = sentence.trim(ninja2);
        System.out.println(sentence.trim());
    }
}

// None of the following worked for me:
/* IndexOf: The indexOf method searches left-to-right inside the given string for a "target" string. The indexOf() method returns the index number where the target string is first found or -1 if the target is not found.

String ninja = "Welcome to Coding Dojo!";
int a = ninja.indexOf("Coding"); // a is 11
int b = ninja.indexOf("co"); // b is 3
int c = ninja.indexOf("pizza"); // c is -1, "pizza" is not found
Trim: The trim() method removes any trailing or leading white spaces from the string.

String sentence = "   spaces everywhere!   ";
System.out.println(sentence.trim())
This will output: spaces everywhere!.

Uppercase and Lowercase: The String class provides methods to lowercase and uppercase strings.

String a = "HELLO";
String b = "world";
System.out.println(a.toLowerCase()); // hello
System.out.println(b.toUpperCase()); // WORLD
Equality: We can compare the equality of a string in two ways. Do they refer to the exact same object, or do they have the same exact sequence of characters.

String a = new String("word");
String b = new String("word");
System.out.println(a == b); // false. not the same exact object.
System.out.println(a.equals(b)); // true. same exact characters.
 */