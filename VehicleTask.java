class Vehicle{
    public void start(){
        System.out.println("vehicle started");
    }
}
class Car extends Vehicle{
    public void drive(){
        super.start();
        System.out.println("Car Driving");
    }
}
class SportsCar extends Car{
    
    public void drive(){
        super.drive();
        System.out.println("Sports Car Driving Fast");
    }
}

public class VehicleTask {
    public static void main(String[] args) {
    //   Vehicle obj1=new Vehicle();
    //   obj1.start();
    //   Car obj2=new Car();
    //   obj2.drive();
      SportsCar obj3=new SportsCar();
      obj3.drive();   
    }
}
