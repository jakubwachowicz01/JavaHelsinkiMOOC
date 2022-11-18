
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.valueOf(scanner.nextLine());
        double pow = Math.pow((double)number,2) ;
        System.out.println(pow);
    }
}
