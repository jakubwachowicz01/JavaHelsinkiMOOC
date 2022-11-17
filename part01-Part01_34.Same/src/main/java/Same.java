
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String first = String.valueOf(scan.nextLine());
        System.out.println("Enter the second string:");
        String second = String.valueOf(scan.nextLine());

        if(first.equals(second)){
            System.out.println("Same");
        }else{
            System.out.println("Different");
        }
    }
}
