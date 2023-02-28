import java.util.ArrayList;

public class BirdBook {
    private ArrayList<Bird> birds;

    public BirdBook() {
        this.birds = new ArrayList<>();
    }

   public void addBird(Bird bird){
        this.birds.add(bird);
   }

   public void addObservations(String name){
        boolean found = false;
       for (Bird bird:birds
            ) {
           if(bird.getName().equals(name)){
               bird.addObservations();
               found = true;
           }
       }
       if(found==false){
           System.out.println("Not a bird!");
       }
   }

   public void printBirds(){
       for (Bird bird:birds
            ) {
           System.out.println(bird.getName() + " (" + bird.getLatinName() + "): " + bird.getObservations() + " observations");
       }
   }

   public void printOneBird(String name){
       for (Bird bird:birds
       ) {
           if(bird.getName().equals(name)){
               bird.printBird();
           }
       }
   }
}
