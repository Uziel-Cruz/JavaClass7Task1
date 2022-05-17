package com.company;

import java.util.Scanner;

public class Person {


    Scanner sr = new Scanner(System.in);
    String surnamecruz56329 , firstNamecruz56329 , streetcruz56329  , citycruz56329 ;
    int zipCodecruz56329 ;

    void Initialize(){
        System.out.println("Please enter your Name: ");
        firstNamecruz56329  = sr.nextLine();
        System.out.println("Please enter your Surname: ");
        surnamecruz56329  = sr.nextLine();
        System.out.println("Please enter your Street name: ");
        streetcruz56329  = sr.nextLine();
        System.out.println("Please enter your City: ");
        citycruz56329  = sr.nextLine();
        System.out.println("Please enter your Zip Code: ");
        zipCodecruz56329  = sr.nextInt();
    }

    void printData(){
        System.out.println("Name: "+ firstNamecruz56329 );
        System.out.println("Surname: "+ surnamecruz56329 );
        System.out.println("Street Name: "+ streetcruz56329 );
        System.out.println("City: "+ citycruz56329 );
        System.out.println("Zip Code: "+ zipCodecruz56329 );
    }

}


class Staff extends com.company.Person {
    String education , Position;
    void Initialize1(){
        Initialize();
        System.out.println("Enter your Education: ");
        education = sr.nextLine();
        System.out.println("Enter your Position");
        Position = sr.nextLine();
    }

    void Print1(){
        printData();
        System.out.println("Education: " + education);
        System.out.println("Position: "+ Position);
    }

}

class Main {
    public static void main(String[] args) {
        Staff employee = new Staff();
        employee.Initialize1();
        employee.Print1();
    }
}
