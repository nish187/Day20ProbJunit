import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Emailtest {

    private String emailIds;
    private boolean expectedResult;


    public Emailtest(String emailIds, boolean expectedResult) {
        this.emailIds = emailIds;
        this.expectedResult = expectedResult;
    }


    @Parameterized.Parameters
    public static Collection mailIdsExpectedResult() {
        return Arrays.asList(new Object[][] { { "abc@yahoo.com", true }, { "abc-100@yahoo.com", true },
                { "abc.100@yahoo.com", true }, { "abc111@abc.com", true }, { "abc-100@abc.net", true },
                { "abc.100@abc.com.au", true }, { "abc@1.com", true }, { "abc@gmail.com.com", true },
                { "abc+100@gmail.com", false } });
    }

    @Test
    public void givenEmailIds_withExpectedResult_shouldPassAllTheTestCases() {
        EmailValidator testEmailIds = new EmailValidator();
        boolean result = testEmailIds.emailIdValidator(this.emailIds);
        Assertions.assertEquals(this.expectedResult, result);
    }
}