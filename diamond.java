class diamond
{
public static void main(String args[])
{
int i,j;
int n=5;
int sp=n-1;
for(i=0;i<n;i++)
{
for(j=0;j<sp;j++)
System.out.print("\n");

for(j=0;j<=i;j++)
{
System.out.print("*");
System.out.print("\n");
sp--;
}

}
sp=0;
for(i=n;i>0;i++)
{
for(j=0;j<sp;j++)

System.out.print(" ");

for(j=0;j<i;j++)
{System.out.print("*");}

System.out.print("\n");
sp++;
}
}
}