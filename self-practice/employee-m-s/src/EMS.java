import java.util.*;
import java.util.stream.Collectors;

public class EMS {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        System.out.println(employeeList);

//      Query 3.1 : How many male and female employees are there in the organization?
        Map<String, Long> genderCount = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println("Count by gender: " + genderCount);

//      Query 3.2 : Print the name of all departments in the organization?
        List<String> departments = employeeList.stream().map(Employee::getDepartment).distinct().toList();
        System.out.println("Departments: " + departments);

//      Query 3.3 : What is the average age of male and female employees?
        Map<String, Double> avgAges = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println("Average age by gender: " + avgAges);

//      Query 3.4 : Get the details of highest paid employee in the organization?
        Optional<Employee> maxSalaried = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        System.out.println("Highest salaried: " + maxSalaried);

//      Query 3.5 : Get the names of all employees who have joined after 2015?
        List<String> joinedLater = employeeList.stream().filter(e -> e.getYearOfJoining() > 2015).map(Employee::getName).toList();
        System.out.println("Employees joined after 2015: " + joinedLater);

//      Query 3.6 : Count the number of employees in each department?
        Map<String, Long> empsByDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println("Employees by department: " + empsByDept);

//      Query 3.7 : What is the average salary of each department?
        Map<String, Double> avgEmpSalaryByDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("Average salary by dept: " + avgEmpSalaryByDept);

//      Query 3.8 : Get the details of youngest male employee in the product development department?
        Optional<Employee> youngInPD = employeeList.stream().filter(e -> e.getDepartment().equals("Product Development") && e.getGender().equals("Male")).min(Comparator.comparing(Employee::getAge));
        System.out.println("Youngest male in Product Dev.: " + youngInPD);

//      Query 3.9 : Who has the most working experience in the organization?
        Optional<Employee> experienced = employeeList.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining)));
        Optional<Employee> seniorMostEmployeeWrapper = employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
        System.out.println("Most experience emp: " + experienced);

//      Query 3.10 : How many male and female employees are there in the sales and marketing team?
        Map<String, Long> genderWiseInSalesMarketing =
                employeeList.stream()
                        .filter(e -> e.getDepartment() == "Sales And Marketing")
                        .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(genderWiseInSalesMarketing);

//      Query 3.11 : What is the average salary of male and female employees?
        Map<String, Double> avgSalaryByGender =
                employeeList.stream()
                        .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgSalaryByGender);

//      Query 3.12 : List down the names of all employees in each department?
        Map<String,List<String>> grpByEmployee=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(Employee::getName,Collectors.toList())));
        System.out.println(grpByEmployee);

//      Query 3.13 : What is the average salary and total salary of the whole organization?
        DoubleSummaryStatistics stats=employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("Average salary: "+stats.getAverage()+", Total salary: "+stats.getSum());

//      Query 3.14 : Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
        Map<Boolean,List<Employee>> splitEmpByAge=employeeList.stream().collect(Collectors.partitioningBy(e->e.getAge()<=25));
        System.out.println("Employees less or equal 25: "+splitEmpByAge);

//      Query 3.15 : Who is the oldest employee in the organization? What is his age and which department he belongs to?
        Optional<Employee> oldestEmployeeWrapper = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
        Employee oldestEmployee = oldestEmployeeWrapper.get();
        System.out.println("Oldest employee: "+oldestEmployee.getName()+", age="+oldestEmployee.getAge()+", department="+oldestEmployee.getDepartment());
    }
}
