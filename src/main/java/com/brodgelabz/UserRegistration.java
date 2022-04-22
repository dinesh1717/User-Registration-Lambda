package com.brodgelabz;
import java.util.regex.Pattern;


interface Validation {
    String validate(String regex, String userDetails);

    public class UserRegistration {

        public static void main(String[] args) {
            System.out.println("Welcome to lambda user-registation program");

            Validation isValidFirstName = (pattern, firstName) -> {
                return "First Name is " + Pattern.compile(pattern).matcher(firstName).matches();
            };
            System.out.println(isValidFirstName.validate("^[A-Z]{1}[a-z]{2,}$", "Sagar"));
            Validation isValidLastName = (pattern, lastName) -> {
                return "Last Name is " + Pattern.compile(pattern).matcher(lastName).matches();
            };
            System.out.println(isValidLastName.validate("^[A-Z]{1}[a-z]{2,}$", "Nangare"));


        }

    }
}


