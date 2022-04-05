import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() {
        boolean result = userRegistration.firstName("Ashvini");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_WhenInvalid_ShouldReturnFalse() {
 UC4_TestMobileNumber
        boolean result = userRegistration.firstName("ashvini");

UC2_TestLastName
        boolean result = userRegistration.firstName("ashvini");
      
        boolean result = userRegistration.firstName("kanojia");
      master
 master
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenLastName_WhenValid_ShouldReturnTrue() {
 UC4_TestMobileNumber
        boolean result = userRegistration.lastName("Kanojia");

 UC2_TestLastName
        boolean result = userRegistration.lastName("Kanojia");

        boolean result = userRegistration.lastName("Nandiwadekar");
 master
 master
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenInvalid_ShouldReturnFalse() {
 UC4_TestMobileNumber
        boolean result = userRegistration.lastName("kanojia");

 UC2_TestLastName
        boolean result = userRegistration.lastName("kanojia");
        Assert.assertEquals(false, result);
    }

}

        boolean result = userRegistration.lastName("patil");
 master
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        boolean result = userRegistration.email("abc.xyz@bl.co.in");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail_WhenInvalid_ShouldReturnFalse() {
        boolean result = userRegistration.email("abc.xyz.in");
        Assert.assertEquals(false, result);
    }

 UC4_TestMobileNumber
    @Test
    public void givenMobileNumber_WhenValid_ShouldReturnTrue() {
        boolean result = userRegistration.mobileNumber("91 700059464");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenMobileNumber_WhenInvalid_ShouldReturnFalse() {
        boolean result = userRegistration.mobileNumber("7000598464");
        Assert.assertEquals(false, result);
    }
}

}
 master
 master
