import java.io.*;
class Time
{
int h,m,s;
void input()throws IOException
{                                    
bufferedReader=new BufferedReader(new InputStreamReader(Systemin));
h=Integer.parseInt(br.readLine());
m=Integer.parseInt(br.readLine());
s=Integer.parseInt(br.readLine());
}
void process(Time a,Time b)
{
h=a.h+b.h;
m=a.m+b.m;
s=a.s+b.s;
}
void output()
{
System.out.println(c.h+":"+c.m+":"+c.s);
}
}
class TMain
{
public static void main(String arg[])throws IOException
{
Time a=new Time();
Time b=new Time();
Time c=new Time();
a.input();
b.input();
c.process(a,b);
c.output();
}
}
                                                                   
                                  
