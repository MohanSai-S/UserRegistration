package com.userregistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void validateFirstName(){
        boolean test1 = userRegistration.firstNameValidation("Naveen");
        boolean test2 = userRegistration.firstNameValidation("Sunny");
        boolean test3 = userRegistration.firstNameValidation("Sumanth");
        boolean test4 = userRegistration.firstNameValidation("Guru");
        boolean test5 = userRegistration.firstNameValidation("kranthi");

        Assertions.assertTrue(test1);
        Assertions.assertTrue(test2);
        Assertions.assertTrue(test3);
        Assertions.assertTrue(test4);
        Assertions.assertFalse(test5);
    }

    @Test
    public void validateLastName(){
        boolean test1 = userRegistration.lastNameValidation("Naveen");
        boolean test2 = userRegistration.lastNameValidation("Sunny");
        boolean test3 = userRegistration.lastNameValidation("guru");
        boolean test4 = userRegistration.lastNameValidation("Kranthi");
        boolean test5 = userRegistration.lastNameValidation("Sai");

        Assertions.assertTrue(test1);
        Assertions.assertTrue(test2);
        Assertions.assertFalse(test3);
        Assertions.assertTrue(test4);
        Assertions.assertTrue(test5);
    }

    @Test
    public void validateEmail(){
        boolean test1 = userRegistration.emailValidation("abc-hello@gmail.com");
        boolean test2 = userRegistration.emailValidation("guru.2329@gmail.com");
        boolean test3 = userRegistration.emailValidation("sumanth2233@hotmail.com");
        boolean test4 = userRegistration.emailValidation("suny.smart@sun.in");
        boolean test5 = userRegistration.emailValidation("Naveen.29@sbi.in");

        Assertions.assertTrue(test1);
        Assertions.assertTrue(test2);
        Assertions.assertTrue(test3);
        Assertions.assertTrue(test4);
        Assertions.assertTrue(test5);
    }

    @Test
    public void validateMobileNumber(){
        boolean test1 = userRegistration.mobileNumberValidation("91 7093870995");
        boolean test2 = userRegistration.mobileNumberValidation("91 7799214552");
        boolean test3 = userRegistration.mobileNumberValidation("114 8106522158");
        boolean test4 = userRegistration.mobileNumberValidation("84 9515922566");
        boolean test5 = userRegistration.mobileNumberValidation("341 84587695423");

        Assertions.assertTrue(test1);
        Assertions.assertTrue(test2);
        Assertions.assertFalse(test3);
        Assertions.assertTrue(test4);
        Assertions.assertFalse(test5);
    }

    @Test
    public void validatePassword() {
        boolean test1 = userRegistration.passwordValidation("Sai@2329");
        boolean test2 = userRegistration.passwordValidation("Guru.23");
        boolean test3 = userRegistration.passwordValidation("27.Kranthi");
        boolean test4 = userRegistration.passwordValidation("MOm@IamLucky");
        boolean test5 = userRegistration.passwordValidation("Dad$Mom");

        Assertions.assertTrue(test1);
        Assertions.assertTrue(test2);
        Assertions.assertTrue(test3);
        Assertions.assertTrue(test4);
        Assertions.assertTrue(test5);
    }
}
