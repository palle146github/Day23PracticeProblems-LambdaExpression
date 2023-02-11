package com.bridgelabz.lambdaexpression.userregistration;

import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) throws UserRegistrationException {
        Scanner scanner = new Scanner(System.in);

        try {// validation first name in direct
            UserPatternValidation urv = new UserPatternValidation();
            System.out.println("Enter User First Name");
            String name = scanner.next();
            urv.userNameValidationUsualway(name);
        } catch (UserRegistrationException e) {
            System.out.println(e.message);
        }
        try {//validation using lambda expression
            UserPatternValidation urv = new UserPatternValidation();
            System.out.println("Enter User First Name");
            String name1 = scanner.next();
            urv.userNameLambdaValidation(name1);
        } catch (UserRegistrationException e) {
            System.out.println(e.message);
        }

        try {// validation first name in direct
            UserPatternValidation urv = new UserPatternValidation();
            System.out.println("Enter User Last Name");
            String name = scanner.next();
            urv.userEmailValidationUsualway(name);
        } catch (UserRegistrationException e) {
            System.out.println(e.message);
        }
        try {//validation using lambda expression
            UserPatternValidation urv = new UserPatternValidation();
            System.out.println("Enter User Last Name");
            String name1 = scanner.next();
            urv.userEmailLambdaValidation(name1);
        } catch (UserRegistrationException e) {
            System.out.println(e.message);
        }

        try {// validation first name in direct
            UserPatternValidation urv = new UserPatternValidation();
            System.out.println("Enter User Last Name");
            String name = scanner.next();
            urv.userEmailValidationUsualway(name);
        } catch (UserRegistrationException e) {
            System.out.println(e.message);
        }
        try {//validation using lambda expression
            UserPatternValidation urv = new UserPatternValidation();
            System.out.println("Enter User Last Name");
            String name1 = scanner.next();
            urv.userEmailValidationUsualway(name1);
        } catch (UserRegistrationException e) {
            System.out.println(e.message);
        }

        try {// validation first name in direct
            UserPatternValidation urv = new UserPatternValidation();
            System.out.println("Enter User Email");
            String name = scanner.next();
            urv.userEmailValidationUsualway(name);
        } catch (UserRegistrationException e) {
            System.out.println(e.message);
        }
        try {//validation using lambda expression
            UserPatternValidation urv = new UserPatternValidation();
            System.out.println("Enter User Email");
            String name1 = scanner.next();
            urv.userEmailLambdaValidation(name1);
        } catch (UserRegistrationException e) {
            System.out.println(e.message);
        }

        try {// validation first name in direct
            UserPatternValidation urv = new UserPatternValidation();
            System.out.println("Enter User Phone Number");
            String name = scanner.next();
            urv.userPhoneNumberValidationUsualway(name);
        } catch (UserRegistrationException e) {
            System.out.println(e.message);
        }
        try {//validation using lambda expression
            UserPatternValidation urv = new UserPatternValidation();
            System.out.println("Enter User Phone Number");
            String name1 = scanner.next();
            urv.userEmailLambdaValidation(name1);
        } catch (UserRegistrationException e) {
            System.out.println(e.message);
        }

        try {// validation first name in direct
            UserPatternValidation urv = new UserPatternValidation();
            System.out.println("Enter a Password");
            String name = scanner.next();
            urv.userPasswordValidationUsualway(name);
        } catch (UserRegistrationException e) {
            System.out.println(e.message);
        }
        try {//validation using lambda expression
            UserPatternValidation urv = new UserPatternValidation();
            System.out.println("Enter a Password");
            String name1 = scanner.next();
            urv.userPasswordLambdaValidation(name1);
        } catch (UserRegistrationException e) {
            System.out.println(e.message);
        }
    }
}

