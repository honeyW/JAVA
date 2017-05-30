
import java.util.*;
import static java.util.Arrays.sort;

class TestClass {

    public static void main(String args[]) throws Exception {
        Scanner s = new Scanner(System.in);
        int n, i;
        n = s.nextInt();
        int arr[] = new int[n];
        for (i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        sort(arr);

        int sum, sum1;
        sum = 0;
        sum1 = 0;
        for (i = 0; i < n; i++) {
            sum = sum + arr[i];
        }

        int l = arr[n / 2 + 1];
        while (true) {
            for (i = 0; i < n; i++) {
                arr[i] = l;
                sum1 = sum1 + arr[i];
            }
            if (sum1 <= sum) {
                l = l + 1;
            } else {
                break;
            }
        }

        System.out.println(l);
    }
}
