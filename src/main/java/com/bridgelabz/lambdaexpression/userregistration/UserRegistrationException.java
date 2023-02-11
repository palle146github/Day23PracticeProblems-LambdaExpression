package com.bridgelabz.lambdaexpression.userregistration;

public class UserRegistrationException extends Throwable{
    public String message;

    public UserRegistrationException(String message) {
        this.message = message;
    }
}
