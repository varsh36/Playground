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
  sl(n,a);
}
  public static void sl(int n,int a[])
  {
    for(int i=0;i<n-1;i++)
    {
      for(int j=(i+1);j<n;j++)
      {
        for(int k=(j+1);k<n;k++)
        {
          
          {
          System.out.print("("+a[i]+", "+a[j]+", "+a[k]+")"+" ");
  }
        }
      }
      System.out.print("\n");
}
  }
}
