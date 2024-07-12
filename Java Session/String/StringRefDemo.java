class StringRefDemo
{
    public static void main(String[] args)
    {
        String str = "Java";
        String str2 = "Java";
        String str1 = new String("Java");
        String str3 = new String("Java");

        if(str3 == str1)
            System.out.println("Same");
        else
            System.out.println("Not Same");
        /*
        if(str == str1)
            System.out.println("Same");
        else
            System.out.println("Not Same");
        
        if(str == str2)
            System.out.println("Same");
        else
            System.out.println("Not Same");*/
    }
}