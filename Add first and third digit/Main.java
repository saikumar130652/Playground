import java.util.Scanner;
class Main{
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
      int n =sc.nextInt();
      int n1=n/100;
      int n2=n%10;
      int add= n1+n2;
      System.out.println(add);
      
  
	}
}