import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      int b=in.nextInt();
      int c=in.nextInt();
      int t,d;
      if(a>b)
      {
        d=a;
      }
      else
      {
        d=b;
      }
      if(d>c)
      {
        t=d;
      }
      else
      {
        t=c;
      }
      System.out.print(t);
    
        
    }
}