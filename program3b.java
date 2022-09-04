import java.util.*;
class program4
{
    public static void main(String args[])
    {
    int a,b,c,l;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of a , b and c");
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();

    l = c>(a>b?a:b)?c:(a>b?a:b);
    System.out.println(l+"is the largest");
    }
}