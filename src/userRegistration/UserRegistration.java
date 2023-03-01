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
        System.out.println();
        System.out.println("Enter Your Email ID");
        String emailID = scanner.next();
        userregistration.validEmail( emailID);
        System.out.println();
        System.out.println("Enter Your Mobile Number");
        String mobileNo = scanner.next();
        userregistration.validMobileFormat(mobileNo);
        System.out.println();
        System.out.println("Enter Password");
        String password = scanner.next();
        userregistration.validPassword(password);
        System.out.println();
        System.out.println("Enter Password");
        String Upppassword = scanner.next();
        userregistration.UppervalidPassword(Upppassword);
        System.out.println();
        System.out.println("Enter Password");
        String specialpassword = scanner.next();
        userregistration.SpecialCharPassword(specialpassword);
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
    public void validEmail(String emailID) {
        String pattern = "[a-zA-z]+(\\.([A-Za-z]*))+@[A-Za-z]+(\\.(([a-z]{2})*))+(\\.(([a-z]{2})*))$";
        if(Pattern.matches(pattern, emailID)) {
            System.out.println("Email ID is Valid");
        } else {
            System.out.println("Email ID is Invalid");
        }
    }
    public void validMobileFormat(String mobileNo) {
        String pattern = "((91){1})[ ]([98765]{1})([0-9]{9})$";
        if(Pattern.matches(pattern, mobileNo)) {
            System.out.println("Mobile Number  is Valid");
        }else {
            System.out.println("Mobile Number is Invalid");
        }
    }
    public void validPassword(String password) {
        String pattern = "[a-zA-z]{8,32}$";
        if(Pattern.matches(pattern, password)) {
            System.out.println("Password  is Valid");
        }else {
            System.out.println("Password is Invalid");
        }
    }
    public void UppervalidPassword(String Upppassword) {
        String pattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$";
        if(Pattern.matches(pattern, Upppassword)) {
            System.out.println("Password  is Valid");
        }else {
            System.out.println("Password is Invalid");
        }
    }
    public void SpecialCharPassword(String specialpassword) {
        String pattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$";
        if(Pattern.matches(pattern, specialpassword)) {
            System.out.println("Password  is Valid");
        }else {
            System.out.println("Password is Invalid");
        }
    }
}