class StringBufferDemo
{
    public static void main(String[] ar)
    {
        StringBuffer sb = new StringBuffer("Java");
        String str = new String("Java");

        System.out.println(str.equals("Java"));
        System.out.println(str.equals(sb.toString()));
        System.out.println(str.equals(new StringBufferDemo()));
        
        System.out.println(sb);
        sb.append(" session");
        System.out.println(sb);
        sb.insert(2,"welcome");
        System.out.println(sb);
        sb.delete(4,9);
        System.out.println(sb.reverse());

    }
}