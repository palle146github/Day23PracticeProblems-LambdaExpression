package com.bridgelabz.userregistration;

import com.bridgelabz.lambdaexpression.userregistration.UserPatternValidation;
import com.bridgelabz.lambdaexpression.userregistration.UserRegistrationException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
public class UserEmailParaTest {

    private String email;
    private String expectedResult;

    public UserEmailParaTest(String email, String expectedResult) {
        this.email = email;
        this.expectedResult = expectedResult;
    }

    UserPatternValidation upv;

    @Before
    public void init(){
        upv = new UserPatternValidation();
    }

    @Parameterized.Parameters
    public static Collection emailParamImput() {
        return Arrays.asList(new Object[][] { {"abc@yahoo.com", "Valid"},
                {"abc-100@yahoo.com", "Valid"}, {"abc-100@abc.net", "Valid"},
                {"abc.100@yahoo.com", "Valid"},{"abc.100@abc.com.au", "Valid"},
                {"abc111@abc.com", "Valid"}, {"abc@1.com", "Valid"}, {"abc@gmail.com.com", "Valid"},
                {"abc+100@gmail.com", "Valid"}, {"abc", "Invalid"},{"abc@.com.my", "Invalid"},
                {"abc123@gmail.a", "Invalid"},{"abc123@.com", "Invalid"},{".abc@abc.com", "Invalid"},
                {"abc()*@gmail.com", "Invalid"},{"abc123@.com.com", "Invalid"},{"abc@%*.com", "Invalid"},
                {"abc..2002@gmail.com", "Invalid"},{"abc.@gmail.com", "Invalid"},{"abc@abc@gmail.com", "Invalid"},
                {"abc@gmail.com.1a", "Invalid"},{"abc@gmail.com.aa.au", "Invalid"}});
    }

    @Test
    public void emaiTest() throws UserRegistrationException {
        try{
            Assert.assertEquals(expectedResult,upv.userEmailValidationUsualway(email));
        }catch (UserRegistrationException e){
            Assert.assertEquals(expectedResult,e.message);
        }
    }
}

