import java.util.*;
class program2b 
{
public static void main(String args[])
{
int a,b;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of a and b");
a = sc.nextInt();
b = sc.nextInt();
System.out.println("Before Swapp"+a+" "+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("After Swapp"+a+" "+b);
}
}