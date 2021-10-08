package labsheet7.exercise4;

public class TestCollegeApp {
    public static void main(String[] args) {

        Student student1 = new Student(154345,"Jake","Computing");
        Student student2 = new Student(234532, "Mary", "Creative Media");
        Student student3 = new Student(453726,"Tommy","Computing");
        Student student4 = new Student(623456, "Peter", "Creative Media");

        Student computingStudents[] = new Student[10];
        computingStudents[0] = student1;
        computingStudents[1] = student3;

        Student creativeMediaStudents[] = new Student[10];
        creativeMediaStudents[2] = student2;
        creativeMediaStudents[3] = student4;

        Department Computing = new Department("Computing", computingStudents);
        Department CreativeMedia = new Department("Creative Media", creativeMediaStudents);

        Department departments[] = new Department[5];
        departments[0] = Computing;
        departments[1] = CreativeMedia;

        Institute instutute = new Institute("IT Tralee", departments);


        System.out.print(instutute);



    }
}
