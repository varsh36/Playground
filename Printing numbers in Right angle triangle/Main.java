import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int c,b;
      for(c=1;c<=n;c++)
      {
        for(b=1;b<=c;b++)
        {
          System.out.print(c);
        }
        System.out.print("\n");
      }
	}
}