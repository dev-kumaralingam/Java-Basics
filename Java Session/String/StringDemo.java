class StringDemo
{
    public static void main(String[] arg)
    {
        String str = "Java";
        String str1 = new String("Java");
        
        System.out.println(str);
        str = "Session";
        String str2 = "Session";
        System.out.println(str);
        str = str.toUpperCase();
        System.out.println(str);

    }
}