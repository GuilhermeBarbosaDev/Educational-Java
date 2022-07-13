package controllers;

import entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserController extends User {


    Scanner read = new Scanner(System.in);
    List<User> users = new ArrayList<>();
    User voUser = new User();
    String name;
    String address;

    int choice;




    public UserController(){

    System.out.println("Name please?");
        name = read.nextLine();
        System.out.println("Address please?");
        address = read.nextLine();


    voUser.setName(name);
    voUser.setAddress(address);


        users.add(voUser);

        System.out.println("Would like to check the registrys?");
        System.out.println("1-yes\n" + "2-no");
        choice = read.nextByte();
        switch (choice){
            case 1:
        userFilter();
        break;
            case 2:
        System.out.println("Thanks for your time!");
            System.exit(1);

        }
    }

    public void userFilter(){

        for(User user : users){
            System.out.println("Name: " + user.getName() + "\nAddress: " + user.getAddress());
        }

    }

    public static void main(String[] args) {
        new UserController();
    }

}
