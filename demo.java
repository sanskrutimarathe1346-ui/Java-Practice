class CN
{
int n1,n2,n3,n4;

CN()
{
n1=5; n2=3;
n3=4; n4=2;
}

CN(int a,int b,int c,int d)
{
n1=a;
n2=b;
n3=c;
n4=d;
}
CN(CN c)
{
n1=c.n1;
n2=c.n2;
n3=c.n3;
n4=c.n4;
}
void show()
{
System.out.println("ADDITION=" +(n1+n3)+"+"+(n2+n4)+"i");
}

}
class demo
{
public static void main(String args[])
{
CN c1=new CN();
CN c2=new CN(6,4,5,3);
CN c3=new CN(c1);
c1.show();
c2.show();
c3.show();
}
}

