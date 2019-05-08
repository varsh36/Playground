import java.util.Scanner;
class Main{
  public static int sum(int m)
  {
    int s=0,c;
    for(c=1;c<=m;c++)
    {
      s=s+c;
    }
    return s;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sumo;
      sumo=sum(n);
      System.out.print(sumo);
      
	}
}