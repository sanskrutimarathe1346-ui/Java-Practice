import java.util.*;

public class stringpract
{
    public static void main(String[] args)
    {
         
        Scanner sc=new Scanner(System.in);
       /* String nm=sc.nextLine();
        System.out.println("NAME="+nm); 

        System.out.println("enter size="); // Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
        int size=sc.nextInt();
        int total=0;
        String arr[]=new String[size];

        for(int i=0;i<size;i++)
        {
            arr[i]=sc.next();
            total+=arr[i].length();

        }
        System.out.println("length="+total); 

        System.out.println("enter string=");        //Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
        String nm=sc.nextLine();
        String result=nm.replace('e','i');
        System.out.println("Result="+result); 

        System.out.println("enter email=");       //Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
         String email=sc.nextLine();
         String username=" ";
         for(int i=0;i<email.length();i++)
         {
            if(email.charAt(i)=='@')
             break;
            else
            {
                username+=email.charAt(i);
            }
         }
         System.out.println("username="+username); */

         StringBuilder nm=new StringBuilder("Hello");      // reverse my logic
         /* 
         for(int i=nm.length()-1;i>=0;i--)
         {
            System.out.print(nm.charAt(i));
         }
         */
         
         for(int i=0;i<=nm.length()/2;i++)
         {
            int front=i;
            int back=(nm.length()-1-i);  // last char from backside
            char frontchar=nm.charAt(front);
            char backchar=nm.charAt(back);
            nm.setCharAt(front,frontchar);
            nm.setCharAt(back, backchar);
         }

         System.out.println(nm);








        
        



    }
}