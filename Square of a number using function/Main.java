import java.util.Scanner;
class Main
{
  
  public static int sq(int num)
  {
    int squ; 
    squ=(num*num);
    return squ;
  }
	public static void main (String[] args)
    {
      Scanner in=new Scanner(System.in);
      int m=in.nextInt();
      int square;
      square=sq(m);
      System.out.print(square);
	 // Type your code here   
	} 
}