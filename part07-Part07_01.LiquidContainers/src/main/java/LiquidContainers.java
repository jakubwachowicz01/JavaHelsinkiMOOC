
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer=0;
        int secondContainer=0;

        while (true) {
            System.out.println("First: "+firstContainer+"/"+"100");
            System.out.println("Second: "+secondContainer+"/"+"100");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[]parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            if(amount<0){continue;}
            if(command.equals("add")){
                if(firstContainer+amount>100){
                    firstContainer=100;
                }else{
                    firstContainer+=amount;
                }
            }else if(command.equals("move")){
                if(firstContainer<amount){
                    if(secondContainer+amount>100){
                        secondContainer=100;
                    }else{
                        secondContainer+=firstContainer;
                    }
                    firstContainer=0;
                }else{
                    firstContainer-=amount;
                    if(secondContainer+amount>100){
                        secondContainer=100;
                    }else{
                        secondContainer+=amount;
                    }
                }
            }else if(command.equals("remove")){
                if(secondContainer-amount<0){
                    secondContainer=0;
                }else{
                    secondContainer-=amount;
                }
            }

        }
    }

}
