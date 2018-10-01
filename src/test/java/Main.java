import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class Main {

    Calculator calculator = new Calculator();
    Triangle triangle = new Triangle();

    @Test
    public void sum(){
        int resultSum = calculator.sum(3,2);
        assertEquals(5, resultSum);
    }

    @Test
    public void areaSquare(){
        int resultAreaSquare = calculator.multiplication(3,2);
        assertEquals(6, resultAreaSquare);
    }

    @Test
    public void areaTriangle(){
        int resultAreaTriangle = triangle.multiplication(3,2);
        assertEquals(3, resultAreaTriangle);
    }

    @Test
    public void diff(){
        int resultAreaSquare = calculator.multiplication(3,2);
        int resultAreaTriangle = triangle.multiplication(3,2);

        int resultDiff = calculator.diff(resultAreaSquare, resultAreaTriangle);
        assertEquals(3, resultDiff);
    }

}
