public class Student {
   String FirstName, MiddleName, LastName; 
   String Degree, Gender;
   int StudentNo;

  Student(String FirstName, String MiddleName, String LastName, String Degree, String Gender, int StudentNo)
 {
    this.FirstName = FirstName;
    this.MiddleName = MiddleName;
    this.LastName = LastName;
    this.Degree = Degree;
    this.Gender = Gender;
    this.StudentNo = StudentNo;

 }

 Student (String FirstName, String MiddleName, String LastName)
{
    this.FirstName = FirstName;
    this.MiddleName = MiddleName;
    this.LastName = LastName;
    Degree = "N/A";
    Gender = "N/A";
    StudentNo = 0;
}

Student() {
    FirstName = "N/A";
    MiddleName = "Nl/A";
    LastName = "N/A";
    Degree = "N/A";
    Gender = "N/A";
    StudentNo = 0;
}

}

