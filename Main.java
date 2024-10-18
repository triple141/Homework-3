import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        //savarjisho 1

//        int sum = 0;
//
//        for(int i=10; i<100; i+=5) //  i++    +    if(i % 5 == 0) { sum+=i }
//        {
//            sum += i;
//        }
//        System.out.println(sum);

        //savarjisho 2

//        int n = sc.nextInt();
//        int oper=0;
//        for(int i=n; i>0; i/=10)
//        {
//            oper++;
//        }
//        System.out.println(oper);


        //savarjisho 3


//        int n = sc.nextInt();
//        int oper = (int) Math.pow(n,0.5);
//        boolean check = true;
//        for(int i=2; i<=oper; i++)
//        {
//            if(n%i==0)
//            {
//                check = false;
//            }
//            if(check == false)
//            {
//                System.out.print("araa martivi");
//                break;
//            }
//        }
//        System.out.println("martivia");


        //savarjisho 4

//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int oper;
//        if(n<=m)
//        {
//            oper = n;
//        }
//        else
//        {
//            oper = m;
//        }
//        int memory = 1;
//        for(int i=2; i<=m; i++)
//        {
//            if(n%i==0 && m%i==0)
//            {
//                memory = i;
//            }
//        }
//        System.out.println(memory);

        //savarjisho 5

//        for(int i=100; i<=999; i++)
//        {
//            if(i % ((i / 100) + ((i - ((i / 100) * 100)) / 10)+(i%10))==0)// (i / 100)-aseulis cifri   ((i - ((i / 100) * 100)) / 10) - ateulis cifri  (i%10)-erteulis cifri
//            {
//                System.out.println(i);
//            }
//        }


        //savarjisho 6

//        int x = sc.nextInt();
//        int f1=0, f2=1;
//
//        for(int i=0; i<x; i++)
//        {
//            System.out.println(f1);
//
//            int next = f1+f2;
//            f1=f2;
//            f2=next;
//        }

        //bonus (-;

//        int height = sc.nextInt() , k = 0;
//
//        for (int i = 1; i<=height; ++i, k = 0) {
//            for (int space = 1; space <= height - i; ++space) {                 *
//                System.out.print("  ");                                       * * *
//            }                                                               * * * * *
//                                                                          * * * * * * *
//            while (k != 2 * i - 1) {                                    * * * * * * * * *
//                System.out.print("* ");                               * * * * * * * * * * *
//                ++k;                                                * * * * * * * * * * * * *
//            }                                                     * * * * * * * * * * * * * * *      for examle (height == 8)
//
//            System.out.println();
//        }
    }
}