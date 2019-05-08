import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner in=new Scanner(System.in);
      int r=in.nextInt();
      int c=in.nextInt();
      int temp=0;
      for(int i=r;i>0;i--)
      {
        for(int j=c;j>=i;j--)
        {
           System.out.print(j);
          temp=j;
        }
          for(int k=r-i+1;k<r;k++)
          {
            System.out.print(temp);
          } 
        System.out.print("\n");
      }
    }
}
