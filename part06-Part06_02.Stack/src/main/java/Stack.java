import java.util.ArrayList;

public class Stack {
    ArrayList<String> stackArray = new ArrayList<>();

    public Stack() {
        this.stackArray = stackArray;
    }

    public boolean isEmpty(){
        if(this.stackArray.isEmpty()) return true;
        return false;
    }

    public void add(String value){
        this.stackArray.add(value);
    }

    public ArrayList<String> values(){
        return this.stackArray;
    }

    public String take(){
        String removed = this.stackArray.get(this.stackArray.size()-1);
        this.stackArray.remove(this.stackArray.size()-1);
        return removed;
    }
}
