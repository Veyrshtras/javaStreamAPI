import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> items= Arrays.asList(1,2,3,4,5,3,2,6);
        Stream sum=items.stream()
                .sorted()
                .collect(Collectors.groupingBy(integer -> integer>3)).values().stream();

        sum.forEach(integer -> System.out.println(integer));
    }
}
