import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegexTest {

    UserDetails userDetails = new UserDetails();


    @Test
    public void testFistName() throws NullPointerException {
        boolean result = userDetails.testFirstName(null);
        assertTrue(result);
    }


    @Test
    public void testLastName() {
        boolean result = userDetails.testLastName("Nishant");
        assertTrue(result);
    }
    @Test
    public void testLastNameFalse() {
        boolean result = userDetails.testLastName("Singh");
        assertFalse(result);
    }


    @Test
    public void testEmail() {
        boolean result = userDetails.email("nishant.singh@bl.co.in");
        assertTrue(result);
    }


    @Test
    public void testMobile() {
        boolean result = userDetails.mobile("91 6207142236");
        assertTrue(result);
    }


    @Test
    public void testPassword() {
        boolean result = userDetails.password("Nishant12345");
        assertTrue(result);
    }
}