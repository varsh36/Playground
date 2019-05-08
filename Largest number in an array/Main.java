import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int s=in.nextInt();
      int b=0;
      int a[]=new int[s];
      for(int i=0;i<=(s-1);i++)
      {
        a[i]=in.nextInt();
      }
      for(int i=0;i<=(s-1);i++)
      {
        if(b<a[i])
        {
          b=a[i];
     
        }
             
      }
      System.out.println(b);
      
      
    }
}