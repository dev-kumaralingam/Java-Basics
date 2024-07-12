class Demo
{
    int x;
    static int y;
    private Demo()
    {
        
    }
    public static void getDetails()
    {
        //System.out.println("Printing value "+x);
    }
}
class StaticDemo
{
    public static final void main(String[] args)
    {
        int xz = Integer.parseInt(args[0]);
        //Demo.getDetails();
        System.out.println("Y: "+ Demo.y);
        //System.out.println("X: "+ Demo.x);
        Demo obj1 = new Demo();
        System.out.println("X: "+ ++obj1.x);
        
        Demo obj2 = new Demo();
        System.out.println("X: "+ ++obj2.x);
        
        System.out.println("Y: "+ ++obj1.y);
        System.out.println("Y: "+ ++obj2.y);
 
   }
}