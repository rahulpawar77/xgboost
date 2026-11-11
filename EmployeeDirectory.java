import java.util.*;

class Employee {
    int id;
    String name;
    String department;

    // Constructor
    Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Display employee details
    public String toString() {
        return id + " " + name + " " + department;
    }
}

public class EmployeeDirectory {
    public static void main(String[] args) {

        // Using ArrayList
        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Amit", "IT"));
        list.add(new Employee(102, "Sneha", "HR"));
        list.add(new Employee(103, "Rahul", "Sales"));

        System.out.println("Employees using ArrayList:");

        // Using Iterator
        Iterator<Employee> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Using HashSet
        HashSet<String> departments = new HashSet<>();

        departments.add("IT");
        departments.add("HR");
        departments.add("Sales");

        System.out.println("\nDepartments using HashSet:");

        for (String dept : departments) {
            System.out.println(dept);
        }

        // Using HashMap
        HashMap<Integer, Employee> map = new HashMap<>();

        for (Employee e : list) {
            map.put(e.id, e);
        }

        System.out.println("\nEmployee details using HashMap:");
        System.out.println(map.get(102));

        // Adding a new employee
        Employee newEmp = new Employee(104, "Sneha", "Finance");

        list.add(newEmp);
        map.put(newEmp.id, newEmp);

        System.out.println("\nUpdated Employee List:");

        Iterator<Employee> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Display employee count
        System.out.println("\nTotal Employee Count: " + list.size());

        // Display employee using ID
        System.out.println("\nEmployee with ID 104:");
        System.out.println(map.get(104));
    }
}