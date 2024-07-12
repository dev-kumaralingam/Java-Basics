import java.util.*;
import java.io.*;
class CompileTimeExcep
{
    public static void main(String[] args)throws FileNotFoundException, IOException
    {
        try
        {
            throw new FileNotFoundException();
            
        }
        catch(FileNotFoundException f)
        {
            System.out.println(f);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
            System.out.println("bypassed exception");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
    }
}