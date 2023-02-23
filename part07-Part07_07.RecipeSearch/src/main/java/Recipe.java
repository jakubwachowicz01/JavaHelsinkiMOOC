import java.util.ArrayList;

public class Recipe {
    private String name;
    private Integer cookingTime;
    private ArrayList<String> ingredients;

    public Recipe(String name, Integer cookingTime, ArrayList<String> ingredients) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }

    public String getName(){
        return this.name;
    }

    public int getCookingTime(){
        return this.cookingTime;
    }

    public ArrayList<String> ingredients(){
        return this.ingredients;
    }

    public String toString(){
        return this.name + ", cooking time: " + this.cookingTime;
    }
}
