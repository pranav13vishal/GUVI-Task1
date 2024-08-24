package Task1;

public class Program1 {
    // CODE TO PRINT IN FOR/WHILE LOOP

    public static void main(String[] args) {
        System.out.println("FOR LOOP");
        for (int i = 10; i <= 50; i++) { // loop runs from 10 to 50 and prints
            System.out.print(i+" ");
        }
        System.out.println("\nWHILE LOOP");
        int n=10;
        while (n>=10 && n<=50)
        {
            System.out.print(n+" ");
            n++; // to increment the n value
        }

    }
}