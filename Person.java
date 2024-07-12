import java.util.*;
public class Person {
    int rollno;
    String name;
    String dept;
    
    Person(int rollno,String name, String dept){
    this.rollno=rollno;
    this.name=name;
    this.dept=dept;
    }

    public void PersonDetails(){
        System.out.println(rollno);
        System.out.println(name);
        System.out.println(dept);
    }





    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int rollno;
    String name;
    String dept;
    Person obj=new Person(rollno = sc.nextInt(),name=sc.nextLine(),dept=sc.nextLine());
    obj.PersonDetails();

    }
}
