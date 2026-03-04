import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();

        while (true) {
            System.out.println("\n1- Add Student ");
            System.out.println("2- List student ");
            System.out.println("3-Find student ");
            System.out.println("4-Delete student ");
            System.out.println("5-Average grade ");
            System.out.println("0-exit");


            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Grade: ");
                    double grade = scanner.nextDouble();
                    studentManager.addStudent(new Student(grade, id, name));
                    break;
                case 2:
                    studentManager.listStudent();
                    break;
                case 3:
                    System.out.print("Enter ID: ");
                    int searchId = scanner.nextInt();
                    Student found = studentManager.findStudentById(searchId);
                    if (found != null)
                        System.out.println(found);
                    else
                        System.out.println("Student not found!");
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    int deleteId = scanner.nextInt();
                    studentManager.deleteStudent(deleteId);
                    break;

                case 5:
                    System.out.println("Average: " + studentManager.calculateAverage());
                    break;

                case 0:
                    System.exit(0);


            }


        }

    }
}