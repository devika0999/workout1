import java.util.*;
class program2a 
{
public static void main(String args[])
{
int a,b,t;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of a and b");
a = sc.nextInt();
b = sc.nextInt();
System.out.println("Before Swapp"+a+" "+b);
t=a;
a=b;
b=t;
System.out.println("After Swapp"+a+" "+b);
}
}