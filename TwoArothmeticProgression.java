import java.util.*;

class TwoArithmeticProgression {

  public static long gcd(long a, long b) {
    while(b != 0) {
      long t = b;
      b = a % b;
      a = t;
    }
    return a;
  }
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    int i;
    long[] rs = new long[t];
    for(int j = 0; j < t; j++) {
        int n = in.nextInt(), a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt();  
        for(i = 1; i <= n; i++) {
            rs[j] += gcd((a*i)+b, (c*i)+d);
        }
    }
    for(i = 0; i < t; i++) {
        System.out.println(rs[i]%998244353);
    }
    in.close();
  }
}
