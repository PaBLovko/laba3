package Hello;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplexNumberInAlgebraicFormTest {
    String str = "12.00-65.30i";
    ComplexNumberInAlgebraicForm complex = new ComplexNumberInAlgebraicForm(str);

    @Test
    public void toCartesianForm() {
        assertEquals("12,00-65,30i",complex.toCartesianForm());
    }

    @Test
    public void toExponencialForm() {
        assertEquals("66,39e^-1,39i",complex.toExponencialForm());
    }

    @Test
    public void getArgument() {
        assertEquals(-1.38,complex.getArgument(), 1);
    }

    @Test
    public void getModule() {
        assertEquals(66.39,complex.getModule(), 1);
    }
}