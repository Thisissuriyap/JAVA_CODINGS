import java.io.*;
class Exam
{
int a,b;
static int c;
void input()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a,b,c");
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
c=Integer.parseInt(br.readLine());
}
void output()
{
System.out.println(a+"\t"+b+"\t"+c);
}
static void display()
{
System.out.println(c);
}
}
class EMain
{
public static void main(String arg[])throws IOException
{
Exam e1=new Exam();
e1.input();
Exam e2=new Exam();
e2.input();
Exam e3=new Exam();
e3.input();
e1.output();
e2.output();
e3.output();
Exam.display();
}
}
