
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class CollectionsDemo {

    // 1. Create an ArrayList<Employee>
    public static void demoArrayList() {
        List<Employee> empArr = new ArrayList<>();
        // 1.a) Add 5 employees to the list.
        empArr.add(new Employee(1, "Ramesh", 34000, 25));
        empArr.add(new Employee(2, "Ravi", 56000, 45));
        empArr.add(new Employee(3, "Veer", 35000, 23));
        empArr.add(new Employee(4, "Prayag", 38000, 30));
        empArr.add(new Employee(5, "Jamaal", 38000, 31));
        System.out.println(" a)Employees added: " + empArr);

        // 1.b) Remove an employee by index.
        System.out.println(" b)Removing employee at index 4: " + empArr.get(4));
        empArr.remove(4);

        // 1.c) Sort employees by salary
        System.out.println(" c)Before sorting by salary: " + empArr);
        empArr.sort((a, b) -> {
            return a.getSalary().compareTo(b.getSalary());
        });
        System.out.println("   After sorting by salary(Asc): " + empArr);

        // 1.d) Find an employee with the highest salary.
        Employee maxSalaried = empArr.get(empArr.size() - 1);
        System.out.println(" d)Employee with highest salary: " + maxSalaried);

        // 1.e) Convert the list to a LinkedList<Employee>
        List<Employee> empLinkedList = new LinkedList<>(empArr);
        System.out.println(" e)LinkedList<Employee>: " + empLinkedList);
    }

    // 2. Create an LinkedList<Employee>
    public static void demoLinkedList() {
        // 2.a) Insert 10 employee names in a LinkedList.
        LinkedList<Employee> empLinkedList = new LinkedList<>();
        empLinkedList.add(new Employee(1, "Ramesh", 34000, 25));
        empLinkedList.add(new Employee(2, "Ravi", 56000, 45));
        empLinkedList.add(new Employee(3, "Veer", 35000, 23));
        empLinkedList.add(new Employee(4, "Prayag", 38000, 30));
        empLinkedList.add(new Employee(5, "Jamaal", 38000, 31));
        empLinkedList.add(new Employee(6, "John", 40000, 28));
        empLinkedList.add(new Employee(7, "Doe", 45000, 35));
        empLinkedList.add(new Employee(8, "Smith", 50000, 40));
        empLinkedList.add(new Employee(9, "Jane", 55000, 29));
        empLinkedList.add(new Employee(10, "Emily", 60000, 32));
        System.out.println(" a)Employees added: " + empLinkedList);

        // 2.b) Retrieve the 3rd employee in the list.
        System.out.println(" b)3rd Employee: " + empLinkedList.get(2));

        // 2.c) Replace an employee at index 2.
        empLinkedList.set(2, new Employee(120, "Priya", 48000, 24));
        System.out.println(" c)After replacement: " + empLinkedList.get(2));

        // 2.d) Remove an employee by name.
        String empNameToRemove = "Jane";
        System.out.println(" d)Before removing " + empNameToRemove + ": " + empLinkedList);
        empLinkedList.removeIf(emp -> emp.getName().equals(empNameToRemove));
        System.out.println("   After removing " + empNameToRemove + ": " + empLinkedList);
    }

    // 3. Create a HashSet<Employee> and do the following:
    public static void demoHashSet() {
        HashSet<Employee> empHashSet = new HashSet<>();

        // 3.a) Add 5 employees with different IDs.
        empHashSet.add(new Employee(1, "Ramesh", 34000, 25));
        empHashSet.add(new Employee(2, "Ravi", 56000, 45));
        empHashSet.add(new Employee(3, "Veer", 35000, 23));
        empHashSet.add(new Employee(4, "Prayag", 38000, 30));
        empHashSet.add(new Employee(5, "Jamaal", 38000, 31));
        System.out.println(" a)HashSet: " + empHashSet);

        // 3.b) Try adding a duplicate employee (same ID & name).
        Employee e = new Employee(1, "Ramesh", 34000, 25);
        System.out.println(" b)Trying to insert " + e + ":");
        empHashSet.add(e);

        // 3.c) Print all employees and check if duplicates exist.
        System.out.println(" c)No duplicates in HashSet: " + empHashSet);

        // 3.d) Check if a specific employee exists in the set.
        System.out.println(" d)Does " + e + " exist?: " + empHashSet.contains(e));
    }

    // 4. Create a HashMap<Integer, Employee> and do the following:
    public static void demoHashMap() {
        // 4.a) Add 5 employees using ID as the key.
        HashMap<Integer, Employee> empHashMap = new HashMap<>();
        empHashMap.put(1, new Employee(1, "Ramesh", 34000, 25));
        empHashMap.put(2, new Employee(2, "Ravi", 56000, 45));
        empHashMap.put(3, new Employee(3, "Veer", 35000, 23));
        empHashMap.put(4, new Employee(4, "Prayag", 38000, 30));
        empHashMap.put(5, new Employee(5, "Jamaal", 38000, 31));
        System.out.println(" a)HashMap: " + empHashMap);

        // 4.b) Retrieve an employee by ID.
        System.out.println(" b)Employee with ID 3: " + empHashMap.get(3));

        // 4.c) Remove an employee using their ID.
        System.out.println(" c)Removing employee with id 2:");
        empHashMap.remove(2);
        System.out.println("   HashMap: " + empHashMap);

        // 4.d) Print all employee details.
        System.out.println(" d)Employee details: ");
        System.out.println("ID  Name\tSalary\t\tAge");
        for (Employee emp : empHashMap.values()) {
            System.out.println(emp.getAllDetails());
        }
    }

    // 5. Use a Stack<Employee> to perform LIFO operations.
    public static void demoStack() {
        Stack<Employee> empStack = new Stack<>();

        // 5.a) Push 5 employees onto the stack.
        Employee e = new Employee(1, "Ramesh", 34000, 25);
        empStack.push(e);
        empStack.push(new Employee(2, "Ravi", 56000, 45));
        empStack.push(new Employee(3, "Veer", 35000, 23));
        empStack.push(new Employee(4, "Prayag", 38000, 30));
        empStack.push(new Employee(5, "Jamaal", 38000, 31));
        System.out.println(" a)Stack: " + empStack);

        // 5.b) Pop an employee from the stack (remove the last added employee).
        System.out.println(" b)Pop: " + empStack.pop());
        System.out.println("   Stack after pop: " + empStack);

        // 5.c) Peek at the top employee without removing it.
        System.out.println(" c)Peek at stack: " + empStack.peek());

        // 5.d) Search for an employee in the stack.
        System.out.println(" d)Position of " + e + " from top: " + empStack.search(e));

        // 5.e) Check if the stack is empty.
        System.out.println(" e)Is this stack empty: " + empStack.isEmpty());
    }
}
