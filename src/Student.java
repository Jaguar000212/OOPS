public class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

class II_Year extends Student {public
    String project;
    II_Year(String name, int rollNo, String project) {
        super(name, rollNo);
        this.project = project;
    }

    void displayDetails() {
        System.out.println("Name    : " + this.name);
        System.out.println("Roll No : " + this.rollNo);
        System.out.println("Project : " + this.project);
    }
}
