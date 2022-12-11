import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegexTest {

    UserDetails userDetails = new UserDetails();


    @Test
    public void testFistName() {
        boolean result = userDetails.firstName("Nishant");
        assertTrue(result);
    }


    @Test
    public void testLastName() {
        boolean result = userDetails.lastName("Singh");
        assertTrue(result);
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