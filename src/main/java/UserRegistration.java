import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
        //Validate first name
        String COUNTRY_CODE = "91";
        public boolean validFirstName (String firstName)
        {
            String patternValidName = "^[A-Z]{1}[a-z]{2,}$";
            Pattern p = Pattern.compile(patternValidName);
            Matcher m = p.matcher(firstName);
            return m.matches();
        }
        //Validate regex for last name
        public boolean validLastName (String lastName)
        {
            String patternValidLastName = "^[A-Z]{1}[a-z]{2,}$";
            Pattern p = Pattern.compile(patternValidLastName);
            Matcher m = p.matcher(lastName);
            return m.matches();
        }
        //Validate pattern for emailid
        public boolean validEmailId (String emialId)
        {
            String patternValidEmailId = "^[a-z]{1,}([.]?[-]?[+]?[a-z0-9]{1,})?[@]{1}[a-z0-9]{1,}[.]{1}[a-z]{2,4}([.]?[a-z]{2,4})?$";
            Pattern p = Pattern.compile(patternValidEmailId);
            Matcher m = p.matcher(emialId);
            return m.matches();
        }
        public boolean validMobileNumber(String mobileNumber)
        {
            String patternValidMobileNumber = "^"+COUNTRY_CODE+ "[ ][9876]{1}[0-9]{9}";
            Pattern p = Pattern.compile(patternValidMobileNumber);
            Matcher m = p.matcher(mobileNumber);
            return m.matches();
        }
    }

