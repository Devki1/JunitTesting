import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
    //Validate first name
    public boolean validFirstName(String firstName) {
        String patternValidName = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(patternValidName);
        Matcher m = p.matcher(firstName);
        return m.matches();
    }
}

