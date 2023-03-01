package userRegistration;
import java.util.Scanner;
import java.util.regex.Pattern;
public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to User Registration");
        UserRegistration userregistration = new UserRegistration();
        System.out.println();
        System.out.println("Enter Your First Name");
        String firstName = scanner.next();
        userregistration.validFirstName(firstName);
        System.out.println();
        System.out.println("Enter Your Last Name");
        String lastName = scanner.next();
        userregistration.validLastName(lastName);
    }
    public void validFirstName(String firstName) {
        String pattern ="^[A-Z]{1}[ a-z]{2,25}$";
        if(Pattern.matches(pattern, firstName)) {
            System.out.println("First name is Valid");
        }else {
            System.out.println("First name is Invalid");
        }
    }
    public void validLastName(String lastName) {
        String pattern = "^[A-Z]{1}[ a-z]{2,25}$";
        if(Pattern.matches(pattern, lastName)) {
            System.out.println("Last name is Valid");
        } else {
            System.out.println("Last name is Invalid");
        }
    }
}


