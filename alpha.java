import java.util.Scanner;
public class g3 {
public static void main(String a[])
{
	Scanner sc=new Scanner(System.in);
	char c=sc.next().charAt(0);
	if(Character.isLetter(c))
	{
		System.out.print("Alphabet");
	}
	else
	{
		System.out.print("not a alphabet");
	}
}
	}