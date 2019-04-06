package Hello;

import javafx.beans.property.SimpleBooleanProperty;

public class Expression {
    private Number[] array = new Number[2];
    private char operation;

    public Expression (Number z1, Number z2, char symbol) {
        array[0] = z1;
        array[1] = z2;
        operation = symbol;
    }

    public String process(boolean switchedOn) {
        ComplexNumberInAlgebraicForm z1;
        ComplexNumberInAlgebraicForm z2;
         if(Exceptions.containsComplexString(array[0].getValue()).equals("EXPONENCIAL"))
             z1 = new ComplexNumberInAlgebraicForm(new ComplexNumberInExponentialForm(array[0].getValue()).toCartesianForm());
         else z1 = new ComplexNumberInAlgebraicForm(array[0].getValue());
         if(Exceptions.containsComplexString(array[1].getValue()).equals("EXPONENCIAL"))
             z2 = new ComplexNumberInAlgebraicForm(new ComplexNumberInExponentialForm(array[1].getValue()).toCartesianForm());
         else z2 = new ComplexNumberInAlgebraicForm(array[1].getValue());
        if (operation == '+')
                 return AbstractNumber.add(z1,z2, switchedOn);
             if (operation == '-')
                 return AbstractNumber.dif(z1,z2, switchedOn);
             if (operation == '*')
                 return AbstractNumber.mul(z1,z2, switchedOn);
             else
                 return AbstractNumber.div(z1,z2, switchedOn);
    }
}