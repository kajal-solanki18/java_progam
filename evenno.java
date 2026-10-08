import java.io.FileWriter;
import  java.io.IOException;
public  class evenno 
{
    public  static  void  main (String args[])
    {
        try
        {
            FileWriter fw = new FileWriter ("even_numbers.txt");
            for (int i = 1;i<=20;i++)
            {
                if (i%2==0)
                {
                    fw.write(Integer.toString(i)+"\n");
                }   
            } 
            System.out.println("successfully wrote even numbers to file");
            fw.close();  
        }
        catch (IOException e)
        {
            System.out.println ("An error occurred while writing to the file.");
            System.out.println(e);
        }
    }
}