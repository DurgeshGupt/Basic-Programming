package basic;
import java.util.Scanner;
import java.time.*;

public class Basic {



    public static void swap() {

        int x, y, t;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        x = sc.nextInt();
        System.out.println("enter second number");
        y = sc.nextInt();

        System.out.println("before swapping number" + x +" "+ y);
        t = x;
        x = y;
        y = t;
        System.out.println("after swapping the numbers are"+ x +" "+ y);


    }
    static	void checkevenodd() {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int x = sc.nextInt();
        if(x % 2 == 0) {
            System.out.println("the number is even");
        }
        else
            System.out.println("the number is odd");
    }




    public static void main(String[] args) {
        System.out.println("1 : swapping number");
        System.out.println("2 : get even or odd");

        Scanner sc = new Scanner(System.in);

        int	option = sc.nextInt();

        switch(option) {

            case 1:
                swap();
            case 2:
                checkevenodd();

        }

    }




}

