package Hello;

public class AbstractNumber extends Number {

    public static String add(ComplexNumberInAlgebraicForm cn1, ComplexNumberInAlgebraicForm cn2, boolean switchedOn) {
        if(!switchedOn)
            return new ComplexNumberInAlgebraicForm(cn1.getRe() + cn2.getRe(), cn1.getIm() + cn2.getIm()).toString();
        else return new ComplexNumberInAlgebraicForm(cn1.getRe() + cn2.getRe(), cn1.getIm() + cn2.getIm()).toExponencialForm();
    }

    public static String dif(ComplexNumberInAlgebraicForm cn1, ComplexNumberInAlgebraicForm cn2,boolean switchedOn) {
        if(!switchedOn)
            return new ComplexNumberInAlgebraicForm(cn1.getRe() - cn2.getRe(), cn1.getIm() - cn2.getIm()).toString();
        else return new ComplexNumberInAlgebraicForm(cn1.getRe() - cn2.getRe(), cn1.getIm() - cn2.getIm()).toExponencialForm();
    }

    public static String mul(ComplexNumberInAlgebraicForm cn1, ComplexNumberInAlgebraicForm cn2,boolean switchedOn) {
        if(!switchedOn)
            return new ComplexNumberInAlgebraicForm(cn1.getRe() * cn2.getRe() - cn1.getIm() * cn2.getIm(),
                    cn1.getRe() * cn2.getIm() + cn1.getIm() * cn2.getRe()).toString();
        else return new ComplexNumberInAlgebraicForm(cn1.getRe() * cn2.getRe() - cn1.getIm() * cn2.getIm(),
                cn1.getRe() * cn2.getIm() + cn1.getIm() * cn2.getRe()).toExponencialForm();
    }

    public static String div(ComplexNumberInAlgebraicForm cn1, ComplexNumberInAlgebraicForm cn2,boolean switchedOn) {
        double a1 = cn1.getRe();
        double a2 = cn2.getRe();
        double b1 = cn1.getIm();
        double b2 = cn2.getIm();
        double a2_pow = StrictMath.pow(a2, 2.);
        double b2_pow = StrictMath.pow(b2, 2.);
        double sum = a2_pow+b2_pow;
        if(!switchedOn)
            return new ComplexNumberInAlgebraicForm((a1 * a2 + b1 * b2) / sum, (a2 * b1 - a1 * b2) / sum).toString();
        else return new ComplexNumberInAlgebraicForm((a1 * a2 + b1 * b2) / sum, (a2 * b1 - a1 * b2) / sum).toExponencialForm();
    }
}