package Hello;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionsTest {

    @Test
    public void containsComplex() {
        String s1 = "1.1+32.3i";
        assertTrue( Exceptions.containsComplex(s1));
    }

    @Test
    public void getCartesian() {
        String s1 = "1.1+32.3i";
        String s2 = "1+32.3i";
        String s3 = "1+32i";
        String s4 = "1.1+32i";
        assertTrue( Exceptions.getCartesian(s1) &&  Exceptions.getCartesian(s2) &&  Exceptions.getCartesian(s3) &&  Exceptions.getCartesian(s4));
    }

    @Test
    public void getExponencial() {
        String s1 = "1.1e^32.3i";
        String s2 = "1e^32.3i";
        String s3 = "1e^32i";
        String s4 = "1.1e^32i";
        assertTrue(Exceptions.getExponencial(s1)&& Exceptions.getExponencial(s2) && Exceptions.getExponencial(s3) && Exceptions.getExponencial(s4));
    }

    @Test
    public void containsComplexString() {
        String s1 = "1+32.3i";
        String s2 = "1e^32.3i";
        assertEquals("CARTESIAN", Exceptions.containsComplexString(s1));
        assertEquals("EXPONENCIAL", Exceptions.containsComplexString(s2));
    }
}