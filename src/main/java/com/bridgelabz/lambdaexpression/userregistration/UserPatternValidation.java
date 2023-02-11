package com.bridgelabz.lambdaexpression.userregistration;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserPatternValidation {

    final String USER_NAME_REGEX = "^[A-Z][a-z]{2,}$";
    final String USER_LAST_NAME = "^[A-Z][a-z]{2,}$";
    final String EMAIL = "^[a-z0-9]{1,}[_+-.]?[a-z0-9]*[^_+-.][@]([a-z0-9])+([.][a-z]{2,})(.[a-z]{2,3})?$";
    final String PHONE_NUMBER = "^[1-9]{2}[ ][1-9][0-9]{9}$";
    final String PASSWORD = "(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*(),.?\":{}|<>])(?!.*[!@#$%^&*(),.?\":{}|<>]{2,})([A-Za-z0-9!@#$%^&*(),.?\":{}|<>]{8,})$";

//normal way to validate username
     public String userNameValidationUsualway(String userName) throws UserRegistrationException {
        try{
            Pattern p = Pattern.compile(USER_NAME_REGEX);
            Matcher m = p.matcher(userName);
            if(m.matches()){
                return "Valid";
            }
            else{
                throw new UserRegistrationException("Invalid");
            }
        }catch(UserRegistrationException e){
            throw new UserRegistrationException(e.message);
            }
    }
    // Lambda expression to validate user name
    public String userNameLambdaValidation(String userName) throws UserRegistrationException {
        try{

            Predicate<String> isValidUserName = name -> name.matches(USER_NAME_REGEX);
            if( isValidUserName.test(userName)){
                return "Valid";
            }
            else{
                throw new UserRegistrationException("Invalid");
            }
        }catch(UserRegistrationException e){
            throw new UserRegistrationException(e.message);
        }
    }


    public String userLastNameValidationUsualway(String userName) throws UserRegistrationException {
        try{
            Pattern p = Pattern.compile(USER_LAST_NAME);
            Matcher m = p.matcher(userName);
            if(m.matches()){
                return "Valid";
            }
            else{
                throw new UserRegistrationException("Invalid");
            }
        }catch(UserRegistrationException e){
            throw new UserRegistrationException(e.message);
        }
    }
    // Lambda expression to validate user name
    public String userLastNameLambdaValidation(String userName) throws UserRegistrationException {
        try{

            Predicate<String> isValidUserName = name -> name.matches(USER_LAST_NAME);
            if( isValidUserName.test(userName)){
                return "Valid";
            }
            else{
                throw new UserRegistrationException("Invalid");
            }
        }catch(UserRegistrationException e){
            throw new UserRegistrationException(e.message);
        }
    }


    public String userEmailValidationUsualway(String userName) throws UserRegistrationException {
        try{
            Pattern p = Pattern.compile(EMAIL);
            Matcher m = p.matcher(userName);
            if(m.matches()){
                return "Valid";
            }
            else{
                throw new UserRegistrationException("Invalid");
            }
        }catch(UserRegistrationException e){
            throw new UserRegistrationException(e.message);
        }
    }
    // Lambda expression to validate user name
    public String userEmailLambdaValidation(String userName) throws UserRegistrationException {
        try{

            Predicate<String> isValidUserName = name -> name.matches(EMAIL);
            if( isValidUserName.test(userName)){
                return "Valid";
            }
            else{
                throw new UserRegistrationException("Invalid");
            }
        }catch(UserRegistrationException e){
            throw new UserRegistrationException(e.message);
        }
    }

    public String userPhoneNumberValidationUsualway(String userName) throws UserRegistrationException {
        try{
            Pattern p = Pattern.compile(PHONE_NUMBER);
            Matcher m = p.matcher(userName);
            if(m.matches()){
                return "Valid";
            }
            else{
                throw new UserRegistrationException("Invalid");
            }
        }catch(UserRegistrationException e){
            throw new UserRegistrationException(e.message);
        }
    }
    // Lambda expression to validate user name
    public String userPhoneNumberLambdaValidation(String userName) throws UserRegistrationException {
        try{

            Predicate<String> isValidUserName = name -> name.matches(PHONE_NUMBER);
            if( isValidUserName.test(userName)){
                return "Valid";
            }
            else{
                throw new UserRegistrationException("Invalid");
            }
        }catch(UserRegistrationException e){
            throw new UserRegistrationException(e.message);
        }
    }


    public String userPasswordValidationUsualway(String userName) throws UserRegistrationException {
        try{
            Pattern p = Pattern.compile(PASSWORD);
            Matcher m = p.matcher(userName);
            if(m.matches()){
                return "Valid";
            }
            else{
                throw new UserRegistrationException("Invalid");
            }
        }catch(UserRegistrationException e){
            throw new UserRegistrationException(e.message);
        }
    }
    // Lambda expression to validate user name
    public String userPasswordLambdaValidation(String userName) throws UserRegistrationException {
        try{

            Predicate<String> isValidUserName = name -> name.matches(PASSWORD);
            if( isValidUserName.test(userName)){
                return "Valid";
            }
            else{
                throw new UserRegistrationException("Invalid");
            }
        }catch(UserRegistrationException e){
            throw new UserRegistrationException(e.message);
        }
    }




}
