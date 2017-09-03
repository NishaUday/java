import java.util.Scanner;

public class g{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i,c=0;
for(i=2;i<n;i++)
{
  if(n%i==0)
    {
      c++;
      break;
     }
}
if(c==0)
{
System.out.print(" prime num");
}
else
{
System.out.print("not a prime num");
}
}
}


