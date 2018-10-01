import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class Main {

    Calculator calculator = new Calculator(3,2);
    Triangle triangle = new Triangle(3,2);

    @Test
    public void sum(){
        int resultSum = calculator.sum();
        assertEquals(5, resultSum);
    }

    @Test
    public void areaSquare(){
        int resultAreaSquare = calculator.multiplication();
        assertEquals(6, resultAreaSquare);
    }

    @Test
    public void areaTriangle(){
        int resultAreaTriangle = triangle.multiplication();
        assertEquals(3, resultAreaTriangle);
    }

    @Test
    public void diff(){
        int resultAreaSquare = calculator.multiplication();
        int resultAreaTriangle = triangle.multiplication();

        int resultDiff = calculator.diff(resultAreaSquare, resultAreaTriangle);
        assertEquals(3, resultDiff);
    }

    @Test
    public void areaCube(){
        double resultArea = calculator.multiplication(1);
        assertEquals(6.0, resultArea);
    }

}
