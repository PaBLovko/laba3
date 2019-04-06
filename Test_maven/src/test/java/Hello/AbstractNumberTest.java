package Hello;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AbstractNumberTest {

    final ComplexNumberInAlgebraicForm cn1 = new ComplexNumberInAlgebraicForm("1+3i");
    final ComplexNumberInAlgebraicForm cn2 = new ComplexNumberInAlgebraicForm("1+4i");
    @Test
    public void add() {
        assertEquals("2,00+7,00i", ComplexNumberInAlgebraicForm.add(cn1,cn2,false));
        assertEquals("7,28e^1,29i", ComplexNumberInAlgebraicForm.add(cn1,cn2,true));
    }

    @Test
    public void dif() {
        assertEquals("0,00-1,00i", ComplexNumberInAlgebraicForm.dif(cn1,cn2,false));
        assertEquals("1,00e^-1,57i", ComplexNumberInAlgebraicForm.dif(cn1,cn2,true));
    }

    @Test
    public void mul() {
        assertEquals("-11,00+7,00i", ComplexNumberInAlgebraicForm.mul(cn1,cn2,false));
        assertEquals("13,04e^-0,57i", ComplexNumberInAlgebraicForm.mul(cn1,cn2,true));
    }

    @Test
    public void div() {
        assertEquals("0,76-0,06i", ComplexNumberInAlgebraicForm.div(cn1,cn2,false));
        assertEquals("0,77e^-0,08i", ComplexNumberInAlgebraicForm.div(cn1,cn2,true));
    }
}