import java.util.Scanner;
/**
 * Write a description of class Potato here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ojo
{
    public static void main (String[]args)
    {
        boolean b=true;
        String m="ojo";
        while(b)
        {
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            if(s.equals(m))
            {
                System.out.println("ojoooooooooo");
                b=false;
            }
            else {
                System.out.println("indique la palabra correcta");

            }
        }
    }

    public void ewe()
    {
        System.out.println("awa");
    }
}
