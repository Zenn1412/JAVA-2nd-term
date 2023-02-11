import java.util.Scanner;

 class Student{
   Student(){
    System.out.println("Student name: Jackson");
    System.out.println("Address:Pasig city");
    System.out.println("Age: 20");
   } 

   public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
 
    Student a =new Student();
    System.out.println("");
    Student2 b =new Student2();
    System.out.println("");
    Student3 c =new Student3();
    System.out.println("");
    Student4 d =new Student4();
    System.out.println("");
    Student5 e =new Student5();
    
    System.out.print("Student name: ");
        String name1 = scan.next();
    System.out.print("Address: ");
    String address1 = scan.next();
    System.out.print("age: ");
    String age1 = scan.next();
    System.out.println(name1 + " " +  address1 +" " + age1);
    
  
    System.out.print("Student name: ");
        String name2 = scan.next();
    System.out.print("Address: ");
    String address2 = scan.next();
    System.out.print("age: ");
    String age2 = scan.next();
    System.out.println(name2 + " " +  address2 +" " + age2);
    }
    
   }
 
 class Student2{
 Student2(){
    
    System.out.println("Student name: john");
    System.out.println("Address:mandaluyong");
    System.out.println("Age: 21");
 }
}
class Student3{
    Student3(){
      
       System.out.println("Student name: Mark ");
       System.out.println("Address: Metro Manila");
       System.out.println("Age: 22");
    }
   }
   class Student4{
    Student4(){
       
       System.out.println("Student name: Liza ");
       System.out.println("Address: Cavite city");
       System.out.println("Age: 32");
    }
   }
   class Student5{
    Student5(){
       System.out.print(" ");
       System.out.println("Student name: Angel ");
       System.out.println("Address: Cavite City");
       System.out.println("Age: 35");
    }
   }

   

