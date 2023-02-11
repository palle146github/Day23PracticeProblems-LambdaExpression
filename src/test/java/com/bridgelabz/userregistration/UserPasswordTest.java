package com.bridgelabz.userregistration;

import com.bridgelabz.lambdaexpression.userregistration.UserPatternValidation;
import com.bridgelabz.lambdaexpression.userregistration.UserRegistration;
import com.bridgelabz.lambdaexpression.userregistration.UserRegistrationException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserPasswordTest {
    UserPatternValidation urv;

    @Before
    public void init(){
        urv = new UserPatternValidation();
    }

    @Test//Normal method
    public void happyTest() throws UserRegistrationException {
        String name = "Prasanth@1";
        String result = urv.userPasswordLambdaValidation(name);
        Assert.assertEquals("Valid", result);
    }

    @Test//Lambda method
    public void happyTestLamda() throws UserRegistrationException {
        String name = "Prasanth@1";
        String result = urv.userNameLambdaValidation(name);
        Assert.assertEquals("Valid", result);
    }


    @Test//Normal method
    public void sadTestNormal() throws UserRegistrationException {
        try{
            String name = "prasanth";
            String result = urv.userPasswordValidationUsualway(name);
        }catch (UserRegistrationException e){
            Assert.assertEquals("Invalid", e.message);
            System.out.println(e.message);        }
    }

    @Test//Lambda method
    public void sadTestLambda() throws UserRegistrationException {
        try {
            String name = "prasanth";
            String result = urv.userPasswordLambdaValidation(name);
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Invalid", e.message);
            System.out.println(e.message);
        }
    }
}
