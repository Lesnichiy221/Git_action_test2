import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MAxServiceTest {

    @Test
    public void shouldFindMax(){
        MaxService service = new MaxService();

        int a = 5;
        int b = 4;

        int expected = 5;
        int actual = service.max(a, b);

        Assertions.assertEquals(expected, actual);
    }
}