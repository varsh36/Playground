import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      z(n,a);
      for(int i=0;i<n;i++)
      {
        System.out.print(a[i]+" ");
      }
    }
  public static void z(int n, int a[])
  {
   int b[]=new int[n];
   int bs=0;
   int z[]=new int[n];
   int zs=0;
   for(int i=0;i<n;i++)
    {
     if(a[i]!=0)
       {
         b[bs]=a[i];
       bs++;
       }
       else 
       {
         z[zs]=a[i];
         zs++;
       }
   }
     int ai=0;
     for(int i=0;i<bs;i++)
     {
       a[ai]=b[i];
       ai++;
     }
     for(int i=0;i<zs;i++)
     {
       a[ai]=z[i];
       ai++;
     }
   }
   }