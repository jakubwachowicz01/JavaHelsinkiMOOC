import java.util.Scanner;

public class UserInterface {
    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }

    public void start(){
        while(true){
            System.out.println("Commands:");
            System.out.println("1 - add a joke\n" +
                    "2 - draw a joke\n" +
                    "3 - list jokes\n" +
                    "X - stop");
            String choosenCommand = scanner.nextLine();
            if(choosenCommand.equals("1")){
                System.out.println("Write the joke to be added: ");
                String input = scanner.nextLine();
                this.jokeManager.addJoke(input);
            }else if(choosenCommand.equals("2")){
                System.out.println(this.jokeManager.drawJoke());
            } else if (choosenCommand.equals("3")) {
                this.jokeManager.printJokes();
            } else if (choosenCommand.equals("X")) {
                break;
            }
        }

    }


}
