import junit.framework.*;
import org.junit.Test;

public class Main extends TestCase {

    Calculator calculator = new Calculator();

    @Test
    private void sum(){
        int resultSum = calculator.sum(3,2);
        assertEquals(5, resultSum);
    }

}
