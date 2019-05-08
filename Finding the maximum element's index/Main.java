import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=in.nextInt();
    }
    me(a,n);
  }
  public static void me(int a[],int n)
  {
    int m=0,k=0;
    for(int i=0;i<n;i++)
    {
      if(k<a[i])
      {
        k=a[i];
        m=i;
      }
    }
    System.out.print(m);
  }
}