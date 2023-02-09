import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> itemsArray;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.itemsArray = new ArrayList<>();
        this.maxWeight = maxWeight;

    }

    public void addItem(Item item){
        if(this.totalWeight()+item.getWeight()>maxWeight) return;
        this.itemsArray.add(item);
    }

    public String toString(){
        if(this.itemsArray.size()==0){
            return "no items (0 kg)";
        }
        if(this.itemsArray.size()==1){
            return this.itemsArray.size() + " item (" + this.totalWeight() + " kg)";
        }
        return this.itemsArray.size() + " items (" + this.totalWeight() + " kg)";
    }

    public void printItems(){
        for (Item item:itemsArray
             ) {
            System.out.println(item.toString());
        }
    }
    public int totalWeight(){
        int weight =0;
        for (Item item:itemsArray
             ) {
            weight+=item.getWeight();
        }
        return weight;
    }

    public Item heaviestItem(){
        if(this.itemsArray.isEmpty()) return null;

        Item heaviest = this.itemsArray.get(0);
        for (Item item:itemsArray
             ) {
            if(item.getWeight()> heaviest.getWeight()){
                heaviest = item;
            }
        }
        return heaviest;
    }

}
