
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public boolean equals(Object compared){
        if(this == compared) return true;

        Person personCompared = (Person) compared;
        if(this.name.equals(personCompared.name)&&
                this.height== personCompared.height&&
                this.weight== personCompared.weight&&
                this.birthday.getDay()==personCompared.birthday.getDay()&&
                this.birthday.getYear()==personCompared.birthday.getYear()&&
                this.birthday.getMonth()==personCompared.birthday.getMonth()
        ){
            return true;
        }else{
            return false;
        }
    }
    // implement an equals method here for checking the equality of objects
}
