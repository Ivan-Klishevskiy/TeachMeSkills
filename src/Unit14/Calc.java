package Unit14;

public class Calc {
    private double first;
    private double second;
    private String sign;
    private double result;

    public Calc() {
    }

    public Calc(double first, double second, String sign) {
        this.first = first;
        this.second = second;
        this.sign = sign;
    }

    private double sum(){
        return (this.first+this.second);
    }

    private double sub(){
        return (this.first - this.second);
    }

    private double div(){
        return (this.first / this.second);
    }

    private double mul(){
        return (this.first * this.second);
    }

    public double calculation(){
        switch (this.sign) {
            case "+" -> result =sum();
            case "-" -> result = sub();
            case "/" -> result = div();
            case "*" -> result = mul();
            default -> result = 0;
        }
        return result;
    }

    public double getFirst() {
        return first;
    }

    public void setFirst(double first) {
        this.first = first;
    }

    public double getSecond() {
        return second;
    }

    public void setSecond(double second) {
        this.second = second;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public double getResult() {
        return result;
    }


    public static void main(String[] args) {
        Calc calc = new Calc(1.0,2.0,"/");
        System.out.println(calc.calculation());
    }
}


