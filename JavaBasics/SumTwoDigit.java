public class SumTwoDigit{
    public int digits;

    public SumTwoDigit(int digits){
        this.digits = digits;
    }

    void sumUpTwoDigits(int digits){
        this.digits = digits;
    }

    int getSumTwoDigits(){
        int numberOfDigits = 0;
        int temp =0;
        while(digits > 0){
            temp = digits/10;
            numberOfDigits = temp + temp;
            number /= numberOfDigits;
        }

        return numberOfDigits;
    }

}