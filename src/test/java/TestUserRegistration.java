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

}