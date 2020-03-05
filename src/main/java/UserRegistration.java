import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration
{
    //Validate first name
    public boolean validFirstName(String firstName)
    {
        String patternValidName = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(patternValidName);
        Matcher m = p.matcher(firstName);
        return m.matches();
    }
    //Validate regex for last name
    public boolean validLastName(String lastName)
    {
        String patternValidLastName = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(patternValidLastName);
        Matcher m = p.matcher(lastName);
        return m.matches();
    }
}

