package labsheet7.exercise4;

import java.util.Arrays;

public class Department {
    private String name;
    private Student[] students;

    Department(String name, Student[] students)
    {
        setName(name);
        setStudents(students);
        toString();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "\nName " + getName() + "\nStudents " + Arrays.toString(getStudents());
    }
}
