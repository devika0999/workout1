import java.util.*;
public class program5 
{
public static void main(String args[])
{
int a,b,i;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of starting and ending intervals ");
a = sc.nextInt();
b = sc.nextInt();

for(i=a; i<b; i++)
{
int x=0,rem,t;
t=i;

while(t!=0)
{
rem=t%10;
x=x+(rem*rem*rem);
t=t/10;
}
if(x==i)
System.out.println(i+"is an amstrong num");

}
}
}