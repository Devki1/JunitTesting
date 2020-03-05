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
    public void givenLastName_WhenProper_ShouldReturnTrue()
    {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validLastName("Raj");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue()
    {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validEmailId("gdev826@gmail.com");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue()
    {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validMobileNumber("91 9415664675");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenLengthPassword_WhenProper_ShouldReturnTrue()
    {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validLengthPassword("rahulrajrahul");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenUpperCase_WhenProper_ShouldReturnTrue()
    {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.upperCaseAtleastOne("rahulRajrahul");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenNumericValue_WhenProper_ShouldReturnTrue()
    {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.atleastOneNumericValue("rahulRaj5rahul");
        Assert.assertEquals(true,result);

    }
}