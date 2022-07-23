// loneSum
// Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.

// loneSum(1, 2, 3) → 6
// loneSum(3, 2, 3) → 2
// loneSum(3, 3, 3) → 0

import java.util.*;
public class LoneSum {
    public static int loneSum(int a, int b, int c) {
        int sum = 0;
        if(a != b && a != c && b != c) {
          sum = a + b + c;
          return sum;
        } else if(a == b && a != c) {
          sum = c;
          return sum;
        } else if(a == c && a != b) {
          sum = b;
          return sum;
        } else if(b == c && b != a) {
          sum = a;
          return sum;
        } else {
          return 0;
        }
      }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter value of c: ");
        int c = sc.nextInt();
        int lone_sum = loneSum(a, b, c);
        System.out.println("Lone Sum is: " + lone_sum);
        sc.close();
    }
    
}
