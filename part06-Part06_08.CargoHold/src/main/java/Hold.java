import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcaseArray;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcaseArray = new ArrayList<>();
    }

    public int totalWeight(){
        int totalWeight=0;
        for (Suitcase suitcase:suitcaseArray
             ) {
            totalWeight+= suitcase.totalWeight();
        }
        return  totalWeight;
    }

    public void addSuitcase(Suitcase suitcase){
        if(suitcase.totalWeight()+this.totalWeight()>maxWeight) return;
        this.suitcaseArray.add(suitcase);
    }

    public String toString(){
        return this.suitcaseArray.size()+" suitcases " + "("+this.totalWeight()+" kg)";
    }

    public void printItems(){
        for (Suitcase suitcase:suitcaseArray
             ) {
            suitcase.printItems();
        }
    }
}
