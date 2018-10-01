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
    public void area(){
        int resultAreaQuadratic = calculator.multiplication(3,2);
        assertEquals(5, resultAreaQuadratic);
    }

}
