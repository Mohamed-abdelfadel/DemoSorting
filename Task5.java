import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//TODO sort employees according to salaries and return their names
public class Task5 {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setName("ahmed");
        employee1.setSalary(3000D);
        Employee employee2 = new Employee();
        employee2.setName("mohamed");
        employee2.setSalary(5000D);
        Employee employee3 = new Employee();
        employee3.setName("ali");
        employee3.setSalary(4000D);

        List<Employee> employees = Arrays.asList(employee1, employee2, employee3);
        List<String> sortedEmployees = employees
                .stream()
                .sorted((o1, o2) -> o1.getSalary().compareTo(o2.getSalary()))
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println(sortedEmployees);
    }
    //SUCCESS task5
}
