package basic;
import java.util.Scanner;
import java.time.*;

public class Basic {

    static String flipcoin() {

        double a = Math.random();

        if(a< 0.5) {
            return"tails";
        }else
            return"head";
    }

    static void primefactor(){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 2; i< n; i++) {
            while(n % i == 0) {
                System.out.println(i + " ");
                n = n/i;
            }
            if(n > 2) {
                System.out.println(n);
            }
        }


    }



    public static void main(String[] args)
    {

        System.out.println("1 for print head and tails");
        System.out.println("2 for factorial");


        Scanner option = new Scanner(System.in);

        int a = option.nextInt();

        switch(a)
        {
            case 1:

                Basic t = new Basic();
                int heads = 0;
                int tails = 0;
                int chances = 10;
                for(int i = 1; i<=chances; i++) {
                    if(t.flipcoin().equals("tails")) {
                        tails++;
                    } else
                        heads++;

                }
                System.out.println("Chances "+ chances);
                System.out.println("heads " + heads);
                System.out.println("tails : "+ tails);


                float  percentage_head = heads*(100/chances);
                System.out.println("heads " + percentage_head+ "%");

                float percentage_tails = tails*(100/chances);
                System.out.println("tails " + percentage_tails+ "%");
                break;


            case 2:
                System.out.println("enter the number");
                primefactor();


        }
    }


    // TODO Auto-generated method stub

}

