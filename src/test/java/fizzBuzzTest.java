import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class fizzBuzzTest {

    @Test

    public void shouldReturnString() {
        fizzBuzz fb = new fizzBuzz();
        assertEquals(true, fb.printString() instanceof String);
    }
}
