
import java.util.Objects;

class Employee {

    private final Integer id;
    private final String name;
    private final Double salary;
    private final Integer age;

    Employee(int id, String name, double salary, int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" + this.id + "." + this.name + "}";
    }

    public Double getSalary() {
        return this.salary;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this.getClass() != o.getClass()) {
            return false;
        }
        Employee emp = (Employee) o;
        return this.id.equals(emp.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    public String getAllDetails() {
        return String.format("%d.  %s\t%.2f\t%d", this.id, this.name, this.salary, this.age);
    }
}
