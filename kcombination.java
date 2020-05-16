public class kcombination {

    public static int comb(int n, int k) {
        if (k == 0) {
            return 1;
        } else if (k > n) {
            return 0;
        } else {
            return comb(n - 1, k) + comb(n - 1, k - 1);
        }
        // write your code here
    }


/* Do not change code below */


