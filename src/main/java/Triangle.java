public class Triangle extends Calculator {

    public Triangle(int number1, int number2) {
        super(number1, number2);
    }

    @Override
    public int multiplication(){
        return (this.getNumber1() * this.getNumber2()) / 2 ;
    }
}
