class rect
{
int len,bre;
 
rect()
{
len=6;
bre=5;
}

rect(int l,int b)
{
len=l;
bre=b;
}

rect(rect r)
{
len=r.len;
bre=r.bre;
}

void area()
{
System.out.println("AREA="+(len*bre));
}

}

class rectarea
{
public static void main(String args[])
{
rect r1=new rect();
rect r2=new rect(7,10);
rect r3=new rect(r2);
r1.area();
r2.area();
r3.area();
}
}


