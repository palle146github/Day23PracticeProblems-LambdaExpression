package com.bridgelabz.userregistration;

import com.bridgelabz.lambdaexpression.userregistration.UserPatternValidation;
import com.bridgelabz.lambdaexpression.userregistration.UserRegistrationException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class UserNameTest {
    UserPatternValidation upv;

    @Before
    public void init(){
    upv = new UserPatternValidation();
    }

    @Test//Normal method
    public void happyTest() throws UserRegistrationException {
        String name = "Prasanth";
        String result = upv.userNameValidationUsualway(name);
        Assert.assertEquals("Valid", result);
    }

    @Test//Lambda method
    public void happyTestLamda() throws UserRegistrationException {
        String name = "Prasanth";
        String result = upv.userNameLambdaValidation(name);
        Assert.assertEquals("Valid", result);
    }


    @Test//Normal method
    public void sadTestNormal() throws UserRegistrationException {
        try{
            String name = "prasanth";
            String result = upv.userNameValidationUsualway(name);
        }catch (UserRegistrationException e){
            Assert.assertEquals("Invalid", e.message);
            System.out.println(e.message);        }
    }

    @Test//Lambda method
    public void sadTestLambda() throws UserRegistrationException {
        try {
            String name = "prasanth";
            String result = upv.userNameLambdaValidation(name);
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Invalid", e.message);
            System.out.println(e.message);
        }
    }
}
