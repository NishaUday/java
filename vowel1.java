import java.util.Scanner;
public class g16 {
	public static void main(String arr[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1=str.replaceAll("[aeiouAEIOU]"," ");
		System.out.print(str1);
	}

}
