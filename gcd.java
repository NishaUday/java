import java.math.BigInteger;
import java.util.Scanner;


public class g10 {
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
	  BigInteger b1=sc.nextBigInteger();
	  BigInteger b2=sc.nextBigInteger();
	  BigInteger c;
	  c=b1.gcd(b2);
	  System.out.print(c);
	}

}
