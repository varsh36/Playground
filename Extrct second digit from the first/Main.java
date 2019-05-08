import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int j=(n%10);
      int i,sum;
      i=n;
      while(i>=1000)
      {
          i=i/1000;
          
      }
      int m=i%10;
      
      
      System.out.println(m);
      
    }
	}
