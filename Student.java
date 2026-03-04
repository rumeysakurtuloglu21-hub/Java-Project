public class Student {
    private String name;
    private int id;
    private double grade;

    public Student(double grade, int id, String name) {
        this.grade = grade;
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
     return "ID: " + id + " | Name: " + name + " | Grade: " + grade;
    }

}
