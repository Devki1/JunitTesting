import org.junit.Assert;
import org.junit.Test;
public class TestUserRegistration
{
    @Test
    //Test case for validate first name
    public void givenFirstName_WhenProper_ShouldReturnTrue()
    {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validFirstName("Dev");
        Assert.assertEquals(true, result);
    }
    @Test
    //Test case for last name
    public void givenLastName_WhenProper_ShouldReturnTrue()
    {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validLastName("Raj");
        Assert.assertEquals(true,result);
    }
    @Test
    //Test case for validating password emailid
    public void givenEmailId_WhenProper_ShouldReturnTrue()
    {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validEmailId("gdev826@gmail.com");
        Assert.assertEquals(true,result);
    }
    @Test
    //Test case for validating password for mobile number
    public void givenMobileNumber_WhenProper_ShouldReturnTrue()
    {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validMobileNumber("91 9415664675");
        Assert.assertEquals(true,result);
    }
    @Test
    //Test case for validating password for proper length
    public void givenLengthPassword_WhenProper_ShouldReturnTrue()
    {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validLengthPassword("rahulrajrahul");
        Assert.assertEquals(true,result);
    }
    @Test
    //Test case for validating password atleast one upper case
    public void givenUpperCase_WhenProper_ShouldReturnTrue()
    {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.upperCaseAtleastOne("rahulRajrahul");
        Assert.assertEquals(true,result);
    }
    @Test
    //Test case for validating password for atleast one number
    public void givenNumericValue_WhenProper_ShouldReturnTrue()
    {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.atleastOneNumericValue("rahulRaj5rahul");
        Assert.assertEquals(true,result);
    }
    @Test
    //Test case for validating password for exactly one special character
    public void givenSpecialCharacter_WhenProper_ShouldReturnTrue()
    {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.exactlyOneSpecialCharacter("rahulRaj5@rahul");
        Assert.assertEquals(true,result);
    }
}