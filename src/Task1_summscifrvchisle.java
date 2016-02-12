import com.sun.security.auth.SolarisNumericUserPrincipal;

import java.util.Scanner;

/**
 * Created by Галка on 19.01.2016.
 */
public class Task1_summscifrvchisle {

    public static void main(String[] args) {
        int n;
        int sum = 0;
        System.out.println("Enter please: ");
        Scanner chislo = new Scanner(System.in);
        n = chislo.nextInt();
        while (n != 0) {
            sum = sum + (n % 10);
            n /= 10;
        }
        System.out.println(sum + " ");

    }
}