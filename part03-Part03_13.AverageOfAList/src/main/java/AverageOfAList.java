
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        double sum=0;
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input==-1){
                break;
            }
            sum=sum+input;
            numbers.add(input);
        }
        System.out.println("Average: " + (1.0*sum/numbers.size()));
        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
    }
}
