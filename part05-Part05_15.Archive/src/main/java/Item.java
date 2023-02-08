public class Item {
    String name;
    String identifier;

    public Item(String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
    }
    public String toString(){
        return this.identifier + ": " + this.name;
    }

    public boolean equals(Object compared){
        if(this==compared) return true;
        if(!(compared instanceof Item)) return false;

        Item itemCompared = (Item) compared;
        if(this.identifier.equals(itemCompared.identifier)){
            return true;
        }
        return false;
    }
}
