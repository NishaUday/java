import java.util.Scanner;

public class g12 {
public static void main(String arr[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a=0,b=1,c,i;
System.out.println(a+" "+b);
for(i=0;i<n;i++)
{
c=a+b;
System.out.print(c);
System.out.println();
a=b;
b=c;
}		
		
	}

}
