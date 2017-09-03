import java.util.Scanner;
public class g13 {
public static void main(String arr[])
{
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int a=0,n;
while(n1>0)
{
	n=n1%10;
	a=(a*10)+n;
	//System.out.print(a);
	n1=n1/10;
	
}
System.out.print(a);

	}

}
