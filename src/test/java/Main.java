import junit.framework.*;
import org.junit.Test;

public class Main extends TestCase {

    @Test
    private void sum(){
        int resultSum = sumF(3,2);
        assertEquals(5, resultSum);
    }

}
