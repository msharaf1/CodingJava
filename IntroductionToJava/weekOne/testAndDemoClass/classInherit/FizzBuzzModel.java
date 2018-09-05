public class FizzBuzzModel {
  public String FizzBuzzAll(int number) {
    if(number % 3 == 0 && number % 5 == 0){
      return "FizzBuzz";
    } else if(number % 3 == 0){
      return "Fizz";
    } else if (number % 5 == 0){
      return "Buzz";
    } else {
      return number +"";
    }
  }
}

// public class FizzBuzz {
//   public String FizzBuzzAll(int i) {
//     if(i % 3  ==0 && number % 5 ==0) {return "FizzBuzz";}
//     else if (i % 3 ==0){return "Fizz";}
//     else if (i % 5 ==0){return "Buzz";}
//     else {return number +""; }
//         }
//     }
//   }
