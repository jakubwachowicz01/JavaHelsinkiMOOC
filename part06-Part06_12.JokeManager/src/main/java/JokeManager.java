import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class JokeManager {

    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke){
        this.jokes.add(joke);
    }
    public String drawJoke(){
        if(this.jokes.isEmpty()) return "Jokes are in short supply.";
        int random = ThreadLocalRandom.current().nextInt(0,jokes.size());
        return this.jokes.get(random);
    }

    public void printJokes(){
        for (String joke:jokes
             ) {
            System.out.println(joke);
        }
    }
}
