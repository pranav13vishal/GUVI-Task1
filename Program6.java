package Task1;

import java.util.Scanner;

public class Program6 {
    // CODE TO PRINT THE GIVEN CODE

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("PLEASE ENTER THE NUMBER");
        int a = obj.nextInt();
        for (int i = a; i >= 1; i--) {  //  DETERMINE THE NO OF ROWS
            for (int j = a; j >= 1; j--) { // DETERMINE THE NO OF COLUMNS
                if (j < i) {  // CONDITION FOR PRINTING IN THE ORDER
                    System.out.print(i);
                } else {
                    System.out.print(j);
                }
            }
            System.out.println(); // FOR PRINTING NEW ROW
        }
    }
}