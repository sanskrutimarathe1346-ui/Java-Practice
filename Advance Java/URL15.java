import java.net.*;
public class URL15
{
public static void main(String args[]) throws MalformedURLException
{
URL u1=new URL("http://www.msbte.org.in");
System.out.println("Host="+u1.getHost());
System.out.println("Protocal="+u1.getProtocol());
System.out.println("Port="+u1.getPort());
System.out.println("File="+u1.getFile());
System.out.println("Authority="+u1.getAuthority());
}
}