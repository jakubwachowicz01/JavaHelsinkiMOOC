
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;

    private RecipeBook recipeBook;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.recipeBook = new RecipeBook();
    }

    public void start(){
        System.out.print("File to read: ");
        String filePath = scanner.nextLine();
        readFile(filePath);
        System.out.println();
        while(true){
            System.out.print("Commands: \nlist - lists the recipes\nstop - stops the program\nfind name - searches recipes by name\nfind cooking time - searches recipes by cooking time\nfind ingredient - searches recipes by ingredient\n\nEnter command: ");
            String command = scanner.nextLine();
            if(command.equals("list")){
                recipeBook.list();
            }else if(command.equals("stop")) {
                break;
            }else if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String name = scanner.nextLine();
                recipeBook.getRecipe(name);
            }else if(command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxCookingTime = Integer.valueOf(scanner.nextLine());
                System.out.println("Recipes: ");
                recipeBook.getRecipesUnderTime(maxCookingTime);
                System.out.println();
            }else if (command.equals("find ingredient")) {
                System.out.print("Ingredient:: ");
                String ingredient = scanner.nextLine();
                System.out.println();
                System.out.println("Recipes: ");
                recipeBook.findIngredient(ingredient);
                System.out.println();
            }
        }
    }


    public void readFile(String filePath){
        try(Scanner fileScanner = new Scanner(Paths.get(filePath))){
            while(fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                if(line.equals("")) continue;
                String name = line;
                int time = Integer.valueOf(fileScanner.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();

                while(fileScanner.hasNextLine()){
                    String ingredient = fileScanner.nextLine();
                    if(ingredient.isEmpty()) break;
                    ingredients.add(ingredient);
                }
                recipeBook.addRecipe(name,time,ingredients);
            }
        }catch (Exception e) {
            System.out.println(e);
        }
    }

}
