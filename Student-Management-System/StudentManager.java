import java.util.ArrayList;

public class StudentManager {
    ArrayList<Student> students=new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);

    }
    public void listStudent(){
       for (Student s:students){
           System.out.println(s);
       }
    }
    public Student findStudentById(int id) {
        for (Student s:students){
            if (s.getId()==id){
                return s;
            }
        }
        return null;
    }
    public void deleteStudent(int id){
       students.removeIf(s -> s.getId()==id);
    }
    public double calculateAverage(){
        double total=0;
        for(Student s:students){
            total+=s.getGrade();
        }
        return students.size() == 0 ? 0 : total / students.size();
    }
}
