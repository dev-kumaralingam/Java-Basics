import java.util.*;
class ArrayListDemo
{
    public static void main(String[] args)
    {
        Stack stk = new Stack();
        stk.push(56);
        stk.push(563);
        stk.push(562);
        stk.push(561);
        System.out.println(stk);
        stk.pop();
        System.out.println(stk);
        System.out.println(stk.peek());
        LinkedList al = new LinkedList();
        System.out.println(al.size());//0
        al.add(78);
        al.add(78.90);
        al.add(true);
        al.add(new String());
        al.add(new Account());

        
        /*for(int i=0; i<al.size(); i++)
            System.out.println(al.get(i));*/

        for(Object temp:al)
        {
            System.out.println(temp);
        }
        al.remove(2);
        System.out.println(al);
    }
}