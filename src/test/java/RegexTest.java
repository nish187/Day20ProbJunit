import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class RegexTest {


    @Test
    public void givenProperFirstName_returnTrue() {

        UserDetails userDetails = new UserDetails();
        assertTrue(userDetails.firstNameValidation("Alpha"));
    }


    @Test
    public void givenImproperFirstName_returnFalse() {

        UserDetails userDetails = new UserDetails();
        assertFalse(userDetails.firstNameValidation("alpha"));
    }

    @Test
    public void givenNullFirstName_returnFalseByNullPointerException() {

        UserDetails userDetails = new UserDetails();
        assertFalse(userDetails.firstNameValidation(null));
    }

    @Test
    public void givenProperLastName_returnTrue() {

        UserDetails userDetails = new UserDetails();
        assertTrue(userDetails.lastNameValidation("Alpha"));
    }

    @Test
    public void givenImproperLastName_returnFalse() {

        UserDetails userDetails = new UserDetails();
        assertFalse(userDetails.lastNameValidation("alpha"));
    }

    @Test
    public void givenNullLastName_returnFalseByNullPointerException() {

        UserDetails userDetails = new UserDetails();
        assertFalse(userDetails.lastNameValidation(null));
    }
}