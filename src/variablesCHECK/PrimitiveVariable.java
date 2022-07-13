package variablesCHECK;

import java.util.Scanner;

public class PrimitiveVariable {

    //For reading the entered user data
    Scanner read = new Scanner(System.in);

    //Declaration of variables
    String name;
    String address;
    Double salary;


    public PrimitiveVariable(){

        System.out.println("Type your name please ;)");
        name = read.nextLine();
        System.out.println("Type your address plase <:)");
        address = read.nextLine();
        System.out.println("how much you have in your pockets :)?");
        salary = read.nextDouble();

                String report = "My name is " + name + ", and i live in " + address +
                " confirming that i received the salary of " + salary;

        System.out.println(report);
    }

    //Method that launches the application
    public static void main(String[] args) {

        new PrimitiveVariable();
    }
}
