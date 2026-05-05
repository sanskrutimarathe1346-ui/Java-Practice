class animal
{
void move()
{
System.out.println("Animal class");
}
}

class dog extends animal
{
void move()
{
super.move();
System.out.println("dog class");
}
}

class things
{
public static void main(String args[])
{
dog d=new dog();
d.move();
}
}