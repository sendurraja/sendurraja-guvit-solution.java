import java.util.*;
class OddorEven
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    String str = "Even";
    str = n%2==0?"Even":"Odd";
    System.out.println(str);
  }
}
