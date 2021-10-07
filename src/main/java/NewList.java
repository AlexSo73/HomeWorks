import java.util.*;

public class NewList {
    public static void main(String[] args) {
        List<String> modificare = Arrays.asList("Roma", "Verona", "Parma", "Verona", "Milan", "Pisa",
                "Pisa", "Bergamo", "Torino", "Bari");
        System.out.println("Исходный список:");
        modificare.forEach(System.out::println);

        System.out.println("\nСводка:");
        Map<String, Integer> wordsCount = new HashMap<>();
        for (String s : modificare) {
            wordsCount.put(s, wordsCount.getOrDefault(s, 0) + 1);
        }
        wordsCount.entrySet().forEach(System.out::println);

        System.out.println("\nБез повторов: ");
        Set<String> unique = new HashSet<>(modificare);
        unique.forEach(System.out::println);

    }
}
