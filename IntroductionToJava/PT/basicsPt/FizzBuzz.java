public class FizzBuzz{
    public String fizzBuzz(int numbers){
        if(numbers % 3 == 0){
            System.out.println("Fizz");}
        else if(numbers % 5 ==0){
            System.out.println("Buzz");}
        else if(numbers % 15 ==0){
            System.out.println("FizzBuzz");}
        else{
            System.out.println(numbers);}
        
        return String.valueOf(numbers);
        // return "";
    }
}