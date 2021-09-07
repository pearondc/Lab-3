import java.util.Scanner;

class Main {
  public static void main( String[] args) {
   System.out.println("Enter a number to count down or up from");
   Scanner s = new Scanner(System.in);
   int num = s.nextInt();
   if (num >= 0) {
      while(num >= 0) {
        System.out.println(num);
        num -= 1;
      }
    }
    else {
     while(num <= 0) {
      System.out.println(num);
      num += 1;
      }
    }
    System.out.println("Blast off!");
  }
}