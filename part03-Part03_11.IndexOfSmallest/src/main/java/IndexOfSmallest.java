
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input == 9999){
                break;
            }
            numbers.add(input);
        }
        int smallest = numbers.get(0);
        for(int i =1; i< numbers.size();i++){
            if(numbers.get(i)<smallest){
                smallest=numbers.get(i);
            }
        }
        System.out.println("Smallest number: "+smallest);
        for(int i =0; i< numbers.size();i++) {
            if (numbers.get(i) == smallest) {
                System.out.println("Found at index: " + i);
            }
        }
                // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        
    }
}
