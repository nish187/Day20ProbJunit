
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetails {

    public String regex;


    public boolean firstName(String firstName) {
        regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }


    public boolean lastName(String lastName) {
        regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }


    public boolean email(String email) {
        regex = "^[a-z0-9]+([.][a-z0-9]+)*@bl[.]co[.][a-z]{2,3}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();

    }

    public boolean mobile(String mobile) {
        regex = "^[0-9]{2}(\\s){1}[0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobile);
        return matcher.matches();
    }


    public boolean password(String password) {
        regex = "^[a-zA-Z0-9]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
    public boolean upperCase(String upperCase) {
        regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*#?&]{1})[A-Za-z\\d@$!%*?&]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(upperCase);
        return matcher.matches();
    }
}