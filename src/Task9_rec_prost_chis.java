import java.util.Scanner;

/**
 * Created by Галка on 24.01.2016.
 */
public class Task9_rec_prost_chis {


    public static boolean rec_prostoe(int n,int k) {
        boolean y = true;
        if (k < n) {

            if (n % k == 0) return y = false;
            else rec_prostoe(n, ++k);
        }
        return y;
    }
    public static void main(String[] args) {

        System.out.println("Enter please     ");
        Scanner chislo = new Scanner(System.in);
        int n = chislo.nextInt();
        for (int i = 2; i <= n; i++) {
            boolean z = rec_prostoe(i, 2);

            if (z == true) {
                System.out.println(i + " число простое");
            }
        }
    }
    }





