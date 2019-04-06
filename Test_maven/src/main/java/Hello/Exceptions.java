package Hello;

import java.util.regex.Pattern;

public class Exceptions {

    public static boolean containsComplex(String s) {
        s = s.trim();
        return getCartesian(s) || getExponencial(s);
    }

    public static boolean getCartesian(String s) {
        Pattern cartesian1 = Pattern.compile("\\d+\\.\\d+[+-](i\\*?\\d+\\.\\d+|\\d+\\.\\d+\\*?i)");// . .
        Pattern cartesian2 = Pattern.compile("\\d+[+-](i\\*?\\d+\\.\\d+|\\d+\\.\\d+\\*?i)");// _ .
        Pattern cartesian3 = Pattern.compile("\\d+[+-](i\\*?\\d+|\\d+\\*?i)"); // _ _
        Pattern cartesian4 = Pattern.compile("\\d+\\.\\d+[+-](i\\*?\\d+|\\d+\\*?i)");// . _
        if (cartesian1.matcher(s).find() || cartesian2.matcher(s).find() || cartesian3.matcher(s).find() || cartesian4.matcher(s).find()) return true;
        else return false;
    }

    public static boolean getExponencial(String s) {
        Pattern exponencial1 = Pattern.compile("(\\d+)?\\*?e\\^\\(?(i\\*\\d+\\.\\d+|\\d+\\.\\d+\\*?i\\)?)");// . .
        Pattern exponencial2 = Pattern.compile("(\\d+)?\\*?e\\^\\(?(i\\*\\d+\\.\\d+|\\d+\\.\\d+\\*?i\\)?)");// _ .
        Pattern exponencial3 = Pattern.compile("(\\d+)?\\*?e\\^\\(?(i\\*\\d+|\\d+\\*?i\\)?)");// _ _
        Pattern exponencial4 = Pattern.compile("(\\d+\\.\\d+)?\\*?e\\^\\(?(i\\*\\d+|\\d+\\*?i\\)?)");// . _
        if (exponencial1.matcher(s).find() || exponencial2.matcher(s).find() || exponencial3.matcher(s).find() || exponencial4.matcher(s).find()) return true;
        else return false;
    }

    public static String containsComplexString(String s) {
        s = s.trim();
        if(getCartesian(s)) return "CARTESIAN";
        else return "EXPONENCIAL";
    }
}