package Task1;

import java.util.Scanner;

public class Program2 {
    // CODE TO FIND IF A NUMBER IS POSITIVE OR NEGATIVE

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        if(a>0) // condition to check for positive number
        {
            System.out.println("POSITIVE NUMBER");
        }
        else
        {
            System.out.println("NEGATIVE NUMBER");
        }
    }


}