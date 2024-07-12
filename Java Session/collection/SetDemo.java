import java.util.*;
class SetDemo
{
    public static void main(String[] args)
    {
        //Set set = new HashSet();
        //Set set = new LinkedHashSet();
        Set set = new TreeSet();
        set.add(58);
        set.add(56);
        set.add(56);
        set.add(16);
        set.add(25);
        
        Set set1 = new TreeSet();
        set1.add(new Account());
        set1.add(new Account());
        set1.add(new Account());
        System.out.println(set1);
    }
}