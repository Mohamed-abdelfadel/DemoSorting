import java.util.*;

public class DemoSorting {

    //TODO make a list of numbers sorted by 2 ways
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 75, 2, 3, 14, 6, 7, 23);
        System.out.println("Main list = " + numbers);
        System.out.println("**************using streams**************");
        List<Integer> sortedNumbers = numbers.stream().sorted((o1, o2) -> o1.compareTo(o2)).toList();
        System.out.println("New list = " + sortedNumbers);
        System.out.println("Main list as it's = " + numbers);
        //SUCCESS first way

        System.out.println("**************using collection**************");
        Collections.sort(numbers,(o1, o2) -> o1.compareTo(o2));
        System.out.println("Main list changed and now it's = " + numbers );
        System.out.println("List is mutable so we should keep in mind that the list could be changed after initializing.");
        //SUCCESS second way

    }

}
