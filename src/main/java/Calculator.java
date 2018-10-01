public class Calculator {

    private int number1;
    private int number2;

    public Calculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int sum(){

        return number1 + number2;

    }

    public int multiplication(){

        return number1 * number2;
    }

    public double multiplication(int number3){

        return number1 * number2 * number3;
    }

    public int diff(){

        return number1-number2;
    }

    public int diff(int number1, int number2){

        return number1-number2;
    }
}
