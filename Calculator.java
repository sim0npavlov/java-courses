public class Calculator {

private double first;
private double second;
private char operation;
private double result;
    
    public void setFirst(double f) {
        this.first = f;
    }
    public double getFirst() {
        return first;
    }
    
    public void setSecond (double s)  {
        this.second = s;
    }
    public double getSecond() {
        return second;
    }
    
    public void setOperation (char o) {
        this.operation = o;
    }
    public char getOperation () {
        return operation;
    }
    
    public void add(double...params){
        for (Double param:params){
            this.result += param;
        }
    
    }
    
    public void subtract(double f, double s) {
        this.result = f - s;
    }
    
    public void multiply(double f, double s) {
        this.result = f * s;
    }
    
    public void divide(double f, double s) {
        
    }
    
    public void pow(double f, double s) {
        this.result = Math.pow(f, s);
    }
    
    public double getResult() {
        return this.result;
    }
    public void cleanResult() {
        this.result = 0;
    }
    
    public double calculate(double f, double s, char o) {
        double res = 0;
        switch(o) {
            case '+':
                add(f, s);
                res = getResult ();
                break;
            case '-':
                subtract(f, s);
                res = getResult ();
                break;
            case '*':
                multiply(f, s);
                res = getResult ();
                break;
            case '/':
                divide(f, s);
                res = getResult ();
                break;
            case '^':
                pow(f, s);
                res = getResult ();
                break;
        }
      return res;    
    }

}