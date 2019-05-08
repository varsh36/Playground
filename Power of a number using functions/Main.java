import java.util.Scanner;
class Main{

  public static int ex(int m,int exp)
  {
    int result=1;
    while (exp != 0)
        {
            result *= m;
            --exp;
        }
    return result;
  }
  public static void main(String[] args)
  {
    
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int exp=in.nextInt();
    int eo=ex(n,exp);
    System.out.print(eo);
    
  }
}