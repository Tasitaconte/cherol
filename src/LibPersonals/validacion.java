package LibPersonals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validacion {
    
    public boolean validacionEmail(String email) {
        Pattern pattern = Pattern.compile("^[a-z0-9_\\+]+(\\.[a-z0-9_]+)*@"+"(fesc)\\.edu.co(\\W|$)");
        Matcher mather = pattern.matcher(email);
        if (mather.find()) {
            System.out.println("email válido.");
            return true;
        } else {
            System.out.println(" email inválido.");
        }
        return false;
    }
    public boolean validacionName(String name) {
        Pattern pattern = Pattern.compile("^[A-Za-z]");
        Matcher mather = pattern.matcher(name);
        if (mather.find()) {
            System.out.println("Nombre Valido");
            return true;
        } else {
            System.out.println("Nombre Invalido");
        }
        return false;
    }
}
