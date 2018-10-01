import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class Main {

    Calculator calculator = new Calculator();

    @Test
    public void sum(){
        int resultSum = calculator.sum(3,2);
        assertEquals(5, resultSum);
    }

}
