public class FizzBuzz {
    private int value;

    public FizzBuzz(int value){
        this.value = value;
    }

    public void setValue(int value){
        this.value = value;
    }

    public void getValue(){

//        if(this.value % 3 ==0){
//            System.out.println("Fizz");
//        }if(this.value % 5 ==0){
//            System.out.println("Buzz");
//
//        }if(this.value % 15 ==0){
//            System.out.println("FizzBuzz");
//        }else{
//            System.out.println(value);
//        }

        for(int i=0; i<=value; i++){
            if(i%15 ==0) {
                System.out.println("FizzBuzz");
            } else if(i % 5 ==0){
                System.out.println("Fizz");
            }else if(i % 3==0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }

    }
}
