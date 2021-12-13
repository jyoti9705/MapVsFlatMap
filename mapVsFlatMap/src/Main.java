import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> citiesForEmployee1 = new ArrayList<>();
        citiesForEmployee1.add("Mumbai");
        citiesForEmployee1.add("Kerala");
        citiesForEmployee1.add("Pune");
        citiesForEmployee1.add("Bangalore");
        Employee employee1 = new Employee(1, "Jyoti", citiesForEmployee1);
        List<String> citiesForEmployee2 = new ArrayList<>();
        citiesForEmployee2.add("Mumbai");
        citiesForEmployee2.add("Chennai");
        citiesForEmployee2.add("Pune");
        citiesForEmployee2.add("Kolkata");
        Employee employee2 = new Employee(2, "Gaurav", citiesForEmployee2);
        List<String> citiesForEmployee3 = new ArrayList<>();
        citiesForEmployee3.add("Mumbai");
        citiesForEmployee3.add("Pune");
        citiesForEmployee3.add("Hyderabad");
        Employee employee3 = new Employee(3, "Kavya", citiesForEmployee3);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        System.out.println("Employee List : " + employeeList.toString());

        //Stream.map
        List<Integer> employeeIdsList = employeeList.stream().map(employee -> employee.getId()).collect(Collectors.toList());
        System.out.println("Employee ids list with map  : " + employeeIdsList);

        //Stream.flatMap
        // Below operation when executes with Map will return List of  cities list which may also have values that are repetitively present in the List
        //Also it will return you List of list with cities list and not a single list
        List<List<String>> citiesList = employeeList.stream().map(employee -> employee.getCities()).collect(Collectors.toList());
        System.out.println("Cities list for each employees with Map  : " + citiesList.toString());

        //if we want only single list to return values and  to perform operation on the list of cities inside list we can make use of Flat Map
        //Once we get single list from flat map we can also collect it to set to have only unique values
        List<String> citiesListFlatMap = employeeList.stream().flatMap(employee -> employee.getCities().stream()).collect(Collectors.toList());
        System.out.println("Cities list using Flat Map for each employees :  " + citiesListFlatMap);

    }
}
