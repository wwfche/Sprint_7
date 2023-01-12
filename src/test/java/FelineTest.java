import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Enclosed.class)
public class FelineTest {

    @RunWith(Parameterized.class)
    public static class FelineTestWithParam extends BaseTest {
        private final String ANIMAL_KIND;
        private final List<String> LIST;

        public FelineTestWithParam(String ANIMAL_KIND, List<String> LIST) {
            this.ANIMAL_KIND = ANIMAL_KIND;
            this.LIST = LIST;
        }

        @Parameterized.Parameters
        public static Object[][] getTestData() {
            return new Object[][]{
                    {"Травоядное", List.of("Трава", "Различные растения")},
                    {"Хищник", List.of("Животные", "Птицы", "Рыба")}
            };
        }

        @Test
        public void testAnimalKind() throws Exception {
            Feline feline = new Feline();
            assertEquals(LIST, feline.getFood(ANIMAL_KIND));
        }

        @Test
        public void testGetFamily() {
            Feline feline = new Feline();
            assertEquals("Кошачьи", feline.getFamily());
        }

        @Test
        public void testKetKittens() {
            Feline feline = new Feline();
            assertEquals("Должно быть - 1", 1, feline.getKittens());
        }
    }

    public static class FelineTestNoParam extends BaseTest{

        @Test
        public void testGetKittens(){
            Feline feline = new Feline();
            assertEquals("Должно быть - 1", 1, feline.getKittens());
        }
    }
}
