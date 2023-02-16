import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start(){
        while(true){
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if(command.equals("stop")){
                break;
            }else if(command.equals("add")){
                System.out.print("To add: ");
                String add = scanner.nextLine();
                this.list.add(add);
            }else if(command.equals("list")){
                this.list.print();
            }else if(command.equals("remove")){
                System.out.println("Which one is removed? ");
                int id = Integer.valueOf(scanner.nextLine());
                this.list.remove(id);
            }

        }
    }
}
