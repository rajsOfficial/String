import java.util.*;
public class StringRev
{
          /*  public static String reverseIt(String s)
            {
                        int i, n;
                        n = s.length();
                        StringBuffer d = new StringBuffer(n);
                        for (i = n - 1; i >= 0; i--)
                                    d.append(s.charAt(i));
                        return d.toString();
            }*/
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