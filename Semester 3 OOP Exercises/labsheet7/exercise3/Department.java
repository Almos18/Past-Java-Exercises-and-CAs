package labsheet7.exercise3;

import java.util.Arrays;

public class Department {
    private String name;
    private Student[] students = new Student[10];

    public Department(String name, Student[] students)
    {
        setName(name);
        setStudents(students);
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
        return "\nName: " + getName() + "\nStudents: " + Arrays.toString(students);
    }
}
