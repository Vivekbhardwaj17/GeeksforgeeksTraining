package MyCalculatorProject;



public class CalculatorOperations {

    private double val1;
    private double val2;
    private char symbol;
  CalculatorOperations(){
     val1=0d;
     val2=0d;
  }
  CalculatorOperations(double val1,char symbol,double val2){
      this.val1=val1;
      this.val2=val2;
      this.symbol=symbol;
  }

    public double getVal1() {
        return val1;
    }

    public void setVal1(double val1) {
        this.val1 = val1;
    }

    public double getVal2() {
        return val2;
    }

    public void setVal2(double val2) {
        this.val2 = val2;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
   public double add(double val1,double val2){
      return val1+val2;
   }
    public double sub(double val1,double val2){
        return val1-val2;
    }
    public double mult(double val1,double val2){
        return val1*val2;
    }
    public double div(double val1,double val2){
        return val1/val2;
    }
    public double modulo(double val1,double val2){
        return val1%val2;
    }
}
