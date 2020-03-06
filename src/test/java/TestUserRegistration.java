import org.junit.Assert;
import org.junit.Test;
public class TestUserRegistration
{
    UserRegistration validator = new UserRegistration();
    String validEmails[]={"abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com","abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au","abc@1.com","abc@gmail.com.com","abc+100@gmail.com"};
    String invalidEmails[]= {"abc","abc@.com.my","abc123@gmail.a","abc123@.com","abc123@.com.com",".abc@abc.com","abc()*@gmail.com","abc@%*.com","abc..2002@gmail.com","abc.@gmail.com ","abc@abc@gmail.com","abc@gmail.com.1a","abc@gmail.com.aa.au"};
    @Test
    //Test case for validate first name
    public void givenFirstName_WhenProper_ShouldReturnTrue()
    {
        boolean result = validator.validFirstName("Dev");
        Assert.assertEquals(true, result);
    }
    @Test
    //Test case for last name
    public void givenLastName_WhenProper_ShouldReturnTrue()
    {
        boolean result = validator.validLastName("Raj");
        Assert.assertEquals(true,result);
    }
    @Test
    //Test case for validating password emailid
    public void givenEmailId_WhenProper_ShouldReturnTrue()
    {
        for (String email : validEmails)
        {
            boolean result = validator.validEmailId(email);
            Assert.assertEquals(true, result);
        }
    }
    @Test
    //Test case for validating password emailid
    public void givenEmailId_WhenProper_ShouldReturnFalse()
    {
        for (String email : invalidEmails)
        {
            boolean result = validator.validEmailId(email);
            Assert.assertEquals(false, result);
        }
    }
    @Test
    //Test case for validating password for mobile number
    public void givenMobileNumber_WhenProper_ShouldReturnTrue()
    {
        boolean result = validator.validMobileNumber("91 9415664675");
        Assert.assertEquals(true,result);
    }
    @Test
    //Test case for validating password for proper length
    public void givenLengthPassword_WhenProper_ShouldReturnTrue()
    {
        boolean result = validator.validLengthPassword("rahulrajrahul");
        Assert.assertEquals(true,result);
    }
    @Test
    //Test case for validating password atleast one upper case
    public void givenUpperCase_WhenProper_ShouldReturnTrue()
    {
        boolean result = validator.upperCaseAtleastOne("LahulRajrahul");
        Assert.assertEquals(true,result);
    }
    @Test
    //Test case for validating password for atleast one number
    public void givenNumericValue_WhenProper_ShouldReturnTrue()
    {
        boolean result = validator.atleastOneNumericValue("ra1hulRaj5rahul");
        Assert.assertEquals(true,result);
    }
    @Test
    //Test case for validating password for exactly one special character
    public void givenSpecialCharacter_WhenProper_ShouldReturnTrue()
    {
        boolean result = validator.exactlyOneSpecialCharacter("rahulRaj5@rahul");
        Assert.assertEquals(true,result);
    }

    @Test
    //Combination of validating password
    public void givenCombinationAllPassword_WhenProper_ShouldReturnTrue()
    {
        boolean result = validator.checkPassword("Prasad97@P");
        Assert.assertEquals(true,result);
    }
}
