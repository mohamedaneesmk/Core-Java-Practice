import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Spring");
        list.add("Hibernate");

        list.forEach(System.out::println);
    }
}
