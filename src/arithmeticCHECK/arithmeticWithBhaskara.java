package arithmeticCHECK;

import java.util.Scanner;


public class arithmeticWithBhaskara {

    //For reading the entered user data
    Scanner read = new Scanner(System.in);

    //Declaration of variables
    int a, b, c;
    double delta, x1, x2;

    public arithmeticWithBhaskara() {
        deltaCalculation();
    }

    //
    private void deltaCalculation() {

        System.out.println("Enter the value of A, B and C respectively: ");
        a = Integer.parseInt(read.next());
        b = Integer.parseInt(read.next());
        c = Integer.parseInt(read.next());

        delta = (b * b) + (-4 * (a * c));

        System.out.println("Delta: " + delta);

        if (delta >= 0) {
            calculation();
        } else {
            System.out.println("Delta has no root(√)!");
            System.exit(0);
        }

    }

    private void calculation() {

        x1 = (double) ((-(b) + (delta)) / 2 * a);
        x2 = (double) ((-(b) - (delta)) / 2 * a);

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);

    }

    public static void main(String[] args) {
        new arithmeticWithBhaskara();
    }

}
