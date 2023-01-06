
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        int ammount=0;
        String name ="";
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")) break;
            String[] pieces = input.split(",");
            sum += Integer.valueOf(pieces[1]);
            if(pieces[0].length()>name.length()){
                name = pieces[0];
            }
            ammount++;
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + 1.0*sum/ammount);

    }
}
