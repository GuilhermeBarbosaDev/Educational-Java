package switchCheck;

import java.util.Scanner;

public class switchFunnyReport {


    int options;

    Scanner read = new Scanner(System.in);
    public switchFunnyReport(){

        System.out.println("Your time to choose!");
        System.out.println("1-live forever\n2-live one month with your beloved");
        options = read.nextInt();
        switch (options){
            case 1:
                System.out.println("depression for eternity");
                    break;
            case 2:
                System.out.println("one month of limited happiness");
                    break;
        }
    }

    public static void main(String[] args) {
    new switchFunnyReport();
    }
}
