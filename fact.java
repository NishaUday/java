import java.util.Scanner;
public class g9 {
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
int i,fact=1;
int n1=sc.nextInt();
for(i=1;i<=n1;i++)
{
fact=fact*i;
}
System.out.print(fact);
}
}
