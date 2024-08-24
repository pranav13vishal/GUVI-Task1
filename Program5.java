package Task1;

import java.util.Scanner;

public class Program5 {
    // CODE TO CALCULATE THE FINAL PAY AFTER DISCOUNT

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("PLEASE ENTER YOUR PURCHASE AMOUNT");
        double purchase_amount = obj.nextDouble();
        double final_pay=0;
        double discount = 0; ;
        if(purchase_amount <500)
        {
            System.out.println("NO DISCOUNT");
            discount = 0;
            final_pay = final_pay ;
            System.out.println("TOTAL PAYMENT AFTER DISCOUNT : "+final_pay);

        }
        else if(purchase_amount >=500 && purchase_amount <=1000)
        {
            discount = (10*purchase_amount)/100; // CALCULATE THE DISCOUNT AMOUNT
            System.out.println("10 % DISCOUNT");
            final_pay = purchase_amount - discount; // SUBTRACT THE DISCOUNTED AMOUNT FROM PURCHASE AMOUNT
            System.out.println("TOTAL PAYMENT AFTER DISCOUNT : "+final_pay);

        }
        else if(purchase_amount >1000 )
        {
            discount = (20*purchase_amount)/100;
            System.out.println("20 % DISCOUNT");
            final_pay = purchase_amount - discount;
            System.out.printf("TOTAL PAYMENT AFTER DISCOUNT : %.2f",final_pay);

        }
    }


}