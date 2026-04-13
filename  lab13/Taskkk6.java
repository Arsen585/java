import java.util.*;

public class Taskkk6 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "kiwi", "banana","watwermelon");

        list.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);
    }
}