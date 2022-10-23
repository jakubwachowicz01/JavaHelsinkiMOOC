
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String firstInput = scanner.nextLine();
        System.out.println("What is their job?");
        String secondInput = scanner.nextLine();
        System.out.println("Here is the story:\n" +
                "Once upon a time there was " + firstInput + ", who was " + secondInput + ".\n" +
                "On the way to work, " + firstInput + " reflected on life.\n" +
                "Perhaps " + firstInput + " will not be " + secondInput + " forever.");
    }
}
