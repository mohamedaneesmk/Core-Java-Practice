package Collections;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Anees");
        map.put(102, "Developer");

        map.forEach((id, name) -> System.out.println(id + " -> " + name));
    }
}
