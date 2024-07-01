import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RomainNumeriqueTest {

    @Test
    public void testConvert1ToI() {
        RomainNumerique converter = new RomainNumerique();
        String result = converter.convert(1);
        assertEquals("I", result);
    }
}
