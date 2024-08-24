package Task1;

import java.util.Scanner;

public class Program4 {
    // CODE TO FIND THE GREATEST OF 3 NUMBERS

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in); //object creation for getting input through scanner class
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();
        // a,b,c are the three inputs

        if(a>b && a>c) // condition to check is a is greater than b,c
        {
            System.out.println("A GREATEST");
        }
        else if(b>a && b>c) // condition to check is a is greater than b,c
        {
            System.out.println("B GREATEST");
        }
        else
        {
            System.out.println("C GREATEST");
        }
    }


}