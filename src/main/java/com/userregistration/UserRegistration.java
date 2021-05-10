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
        String firstName = scanner.nextLine();
        pattern= Pattern.matches("[A-Z][a-z]{2,}",firstName);
        if (pattern){
            System.out.println("You have entered a valid First Name");
        }else{
            System.out.println("You have entered a invalid First Name");
        }
    }

    /**
     * @description Main method to create the objects and for calling the methods
     * @param args
     */
    public static void main (String[] args){
        UserRegistration User = new UserRegistration();
        User.firstNameValidation();
    }
}
