import java .net.*;
import java.util.*;
import java.io.*;
public class URLcon15
{
public static void main(String args[]) throws Exception
{
URL u2=new URL("http://www.msbte.org.in");
URLConnection uc=u2.openConnection();
System.out.println("Date="+new Date(uc.getDate()));
System.out.println("Content Type="+uc.getContentType());
System.out.println("Content length="+uc.getContentLength());
System.out.println("Content encoding="+uc.getContentEncoding());
URL u3=uc.getURL();
System.out.println("URL="+u3);
System.out.println("Content="+uc.getContent());
}
}