import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        List<Integer> items= Arrays.asList(1,2,3,4,5,3,2,6);
//        Stream sum=items.stream().
//                distinct();
//
//        sum.forEach(integer -> System.out.println(integer));

        List<Person> persons = Person.person();
        persons.add(new Person(1,"Sean"));
        persons.add(new Person(2,"John"));
        persons.add(new Person(3,"Lea"));

        persons.stream()
                .map(Person::getName)
                .collect(Collectors.toCollection(TreeSet::new))
                .forEach(person -> System.out.println(person));
    }
}
