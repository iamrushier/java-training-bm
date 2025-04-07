
class InvalidMarksException extends Exception {

    InvalidMarksException(String message) {
        super(message);
    }
}

class Student {

    String name;
    int marks;
    char grade;

    Student(String name) {
        this.name = name;
    }

    public void setMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Invalid marks");
        }
        setGrade();

    }

    private void setGrade() {
        if (this.marks >= 90) {
            this.grade = 'A';
        }
        if (this.marks >= 75) {
            this.grade = 'B';
        }
        if (this.marks >= 60) {
            this.grade = 'C';
        }
        if (this.marks < 60) {
            this.grade = 'D';
        }
    }
}

public class Test {

    public static void main(String[] args) {

        Student s1 = new Student("A");
        Student s2 = new Student("B");
        Student s3 = new Student("C");
        try {
            s1.setMarks(30);
        } catch (Exception e) {
            System.out.println("Failed 1");
        }
        try {
            s1.setMarks(80);
        } catch (Exception e) {
            System.out.println("Failed 2");
        }
        try {
            s3.setMarks(110);
        } catch (Exception e) {
            System.out.println("Failed 3" + e);
        }
    }
}
