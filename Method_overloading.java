class Mover
{
int sum(int a,int b)
{
return(a+b);
}
float sum(float a,float b,float c)
{
return(a+b+c);
}
}
class MMain
{
public static void main(String arg[])
{

Mover a=new Mover();
System.out.println(a.sum(2.1f,3.1f,3.1f));
System.out.println(a.sum(10,20));
}
}
