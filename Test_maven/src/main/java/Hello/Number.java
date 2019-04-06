package Hello;

public class Number {

    private String value;

    public Number(String value) {
        if (!Exceptions.containsComplex(value)) throw new IllegalArgumentException("No complex in string");
        this.value = value;
    }

    public Number() {
        this.value = "";
    }

    public String getValue() {
        return value;
    }
}
