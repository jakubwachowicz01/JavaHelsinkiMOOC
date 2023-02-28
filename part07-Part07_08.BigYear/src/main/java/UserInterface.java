import java.util.Scanner;

public class UserInterface {
    private BirdBook birdBook;
    private Scanner scanner;

    public UserInterface(BirdBook birdBook, Scanner scanner) {
        this.birdBook = birdBook;
        this.scanner = scanner;
    }

    public void start(){
        while(true){
            System.out.print("? ");
            String input = scanner.nextLine();
            if(input.equals("Quit")){
                break;
            }else if(input.equals("Add")){
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scanner.nextLine();
                this.birdBook.addBird(new Bird(name,latinName));
            }else if(input.equals("Observation")){
                System.out.print("Bird? ");
                String bird = scanner.nextLine();
                this.birdBook.addObservations(bird);
            }else if(input.equals("All")){
                birdBook.printBirds();
            }else if(input.equals("One")){
                System.out.print("Bird? ");
                String bird = scanner.nextLine();
                birdBook.printOneBird(bird);
            }
        }
    }


}
