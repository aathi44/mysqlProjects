import java.io.*;
import java.util.*;
public class filejoel 
{
   
    public static void main(String args[])
    {
        File f=new File("Rolls.txt");
            if(!f.exists())
                System.out.println("Found not Found");
            else
                System.out.println("File Found");
        File f1=new File("Rolls1.txt");
            if(!f1.exists())
                System.out.println("Found not Found");
            else
                System.out.println("File Found");
        try
        {
            FileReader r=new FileReader(f);
            FileWriter w=new FileWriter(f1,true);

            byte c;
            while((c=(byte)r.read())!=-1)
            {
            
                System.out.println((char)c);
                w.write(c);	
            }
                r.close();
                w.close();
        }
            catch(IOException e)
            {

            }
    }
}

