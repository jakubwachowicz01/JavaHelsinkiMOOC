
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scan.nextLine());

        if(value<5000){
            System.out.println("No tax");
        }else if(value<=25000){
            System.out.println("Tax: " + (100 + (double)(value-5000)*0.08));
        }else if(value<=55000){
            System.out.println("Tax: " + (1700 + (double)(value-25000)*0.1));
        }else if(value<=200000){
            System.out.println("Tax: " + (4700 + (double)(value-55000)*0.12));
        }else if(value<=1000000){
            System.out.println("Tax: " + (22100 + (double)(value-200000)*0.15));
        }else if(value>1000000){
            System.out.println("Tax: " + (142100 + (double)(value-1000000)*0.17));
        }

    }
}
