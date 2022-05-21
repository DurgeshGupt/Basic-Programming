package basic;
import java.util.Scanner;

public class Basic{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("largest among three number");

        System.out.println("Enter first number");
        int a = sc.nextInt();

        System.out.println("Enter Second number");
        int b = sc.nextInt();

        System.out.println("enter third number");
        int c = sc.nextInt();

        int temp = (a > b) ? a : b;

        int largest = (temp > c) ? temp : c;

        System.out.println("The largest number is " + largest);


    }
}
