import java.util.Scanner;
public class g6 {
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0,s=0;
		while(i<n)
		{
			s=s+i;
			i++;
		}
		System.out.print(s);
	}

}
