package com.company;

import java.util.Scanner;
import java.util.UUID;

public class Email {
    static Scanner in = new Scanner(System.in);

    private String firstName;
    private String lastName;

    private String password;
    private String department;

    private String email;


    //CONSTRUCTOR
    public Email() {

        this.department = setDepartment();

        this.password = setPassword();

        email = getName().toLowerCase() +
                "@" + department.toLowerCase() + getCompanyName().toLowerCase();
    }

    //ASK FOR THE DEPARTMENT METHOD
    private String setDepartment(){

        System.out.print("DEPARTMENTS:\n1-Sales\n2-Development\n3-Accounting\n0-None\n" +
                "Enter the department number: ");
        int departmentNumber = in.nextInt();
        in.nextLine();

       /* if (departmentNumber == 1){return "sales";}
        else if (departmentNumber == 2){return "development";}
        else if (departmentNumber == 3){return "accounting";}
        else {return  "";}*/

        switch (departmentNumber){
            case 0: return "nodepartment";

            case 1: return "sales";

            case 2: return "development";

            case 3: return "accounting";


            default: return "";
        }
    }

    //ASK FOR A NAME METHOD
    private String getName(){
        System.out.print("Please enter Your first name: ");
        firstName = in.nextLine();

        System.out.print("Please enter Your last name: ");
        lastName = in.nextLine();

        return firstName + "." + lastName;
    }

    //ASK FOR A COMPANY NAME METHOD
    private String getCompanyName(){
        System.out.print("Please enter a name of Your company: ");
        String companyName = in.nextLine();

        return "." + companyName + ".com";
    }

    //GENERATE RANDOM PASSWORD METHOD
    private String setPassword(){

        String passwordCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        int passwordLength = 8;
        char[]password = new char[passwordLength];

        for (int i=0; i<passwordLength; i++){
            int random = (int)(Math.random() * passwordCharacters.length());
            password[i] = passwordCharacters.charAt(random);
        }

        return new String(password);
        //return UUID.randomUUID().toString();

    }

    //CHANGE THE PASSWORD METHOD
    public void changePassword(String password){
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
    //SHOW INFO METHOD
    public String showInfo(){
        return toString();
    }
    //TO STRING
    @Override
    public String toString() {
        return "\ne-mail for: " +
                firstName + "," + lastName +
                "\ndepartment: " + department +
                "\ne-mail address: " + email +
                "\npassword: " + password;
    }
}
