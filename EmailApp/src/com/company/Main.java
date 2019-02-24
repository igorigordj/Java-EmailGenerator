package com.company;

public class Main {

    public static void main(String[] args) {

       testMethod();
    }

    public static void testMethod(){
        Email employee1 = new Email();
        System.out.println(employee1.showInfo());

        //employee1.changePassword("newnewnew");

       /* System.out.println("\nPassword changed\nnew password: " +
               employee1.getPassword());*/
    }


}
