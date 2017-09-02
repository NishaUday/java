import java.util.Scanner;
public class g4 {
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if((n%4==0)&&(n%100!=0))
	{
		System.out.print("leap year");
	}
else
	{
		System.out.print("not a leap year");
	}
      	}
}
