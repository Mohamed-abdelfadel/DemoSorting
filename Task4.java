import java.util.*;

//TODO sort a Map DESC using Collections only
public class Task4 {
    public static void main(String[] args) {
        Map<Integer, String> names = new HashMap<>();
        names.put(1, "ahmed");
        names.put(2, "khaled");
        names.put(3, "hatem");

        List<Map.Entry<Integer, String>> listOfNames = new ArrayList<>(names.entrySet());

        Collections.sort(listOfNames, (o1, o2) -> o2.getKey().compareTo(o1.getKey()));
        System.out.println(listOfNames);
    }
//SUCCESS
}
