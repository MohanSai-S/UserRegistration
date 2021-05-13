package com.userregistration;
import java.util.*;
import java.util.regex.*;

/**
 * @description Class for defining the User Registration with regex
 *
 */
public class UserRegistration {
    private boolean pattern;

    /**
     * @description Public Method for validating the user input of first name
     * @return
     */
    public boolean firstNameValidation(String firstName){
        pattern= Pattern.matches("[A-Z][a-z]{2,}",firstName);
        if (pattern){
            return true;
        }else{
            return false;
        }
    }

    /**
     * @description Public Method for validating the user input of last name
     */
    public boolean lastNameValidation(String lastName){
        pattern = Pattern.matches("[A-Z][a-z]{2,}",lastName);
        if(pattern){
            return true;
        }else {
            return false;
        }
    }

    /**
     * @description Public Method for validating the user input of email
     *
     */
    public boolean emailValidation(String email){
        pattern = Pattern.matches("^[a-zA-Z0-9-_+]+(?:\\.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]{2,4}+)*$",email);
        if(pattern){
            return true;
        }else {
            return false;
        }
    }

    /**
     * @description Public Method for validating the user input of mobile number
     */
    public boolean mobileNumberValidation(String mobileNumber){
//        System.out.println("Mobile number:");
//        String mobileNumber = scanner.nextLine();
        pattern = Pattern.matches("^[0-9]{2} [0-9]{10}$",mobileNumber);
        if(pattern){
            return true;
        }else {
            return false;
        }

    }

    /**
     * @description Public Method for validating the user input of password
     * Rule1 Password should be minimum 8 Characters
     * Rule2 Password should contain atleast one upper case Letter
     * Rule3 Password should contain atleast one numeric value
     * Rule4 Password should contain atleast one Special Character
     */
    public boolean passwordValidation(String password){
        pattern = Pattern.matches("(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_+=-])[a-zA-Z0-9!@#$%^&*()_+=-]{8,}",password);
        if(pattern){
            return true;
        }else {
            return false;
        }
    }
}