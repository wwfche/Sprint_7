import com.example.Feline;
import org.junit.Before;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class BaseTest {
    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);
    }
    @Mock
    Feline feline;
}
