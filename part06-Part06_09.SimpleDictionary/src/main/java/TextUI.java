import java.util.Scanner;

public class TextUI {
    private SimpleDictionary dictionary;
    private Scanner scanner;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.dictionary = dictionary;
        this.scanner = scanner;
    }

    public void start(){
        while(true){
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if(command.equals("end")){
                System.out.println("Bye Bye!");
                break;
            }else if(command.equals("add")){
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                this.dictionary.add(word, translation);
            } else if (command.equals("search")) {
                System.out.print("To be translated: ");
                String toBeT = scanner.nextLine();
                if(this.dictionary.translate(toBeT)==null){
                    System.out.println("Word " + toBeT + " was not found");
                }else{
                    System.out.println("Translation: "+this.dictionary.translate(toBeT));
                }


            } else{
                System.out.println("Unknown command");
            }


        }
    }
}
