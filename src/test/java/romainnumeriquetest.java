import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RomainNumeriqueTest {

    @Test
    public void testConvert1ToI() {
        RomainNumerique converter = new RomainNumerique();
        String result = converter.convert(1);
        assertEquals("I", result);
    }

    @Test
    public void testConvert4ToIV() {
        RomainNumerique converter = new RomainNumerique();
        String result = converter.convert(4);
        assertEquals("IV", result);
    }

    @Test
    public void testConvert5ToV() {
        RomainNumerique converter = new RomainNumerique();
        String result = converter.convert(5);
        assertEquals("V", result);
    }

    @Test
    public void testConvert9ToIX() {
        RomainNumerique converter = new RomainNumerique();
        String result = converter.convert(9);
        assertEquals("IX", result);
    }

    @Test
    public void testConvert10ToX() {
        RomainNumerique converter = new RomainNumerique();
        String result = converter.convert(10);
        assertEquals("X", result);
    }

    @Test
    public void testConvert40ToXL() {
        RomainNumerique converter = new RomainNumerique();
        String result = converter.convert(40);
        assertEquals("XL", result);
    }

    @Test
    public void testConvert50ToL() {
        RomainNumerique converter = new RomainNumerique();
        String result = converter.convert(50);
        assertEquals("L", result);
    }

    @Test
    public void testConvert90ToXC() {
        RomainNumerique converter = new RomainNumerique();
        String result = converter.convert(90);
        assertEquals("XC", result);
    }

    @Test
    public void testConvert100ToC() {
        RomainNumerique converter = new RomainNumerique();
        String result = converter.convert(100);
        assertEquals("C", result);
    }

    @Test
    public void testConvert400ToCD() {
        RomainNumerique converter = new RomainNumerique();
        String result = converter.convert(400);
        assertEquals("CD", result);
    }

    @Test
    public void testConvert500ToD() {
        RomainNumerique converter = new RomainNumerique();
        String result = converter.convert(500);
        assertEquals("D", result);
    }

    @Test
    public void testConvert900ToCM() {
        RomainNumerique converter = new RomainNumerique();
        String result = converter.convert(900);
        assertEquals("CM", result);
    }

    @Test
    public void testConvert1000ToM() {
        RomainNumerique converter = new RomainNumerique();
        String result = converter.convert(1000);
        assertEquals("M", result);
    }
}
