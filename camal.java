import java.util.Scanner;
public class srt20 {
	public static void main(String arr[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String res=" ";
		char first=str.charAt(0);
		res=res+Character.toUpperCase(first);
		for(int i=1;i<str.length();i++)
		{
		char curr=str.charAt(i);
		char pre=str.charAt(i-1);
		if(pre==' ')
		{
			res=res+Character.toUpperCase(curr);
		}
		else
		{
			res=res+curr;
		}
	}
		System.out.print(res);
	}
}
