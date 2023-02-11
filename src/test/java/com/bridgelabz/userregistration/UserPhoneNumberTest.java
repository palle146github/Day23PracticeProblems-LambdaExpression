package com.bridgelabz.userregistration;

import com.bridgelabz.lambdaexpression.userregistration.UserPatternValidation;
import com.bridgelabz.lambdaexpression.userregistration.UserRegistrationException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserPhoneNumberTest {


    UserPatternValidation upv;

    @Before
    public void init(){
        upv = new UserPatternValidation();
    }

    @Test//Normal method
    public void happyTest() throws UserRegistrationException {
        String name = "91 9959250350";
        String result = upv.userPhoneNumberValidationUsualway(name);
        Assert.assertEquals("Valid", result);
    }

    @Test//Lambda method
    public void happyTestLamda() throws UserRegistrationException {
        String name = "91 9959250350";
        String result = upv.userPhoneNumberLambdaValidation(name);
        Assert.assertEquals("Valid", result);
    }


    @Test//Normal method
    public void sadTestNormal() throws UserRegistrationException {
        try{
            String name = "919703529040";
            String result = upv.userPhoneNumberValidationUsualway(name);
        }catch (UserRegistrationException e){
            Assert.assertEquals("Invalid", e.message);
            System.out.println(e.message);        }
    }

    @Test//Lambda method
    public void sadTestLambda() throws UserRegistrationException {
        try {
            String name = "919703529040";
            String result = upv.userPhoneNumberLambdaValidation(name);
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Invalid", e.message);
            System.out.println(e.message);
        }
    }
}
