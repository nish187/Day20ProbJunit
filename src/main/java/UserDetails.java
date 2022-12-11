import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@FunctionalInterface
interface LambdaFunction {
    boolean checkRegex(String regex, String UserInput);
}


public class UserDetails {

    public static final String nameRegex = "^[A-Z]{1}[a-z]{2,}$";

    public static final String emailIdRegex = "^[a-zA-Z0-9]+([._+-][0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";

    public static final String mobileNoRegex = "^[0-9]{2}\\s{1}[0-9]{10}$";

    public static final String passwordRegex = "^[a-z](?=.*[A-Z]+)(?=.*[0-9]+)(?=.*[@$!%*#?&]{1}).{8,}$";

    public static String firstName, lastName, emailId, mobileNo, password;
    public static Scanner scanner = new Scanner(System.in);


    static LambdaFunction validation = (regex, userInput) -> {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(userInput);
        return matcher.matches();
    };


    public static void main(String[] args) {
        System.out.println("Enter First Name");
        firstName = scanner.next();
        firstNameValidation(firstName);
        System.out.println("Enter Last Name");
        lastName = scanner.next();
        lastNameValidation(lastName);
        System.out.println("Enter Email ID");
        emailId = scanner.next();
        emailValidation(emailId);
        System.out.println("Enter Mobile No.");
        mobileNo = scanner.next();
        mobileNoValidation(mobileNo);
        System.out.println("Enter Password");
        password = scanner.next();
        passwordValidation(password);
        scanner.close();
    }


    public static boolean firstNameValidation(String firstName) {
        try {
            if (validation.checkRegex(nameRegex, firstName)) {
                System.out.println("It's a valid first name");
                return true;
            } else System.out.println("It's an invalid first name.");
            return false;
        } catch (NullPointerException nullPointerException) {
            System.out.println("Enter a valid first name");
        }
        return false;
    }


    public static boolean lastNameValidation(String lastName) {
        try {
            if (validation.checkRegex(nameRegex, lastName)) {
                System.out.println("It's a valid last name");
                return true;
            } else System.out.println("It's an invalid last name.");
            return false;
        } catch (NullPointerException nullPointerException) {
            System.out.println("Enter a valid last name");
        }
        return false;
    }


    public static boolean emailValidation(String emailId) {
        try {
            if (validation.checkRegex(emailIdRegex, emailId)) {
                System.out.println("It's a valid email id");
                return true;
            } else System.out.println("It's an invalid email id.");
            return false;
        } catch (NullPointerException nullPointerException) {
            System.out.println("Enter a valid email id");
        }
        return false;
    }


    public static boolean mobileNoValidation(String mobileNo) {
        try {
            if (validation.checkRegex(mobileNoRegex, mobileNo)) {
                System.out.println("It's a valid phone no.");
                return true;
            } else System.out.println("It's an invalid phone no.");
            return false;
        } catch (NullPointerException nullPointerException) {
            System.out.println("Enter a valid phone no.");
        }
        return false;
    }


    public static boolean passwordValidation(String password) {
        try {
            if (validation.checkRegex(passwordRegex, password)) {
                System.out.println("It's a valid password.");
                return true;
            } else System.out.println("It's an invalid password.");
            return false;
        } catch (NullPointerException nullPointerException) {
            System.out.println("Enter a valid password.");
        }
        return false;
    }
}