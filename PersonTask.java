class Person{
    public void speak(){
        System.out.println("The person is speaking");
    }
}
class Student extends Person{
    public void speak(){
        super.speak();
        System.out.println("The student is asking the question");
    }
}
class Internship extends Student{
    public void intern(){
        super.speak();
        System.out.println("The student got internship");
    }
}
class Teacher extends Person{
    public void speak(){
        System.out.println();
        super.speak();
        System.out.println("The teacher is giving a lecture");
    }
}

public class PersonTask {
    public static void main(String[] args) {
        Internship obj1=new Internship();
        obj1.intern();
        Teacher obj2=new Teacher();
        obj2.speak();
        
    }
}
