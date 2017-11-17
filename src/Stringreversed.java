import java.util.*;
public class Stringreversed
{
            public static void main (String args[])
            {
            			Scanner s= new Scanner(System.in);
                        String p= new String();   
                        p=s.nextLine();
                        String q=new StringBuffer(p).reverse().toString();
                        System.out.println("Original String is "+p);
                        System.out.println("Reversed String is "+q);
            }
}