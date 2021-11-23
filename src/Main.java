import java.util.Arrays;
import java.util.List;
import java.util.Map;
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
        System.out.println(Stream.of(2, 7, 5, 3, 8, 11, 9)
                .reduce(0, Integer::sum));

        System.out.println("sixth expression. ");
        System.out.println(Person.init()
                .stream()
                .allMatch(person -> person.getId()>0));
        System.out.println(Person.init()
                .stream()
                .anyMatch(person -> person.getId()>4));
        System.out.println(Person.init()
                .stream()
                .findFirst().get().getName());
        System.out.println(Person.init()
                .stream()
                .filter(person -> person.getId()>3)
                .findAny().get().getName());


        System.out.println("seventh expression. ");
        Map<String, Long>persons=Person.init()
                .stream()
                .collect(Collectors.groupingBy(person -> person.getName(),Collectors.counting()));

        System.out.println(persons);
        //{Alex=1, Mike=1, Tom=1, Jay=1, Sean=1, Lee=1, Jhon=1}
        Person.init()
                .stream()
                .collect(Collectors.groupingBy(person->person.getName().length()))
                .forEach((integer, people) -> System.out.println(integer+"=>"+people.stream()
                                .map(person -> person.getName())
                        .collect(Collectors.toList())));
        //Answers are below
//        3=>[Jay, Lee]
//        4=>[Sean, Jhon, Mike, Alex]
//        5=>[Tommy]

    }
}
