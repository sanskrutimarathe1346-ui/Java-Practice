import java.net.*;
import java.io.*;
import java.util.*;
public class inet14
{
public static void main(String args[])
{
try
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Host name=");
String st=sc.next();
InetAddress ip=InetAddress.getByName(st);
System.out.println("Host name="+ip.getHostName());
System.out.println("IP address="+ip.getHostAddress());
}
catch(Exception e)
{
System.out.println(e);
}
}
}