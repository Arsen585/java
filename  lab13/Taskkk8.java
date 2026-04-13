import java.util.*;

public class Taskkk8 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "kiwi", "banana");

        list.stream()
                .filter(s -> s.length() > 5)
                .forEach(System.out::println);
    }
}