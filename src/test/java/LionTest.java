import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.*;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTest extends BaseTest {
    private final String SEX;
    private final Boolean MANE;

    public LionTest(String SEX, Boolean MANE) {
        this.SEX = SEX;
        this.MANE = MANE;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void checkIfLionHasMane() throws Exception {
        Lion lion = new Lion(SEX, feline);
        assertEquals(MANE, lion.doesHaveMane());
    }
    @Test
    public void checkCountOfKittens() throws Exception {
        Lion lion = new Lion(SEX, feline);
        Mockito.when(feline.getKittens()).thenReturn(5);
        assertEquals(5, lion.getKittens());
    }
    @Test
    public void getFood() throws Exception {
        Lion lion = new Lion(SEX, feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Мясо"));
        assertEquals(List.of("Мясо"), lion.getFood());
    }
}
