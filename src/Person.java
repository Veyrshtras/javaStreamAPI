import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Person {
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private int id;
    private String name;
    public static List<Person> person(){
        return new ArrayList<>();
    }
}
