package Task1;

import java.util.Scanner;

public class Program3 {
    // CODE TO PRINT THE REVERSE OF A NUMBER

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("PLEASE ENTER NUMBER");
        int a = obj.nextInt();
        // getting an input
        while (a>0)
        {
            int d = a%10; // this % operator is used to get the reminder
            System.out.print(d);
            a=a/10; // // this / operator is used to get the quotient
        }
    }
}
