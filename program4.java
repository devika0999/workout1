import java.util.*;
class program4
{
public static void main(String args[])
{
int a,rev=0,t;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of a ");
a = sc.nextInt();
while(a!=0)
{
t=a%10;
a=a/10;
rev=rev*10+t;

}
System.out.println("reverse ="+rev);
}
}