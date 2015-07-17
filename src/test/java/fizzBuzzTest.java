import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class fizzBuzzTest {

    @Test
    public void shouldReturnString() {
        fizzBuzz fb = new fizzBuzz();
        assertEquals(true, fb.printString(1) instanceof String);
    }

    @Test
    public void shouldReturnFizzIfMultipleOf3() {
        fizzBuzz fb=new fizzBuzz();
        assertEquals("Fizz",fb.printString(3));
    }

    @Test
    public void shouldReturnBuzzIfMultipleOf5()  {
        fizzBuzz fb=new fizzBuzz();
        assertEquals("Buzz",fb.printString(5));
    }
}
