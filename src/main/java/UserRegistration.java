import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
    //Validate first name
    String COUNTRY_CODE = "91";
    String patternValidName = "^[A-Z]{1}[a-z]{2,}$";
    String patternValidLastName = "^[A-Z]{1}[a-z]{2,}$";
    String patternForEmailId = "^[a-z]{1,}([.]?[-]?[+]?[a-z0-9]{1,})?[@]{1}[a-z0-9]{1,}[.]{1}[a-z]{2,4}([.]?[a-z]{2,4})?$";
    String patternValidMobileNumber = "^" + COUNTRY_CODE + "[ ][9876]{1}[0-9]{9}";
    String patternValidLengthPassword = "^.{8,}$";
    String patternUpperCase = ".*[A-Z]+.*";
    String patternAtLeastOneNumber = ".*[0-9].*";
    String patternExactlyOneSpecialCharacter = "[A-Z0-9a-z]*[!@#%&]{1}[A-Z0-9a-z]*";
    boolean outcome=true;

    public boolean validator(String pattern, String user) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(user);
        return m.matches();
    }

    //Validating for first name
    public boolean validFirstName(String firstName) {
        return validator(patternValidName, firstName);
    }

    //Validate regex for last name
    public boolean validLastName(String lastName) {
        return validator(patternValidLastName, lastName);
    }

    //Validate pattern for emailid
    public boolean validEmailId(String emialId) {
        return validator(patternForEmailId, emialId);
    }

    //Validating mobile number pattern
    public boolean validMobileNumber(String mobileNumber) {
        return validator(patternValidMobileNumber, mobileNumber);
    }

    //Length of password minimum 8 character
    public  boolean validLengthPassword(String lengthPassword) {
        return validator(patternValidLengthPassword, lengthPassword);
    }

    //Validating password atleast one upper case
    public boolean upperCaseAtleastOne(String upperCase) {
        return validator(patternUpperCase, upperCase);
    }

    public boolean atleastOneNumericValue(String numericValue) {
        return validator(patternAtLeastOneNumber, numericValue);
    }

    //Validating exactly one special character in a password
    public boolean exactlyOneSpecialCharacter(String specialCharacter) {

        return validator(patternExactlyOneSpecialCharacter, specialCharacter);
    }
    //Check the combination of all password
    public boolean checkPassword(String password)
    {
        if (validLengthPassword(password)==true)
        {
            if (upperCaseAtleastOne(password) == true)
            {
                if (atleastOneNumericValue(password) == true)
                {
                    if (exactlyOneSpecialCharacter(password) == true)
                    {
                        outcome = true;
                    }
                    else
                    {
                        outcome = false;
                    }
                }
                else
                {
                    outcome = false;
                }
            }
            else
            {
                outcome = false;
            }
        }
        else
        {
            outcome = false;
        }
        return outcome;
    }
}

