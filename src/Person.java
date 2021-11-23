
import java.util.ArrayList;
import java.util.List;

public class Person {

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static List<Person> init(){
        List<Person> persons=new ArrayList<>();
        persons.add(new Person(1, "Sean"));
        persons.add(new Person(2, "Jay"));
        persons.add(new Person(3, "Lee"));
        persons.add(new Person(4, "Jhon"));
        persons.add(new Person(5, "Mike"));
        persons.add(new Person(6, "Tommy"));
        persons.add(new Person(7, "Alex"));

        return persons;
    }
}
