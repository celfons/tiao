import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class Main {

    Calculator calculator = new Calculator();

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
        int resultAreaTriangle = calculator.areaTriangle(3,2);
        assertEquals(3, resultAreaTriangle);
    }

}
