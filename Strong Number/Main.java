import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int num = in.nextInt();
	    int copy_number = num;
	    int sum = 0;
      while(num>0)
      {
        int rem=num%10;
        int fact=1;
      for(int count=1;count<=rem;count++)
      {
        fact=fact*count;
      }
      sum=sum+fact;
        num/=10;
      }
      if(sum==copy_number)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    }
}
