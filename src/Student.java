public class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        try {
            if (name == null || name.isEmpty()) {
                throw new Exception("Name cannot be empty");
            }
            if (rollNo <= 0) {
                throw new NoNegativeException("Roll No cannot be less than or equal to 0");
            }
            this.name = name;
            this.rollNo = rollNo;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void speak(){
        System.out.println("Hello");
        return;
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
