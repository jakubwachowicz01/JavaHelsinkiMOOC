import java.util.ArrayList;

public class RecipeBook {
    ArrayList<Recipe> recipes;

    public RecipeBook() {
        this.recipes = new ArrayList<>();
    }

    public void addRecipe(String name, int time, ArrayList<String> ingredients){
        recipes.add(new Recipe(name,time,ingredients));
    }

    public void list(){
        System.out.println();
        System.out.println("Recipes: ");
        for (Recipe recipe:recipes
             ) {
            System.out.println(recipe.toString());
        }
        System.out.println();
    }

    public void getRecipesUnderTime(int time){
        System.out.println();
        for (Recipe recipe:recipes
             ) {
            if(recipe.getCookingTime()<=time){
                System.out.println(recipe);
            }
        }
    }

    public void findIngredient(String ingredient){
        for (Recipe recipe:recipes
             ) {
            if(recipe.ingredients().contains(ingredient)){
                System.out.println(recipe);
            }
        }
    }
    public void getRecipe(String name){
        System.out.println();
        System.out.println("Recipes: ");
        for (Recipe recipe:recipes
             ) {
            if(recipe.getName().contains(name)){
                System.out.println(recipe.toString());
                System.out.println();
            }
        }
    }
}
