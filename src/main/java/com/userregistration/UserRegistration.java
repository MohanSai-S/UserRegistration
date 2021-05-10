package com.userregistration;
import java.util.*;
import java.util.regex.*;

/**
 * @description Class for defining the User Registration with regex
 *
 */
public class UserRegistration {
    private boolean pattern;
    private final Scanner scanner = new Scanner(System.in);

    /**
     * @description Private Method for validating the user input of first name
     */
    private void firstNameValidation(){
        System.out.println("First name:");
        String firstName = scanner.nextLine();
        pattern= Pattern.matches("[A-Z][a-z]{2,}",firstName);
        if (pattern){
            System.out.println("You have entered a valid First Name");
        }else{
            System.out.println("You have entered a invalid First Name");
        }
    }

    /**
     * @description Private Method for validating the user input of last name
     */
    private void lastNameValidation(){
        System.out.println("Last name :");
        String lastName = scanner.nextLine();
        pattern = Pattern.matches("[A-Z][a-z]{2,}",lastName);
        if(pattern){
            System.out.println("Entered a valid LastName");
        }else {
            System.out.println("Entered a invalid Last name");
        }
    }

    /**
     * @description Private Method for validating the user input of email
     *
     */
    private void emailValidation(){
        System.out.println("email :");
        String email = scanner.nextLine();
        pattern = Pattern.matches("^[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]{2,4}+)*$",email);
        if(pattern){
            System.out.println("Entered a valid email");
        }else {
            System.out.println("Entered a invalid email");
        }
    }

    /**
     * @description Private Method for validating the user input of mobile number
     */
    private void mobileNumberValidation(){
        System.out.println("Mobile number:");
        String mobileNumber = scanner.nextLine();
        pattern = Pattern.matches("^[0-9]{2} [0-9]{10}$",mobileNumber);
        if(pattern){
            System.out.println("Entered a valid Mobile number");
        }else {
            System.out.println("Entered a invalid Mobile number");
        }

    }

    /**
     * @description Private Method for validating the user input of password
     * Rule1 Password should be minimum 8 Characters
     * Rule2 Password should contain atleast one upper case Letter
     */
    private void passwordValidation(){

        System.out.println("Password:");
        String password = scanner.nextLine();
        pattern = Pattern.matches("(?=.*[A-Z])[a-zA-Z0-9]{8,}",password);
        if(pattern){
            System.out.println("Entered a valid Password");
        }else {
            System.out.println("Entered a invalid Password");
        }

    }
    /**
     * @description Main method to create the objects and for calling the methods
     * @param args
     */
    public static void main (String[] args){
        UserRegistration User = new UserRegistration();
        User.passwordValidation();
    }
}
