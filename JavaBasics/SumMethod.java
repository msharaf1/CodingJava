public class SumMethod{

    public int param1;
    public int param2;

    public SumMethod(int param1, int param2){
        this.param1 = param1;
        this.param2 = param2;
    }//constructor

    public void setAddition(int param1, int param2){

        this.param1 = param1;
        this.param2 = param2;
    }
    public int getSumResult(){
        int result = param1 + param2;
        return result;
    }

}//class