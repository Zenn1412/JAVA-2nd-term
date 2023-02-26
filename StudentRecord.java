import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentRecord {
    private String studentNo;
    private String degree;
    private int yearLevel;
    private String firstName;
    private String middleName;
    private String lastName;
    private char gender;
    private double prelimGrade;
    private double midtermGrade;
    private double finalGrade;

    public StudentRecord(String studentNo, String degree, int yearLevel,
                         String firstName, String middleName, String lastName,
                         char gender, double prelimGrade, double midtermGrade, double finalGrade) {
        this.studentNo = studentNo;
        this.degree = degree;
        this.yearLevel = yearLevel;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender;
        this.prelimGrade = prelimGrade;
        this.midtermGrade = midtermGrade;
        this.finalGrade = finalGrade;
    }

    public double getFinalTermGrade() {
        return (prelimGrade + midtermGrade + finalGrade) / 3;
    }

    public String toString() {
        return studentNo + "," + degree + "," + yearLevel + "," + firstName + ","
                + middleName + "," + lastName + "," + gender + "," + prelimGrade + ","
                + midtermGrade + "," + finalGrade;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean continueInput = true;
        while (continueInput) {
            try {
                System.out.print("Enter student number: ");
                String studentNo = input.nextLine();

                System.out.print("Enter degree: ");
                String degree = input.nextLine();

                System.out.print("Enter year level: ");
                int yearLevel = Integer.parseInt(input.nextLine());

                System.out.print("Enter first name: ");
                String firstName = input.nextLine();

                System.out.print("Enter middle name: ");
                String middleName = input.nextLine();

                System.out.print("Enter last name: ");
                String lastName = input.nextLine();

                System.out.print("Enter gender (M/F): ");
                char gender = input.nextLine().charAt(0);

                System.out.print("Enter prelim grade: ");
                double prelimGrade = Double.parseDouble(input.nextLine());

                System.out.print("Enter midterm grade: ");
                double midtermGrade = Double.parseDouble(input.nextLine());

                System.out.print("Enter final grade: ");
                double finalGrade = Double.parseDouble(input.nextLine());

                StudentRecord studentRecord = new StudentRecord(studentNo, degree, yearLevel, firstName,
                        middleName, lastName, gender, prelimGrade, midtermGrade, finalGrade);

                String fileName = "studentRec2.txt";
                File file = new File(fileName);

                if (file.createNewFile()) {
                    System.out.println("File created: " + file.getName());
                } else {
                    System.out.println("File already exists.");
                }

                FileWriter writer = new FileWriter(fileName, true);
                writer.write(studentRecord.toString() + "\n");
                writer.write("the Final term grade is: " + studentRecord.getFinalTermGrade() + "\n");
                writer.close();

                System.out.println("Final term grade: " + studentRecord.getFinalTermGrade());

                System.out.print("Press Q to quit, C to continue: ");
                String choice = input.nextLine();
                if (choice.equalsIgnoreCase("Q")) {
                    continueInput = false;
                }
            } catch (IOException | NumberFormatException e) {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }
}
