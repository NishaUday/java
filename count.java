import java.util.Scanner;
public class g7 {
	public static void main(String arr[])
	{
		Scanner sc=new Scanner (System.in);
		int n1,a=0,c=0;
		int n=sc.nextInt();
		while(n>0)
		{
			n1=n%10;
			a=(a*10)+n1;
			//System.out.print(a);
			n=n/10;
			c++;
		}
		System.out.println(c);
		System.out.println(a);
		
	}

}