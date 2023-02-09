import java.util.ArrayList;

public class Room {
    ArrayList<Person> personArray = new ArrayList<>();

    public Room() {
        this.personArray = personArray;
    }

    public void add(Person person){
        this.personArray.add(person);
    }
    public boolean isEmpty(){
        if(this.personArray.isEmpty()) return true;
        return false;
    }

    public ArrayList<Person> getPersons(){
        return this.personArray;
    }

    public Person shortest(){
        if(this.isEmpty()) return null;
        Person shortest = this.personArray.get(0);
        for (Person person:personArray
             ) {
            if(person.getHeight()<shortest.getHeight()){
                shortest = person;
            }
        }
        return shortest;
    }

    public Person take(){
        if(this.isEmpty()) return null;
        Person shortest = this.shortest();
        this.personArray.remove(shortest);
        return shortest;
    }
}
