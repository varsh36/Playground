import java.util.Scanner;
class Main
{
public static void main(String args[])
{
//Try out your code here
  Scanner  in=new Scanner(System.in);
  int n=in.nextInt();
  int a[]=new int[n];
  for(int i=0;i<n;i++)
  {
    a[i]=in.nextInt();
  }
  int s=in.nextInt();
  sl(n,a,s);
}
  public static void sl(int n,int a[],int s)
  {
    for(int i=0;i<n;i++)
    {
      for(int j=(i+1);j<n;j++)
      {
        if(a[i]+a[j]==s)
        {
        System.out.println(a[i]+", "+a[j]);
        }
  }
 
}
  }
}
