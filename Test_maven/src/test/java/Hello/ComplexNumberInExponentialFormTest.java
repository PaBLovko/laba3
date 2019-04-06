package Hello;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplexNumberInExponentialFormTest {

    @Test
    public void toCartesianForm() {
        String str = "1.3e^64i";
        ComplexNumberInExponentialForm complex = new ComplexNumberInExponentialForm(str);
        assertEquals("0,51+1,20i",complex.toCartesianForm());
    }
}