import static org.junit.Assert.assertEquals;

// import org.junit.*;
import org.junit.Test;

public class AppTest {
    @Test
    public void testSum() {
        // Given
        App calculator = new App();
        // When
        assertEquals(4, calculator.sum(2, 2));
    }

    @Test
    public void testMinus() {
        App calculator = new App();
        assertEquals(0, calculator.minus(2, 2));
    }

    @Test
    public void testdivide() {
        App calculator = new App();
        assertEquals(2, calculator.divide(6, 3));
    }

    @Test
    public void testmultiply() {
        App calculator = new App();
        assertEquals(4, calculator.multiply(2, 2));
    }

}
