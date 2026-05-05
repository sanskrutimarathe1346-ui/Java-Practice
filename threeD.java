class threeD
{
public static void main(String args[])
{
int TD[][][]=new int[3][3][3];
int i,j,k;
for(i=0;i<3;i++)
for(j=0;j<3;j++)
for(k=0;k<3;k++)

TD[i][j][k]=i*j*k;

for(i=0;i<3;i++){
for(j=0;j<3;j++){
for(k=0;k<3;k++)
{
System.out.println(TD[i][j][k]);
}
System.out.println();
}
System.out.println();
}
}
}

