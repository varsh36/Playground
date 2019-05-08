import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int l[]=new int[n];
    for(int i=0;i<n;i++)
    {
      l[i]=in.nextInt();
    }
    pb(l,n);
  }
  public static void pb(int l[],int n)
  {
    int sum=0;
    int sum1=0;
    for(int i=0;i<(n/2);i++)
    {
      sum=sum+l[i];
    }
    for(int i=((n/2)+1);i<n;i++)
    {
      sum1=sum1+l[i];
    }
    if(sum==sum1)
    {
      System.out.print("Perfect Batch");
    }
    else
    {
      System.out.print("Not a Perfect Batch");
    }
  }    
  }
