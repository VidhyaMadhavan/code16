import java.util.*;
class sumnumber
{
public static void main(String args[])throws Exception
{
Scanner sc=new Scanner(System.in);
int n,rem=0,sum=0,newsum,newnum,rev=0;
System.out.println("Enter number:");
n=sc.nextInt();
while(n!=0)
{
rem=n%10;
sum=sum+rem;
n=n/10;
}
newsum=sum;
while(sum!=0)
{
rem=sum%10;
rev=(rev*10)+rem;
sum=sum/10;
}
if(newsum==rev)
{
System.out.println("Thesum of given number is a palindrome");
}
else
{
System.out.println("Not palindrome");
}
}
}

