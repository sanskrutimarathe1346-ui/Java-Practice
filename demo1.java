class CN
{
int real1,real2,img1,img2;

CN()
{
real1=5; img1=3;
real2=4; img2=2;
}

CN(int a,int b,int c,int d)
{
real1=a;
img1=b;
real2=c;
img2=d;
}
CN(CN c)
{
real1=c.real1;
img1=c.img1;
real2=c.real2;
img2=c.img2;
}
void show()
{
System.out.println("ADDITION=" +(real1+real2)+"+"+(img1+img2)+"i");
}

}
class demo1
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

