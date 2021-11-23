import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // Java Stream API

        System.out.println("first expression. ");
        Person.init().forEach(person -> System.out.println(person.getName()));

        System.out.println("second expression.");
        Person.init()
                .stream()
                .filter(person -> person.getId()>3)
                .collect(Collectors.toList())
                .forEach(person -> {
                    System.out.println(person.getName());
                });
        System.out.println("third expression. ");
        Stream.of(23,5,34,12,7,9,27)
                .filter(integer -> integer>18)
                .map(integer -> Math.sqrt((double)integer))
                .collect(Collectors.toCollection(TreeSet::new))
                .forEach(aDouble -> System.out.println(aDouble));

        System.out.println("fourth expression. ");
        Person.init()
                .stream()
                .map(person -> person.getName())
                .sorted()
                .forEach(personName -> System.out.println(personName));

        System.out.println("fifth expression. ");

    }
}
