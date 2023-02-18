import java.util.Scanner;

public class MainStudInfo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student stud = new Student("mark", "hatdog", "Santos", "BSIT", "Male", 202301);
        Student stud1 = new Student("Liza", "Cruz", "Santos"); 
        Student stud2 = new Student();
        System.out.println(stud.FirstName + " "+  stud.MiddleName + " " +  stud.LastName + " " + stud.Degree + " " + stud.Gender + " " + stud.StudentNo);
        System.out.println(stud1.FirstName);
        System.out.println(stud1.LastName);
        System.out.println(stud2.LastName);


      System.out.print ("Enter FirstName: ");
      String FName = sc.next();
    }
}