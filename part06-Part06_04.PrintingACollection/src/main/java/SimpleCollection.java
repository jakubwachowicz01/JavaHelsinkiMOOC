
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString(){
        if(elements.isEmpty()){
            return "The collection " + this.name + " is empty.";
        }
        String allElements = "";
        for (String element:elements
             ) {
            allElements = allElements + "\n" + element ;
        }
        String endphrase ="";
        if(this.elements.size()==1){
            endphrase = "The collection "+ this.name +" has 1 element:";
        }else{
            endphrase = "The collection " + this.name + " has " + this.elements.size() + " elements:";
        }
        return endphrase +allElements;
    }
}
