import java.util.Scanner;
interface Academic{
    void storeAcademicDetails();
    void displayAcademicDetails();
}
interface Sports{
    void storeSportsDetails();
    void displaySportsDetails();
}
class Student implements Academic, Sports{
    String name;
    int rollno;
    float percentage;
    String sportname;
    Scanner sc = new Scanner(System.in);

    public void storeAcademicDetails(){
        System.out.print("Enter Student Name : ");
        name = sc.nextLine();
        System.out.print("Enter Roll No : ");
        rollno = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Academic Percentage : ");
        percentage = sc.nextFloat();
        sc.nextLine();
    }
    public void displayAcademicDetails(){
        System.out.println("\n===== ACADEMIC DETAILS ======");
        System.out.println("Student Name :" +name);
        System.out.println("Roll No : " +rollno);
        System.out.println("Academic Percentage : " +percentage+ "%");
    }
    public void storeSportsDetails(){
        System.out.print("Enter Sport Name : ");
        sportname = sc.nextLine(); 
    }
    public void displaySportsDetails(){
        System.out.println("\n===== SPORTS DETAILS ======");
        System.out.println("Sport Name : " +sportname);
    }
}
public class StudentInfo{
    public static void main(String[] args){
        Student s = new Student();

        s.storeAcademicDetails();
        s.storeSportsDetails();

        System.out.println("\n ===== COMBINE STUDENT DETAILS =====");
        s.displayAcademicDetails();
        s.displaySportsDetails();
    }
}