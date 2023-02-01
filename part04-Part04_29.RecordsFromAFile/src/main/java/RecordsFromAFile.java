
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file?");
        String input = scanner.nextLine();
        try(Scanner fileScanner = new Scanner(Paths.get(input))){
            while(fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                System.out.print(parts[0] + ", age: " + parts[1]);
                if(Integer.valueOf(parts[1])==1){
                    System.out.println(" year");
                }else if(Integer.valueOf(parts[1])>1 || Integer.valueOf(parts[1])==0){
                    System.out.println(" years");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
