
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        BirdBook birdBook = new BirdBook();
        UserInterface UI = new UserInterface(birdBook, scan);
        UI.start();
    }

}
