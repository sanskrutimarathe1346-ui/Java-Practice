import java.util.*;
class vctr
{
public static void main(String args[])
{
Vector v1=new Vector();
v1.addElement(28);
v1.addElement("PCP");
v1.addElement("SY");
v1.addElement("CO");
v1.addElement(72);
System.out.println(" "+v1);
System.out.println(v1.firstElement());
System.out.println(v1.lastElement());
System.out.println(v1.elementAt(2));
System.out.println(v1.size());
System.out.println(v1.capacity());
v1.removeElementAt(2);
System.out.println(" "+v1);
v1.insertElementAt("SY",2);
System.out.println(" "+v1);
System.out.println(v1.contains("SAN"));
}
}