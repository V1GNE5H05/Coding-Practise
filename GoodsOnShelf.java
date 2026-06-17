import java.util.*;
public class GoodsOnShelf {
    static boolean isCorrect(int[] arr) {
        int n = arr.length;
        int i = 0, j;
        while(i < n) {
            int current = arr[i];
            while(i < n && arr[i] == current) {
                i++;
            }
            for(j = i; j < n; j++) {
                if(arr[j] == current) {
                    return false;
                }
            }
        }
        return true;
    }
    
    static boolean canArrange(int[] arr) {
        int[] temp = arr.clone();
        if(isCorrect(temp)) {
            return true;
        }
        
        int n = arr.length;
        int i, j;
        for(i = 0; i < n; i++) {
            for(j = i + 1; j < n; j++) {
                int[] copy = arr.clone();
                int t = copy[i];
                copy[i] = copy[j];
                copy[j] = t;
                if (isCorrect(copy)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int i, n;
        while(t != 0) {
            n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            if(canArrange(arr)) {
                System.out.println("YES");
            } 
            else {
                System.out.println("NO");
            }
            t--;
        }
        in.close();
    }
}
