package Collections;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(Arrays.asList("Java", "Java", "Spring"));
        System.out.println(set);
    }
}
