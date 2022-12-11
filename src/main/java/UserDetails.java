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

    public boolean testFirstName(String firstName) {
        try {
            if (!firstName(firstName)) {
                throw new InvalidInputException("Entered FirstName is Invalid\n" +
                        "First name starts with Capital Letter and has\n" +
                        "minimum 3 characters");
            } else {
                System.out.println("Entered FirstName is Valid");
            }
        } catch (InvalidInputException e) {
            System.out.println("Exception is Occurred " + e);
            e.printStackTrace();
        }
        return firstName(firstName);
    }


    public boolean lastName(String lastName) {
        regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    public boolean testLastName(String lastName)  {
        try {
            if (!lastName(lastName)) {
                throw new InvalidInputException("Entered LastName is Invalid\n" +
                        "Last name starts with Capital Letter and has\n" +
                        "minimum 3 characters");
            } else {
                System.out.println("Entered LastName is Valid");
            }
        } catch (InvalidInputException e) {
            System.out.println("Exception is Occurred " + e);
            e.printStackTrace();
        }
        return lastName(lastName);
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

}