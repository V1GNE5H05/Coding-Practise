import java.util.*;
class LuckyNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int cp = n;
        int l = 0;
        while(cp != 0) {
            cp /= 10;
            l++;
        }
        if(l != 4) {
            System.out.println("invalid number");
        }
        else {
            while(n != 0) {
                cp += (n%10);
                n /= 10;
            }
            System.out.println(cp);
            if(cp%3 == 0 || cp%5 == 0 || cp%7 == 0) System.out.println("That's my lucky number!");
            else System.out.println("Sorry!, it's not my lucky number!");
        }
    }
}
