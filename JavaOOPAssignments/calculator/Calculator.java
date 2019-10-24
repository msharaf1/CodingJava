public class Calculator {
    private double operandOne;
    private double operandTwo;
    private double result;

    public Calculator(){

    }

    public double getOperandOne() {
        return this.operandOne;
    }

    public void setOperandOne(double operandOne) {
        this.operandOne = operandOne;
    }

    public double getOperandTwo() {
        return this.operandTwo;
    }

    public void setOperandTwo(double operandTwo) {
        this.operandTwo = operandTwo;
    }

    public double getResult() {
        return this.result;
    }

    public void setResult(double result) {
        this.result = result;
    }
    public void test(){
        System.out.println(this.getOperandOne() +this.getOperandTwo());
    }

    public void setOperation(char ops){
        
        if(ops == ('+')){
            this.setResult(this.getOperandOne() + this.getOperandTwo());
        }
        else if(ops == ('-')){
            this.setResult(this.getOperandOne() - this.getOperandTwo());
        }else if(ops == ('*') || ops == ('x')){
            this.setResult(this.getOperandOne() * this.getOperandTwo());
        }else if(ops == ('/')){
            this.setResult(this.getOperandOne() / this.getOperandTwo());
        }else {
            System.out.println("Not a valid operations");
        }
    }

}
