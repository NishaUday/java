import java.util.Scanner;
public class greater {
	public static void main(String arr[])
	{
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		int g=(n2>(n>n2?n:n1)?n2:(n>n1?n:n1));
	    System.out.print(g);
	}

}
