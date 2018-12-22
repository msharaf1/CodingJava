public class OneTo255{
    private String hW = "Hello World";
    private int OneToFv = 255;


    
    
    public OneTo255(){};//constructor

    public int getAllDigits(){
        for(int i =0; i<= OneToFv; i++){
            System.out.println(i);
        }
        return this.OneToFv;
    }//1-255

    int getOdds(){
        for(int i=0; i<=OneToFv; i++){
            if(i % 2 !=0){
                System.out.println(i);
            }
        }
        return this.OneToFv;
    }//Odd numbers

    int getSum(){
        int sum = 0;
        for(int i=0; i<=OneToFv; i++){
            sum += i;
        }
        return sum;
    }

}