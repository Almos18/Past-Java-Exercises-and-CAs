package labsheet7.exercise4;

import java.util.Arrays;

public class Institute {
    private String name;
    private Department[] departments;

    Institute(String name, Department[] departments)
    {
        setName(name);
        setDepartments(departments);
        toString();
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

    @Override
    public String toString() {
        return "\nInstitute " + getName() + "\nDepartments " + Arrays.toString(getDepartments());
    }
}
