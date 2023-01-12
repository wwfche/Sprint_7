import com.example.Cat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest extends BaseTest {
    @Test
    public void catHasSound() {
        Cat cat = new Cat(feline);
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void catEatMeat() throws Exception {
        Cat cat = new Cat(feline);
        List<String> list = List.of("Животные", "Птицы");
        Mockito.when(feline.eatMeat()).thenReturn(list);
        assertEquals(list, cat.getFood());
    }
}
