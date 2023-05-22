import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class Stream1 {
    public static void main(String args[]) {

        // Stream of fixed number of integers
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        stream.forEach(p -> System.out.println(p));

        // Stream from the array
        Stream<Integer> stream1 = Stream.of(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
        stream1.forEach(p -> System.out.print(p));

        // Creating stream from the list
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i < 10; i++) {
            list.add(i);
        }

        Stream<Integer> stream2 = list.stream();
        stream2.forEach(p -> System.out.println(p));

        // Stream of 20numbers with restriction
        Stream<Integer> randomNumbers = Stream
                .generate(() -> (new Random()).nextInt(100));

        randomNumbers.limit(20).forEach(System.out::println);

        // Stream of tokens
        IntStream stream3 = "12345_abcdefg".chars();
        stream3.forEach(p -> System.out.println(p));

        // OR

        Stream<String> stream4 = Stream.of("A$B$C".split("\\$"));
        stream4.forEach(p -> System.out.println(p));

        // Stream collection find all even numbers
        List<Integer> list1 = new ArrayList<Integer>();

        for (int i = 1; i < 10; i++) {
            list1.add(i);
        }

        Stream<Integer> stream5 = list1.stream();
        List<Integer> evenNumbersList = stream5.filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
        System.out.print(evenNumbersList);

        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        // The filter() method accepts a Predicate to filter all elements of the stream.
        // This operation is intermediate which enables us to call another stream
        // operation (e.g. forEach()) on the result.

        memberNames.stream().filter((s) -> s.startsWith("A"))
                .forEach(System.out::println);

        // The map() intermediate operation converts each element in the stream into
        // another object via the given function.

        memberNames.stream().filter((s) -> s.startsWith("A"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
