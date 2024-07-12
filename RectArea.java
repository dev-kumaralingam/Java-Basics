class Shape{
    public float getArea(float l,float b){
        return l*b;
    }
}
class rectangle extends Shape{
     public float getArea(float l,float b){
        System.out.println(super.getArea(10, 20));
        return l+b;
     }
}

public class RectArea {
    public static void main(String[] args) {
        rectangle obj=new rectangle();
        System.out.println(obj.getArea(10, 20));
        
        
    }
}
