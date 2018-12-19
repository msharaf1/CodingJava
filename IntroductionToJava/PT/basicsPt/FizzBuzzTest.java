public class FizzBuzzTest{
    public static void main(String[] args){
        FizzBuzz fz = new FizzBuzz();
        String A = fz.fizzBuzz(3);
        String B = fz.fizzBuzz(5);
        String C = fz.fizzBuzz(15);

        

        System.out.print(A);
        System.out.print(B);
        System.out.print(C);
    }
}