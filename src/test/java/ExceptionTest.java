import com.example.Feline;
import com.example.Lion;

import org.junit.Test;

import static org.junit.Assert.*;

// Extra test class for checking Exceptions
public class ExceptionTest extends BaseTest {

    // Exception in Lion class
    @Test
    public void catchExceptionWhenLionHasInvalidSex() {

        Exception exception = assertThrows(Exception.class, () -> new Lion("Test", feline));
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());

    }

    // Exception in Feline class
    @Test
    public void catchExceptionWhenFelineHasInvalidAnimalKind() {
        feline = new Feline();
        Exception exception = assertThrows(Exception.class, () -> feline.getFood("Test"));
        assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());
    }
}