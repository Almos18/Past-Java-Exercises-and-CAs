package labsheet7.exercise3;

import java.util.Arrays;

public class Institute {
    private String name;
    private Department[] departments = new Department[5];

    public Institute(String name, Department[] departments) {
        setName(name);
        setDepartments(departments);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    /*public int getTotalStudents()
    {
        return id;
    }*/

    @Override
    public String toString() {
        return "\nName: " + getName() + "\nDepartments: " + Arrays.toString(getDepartments());
    }
}
