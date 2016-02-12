import java.util.Scanner;

/**
 * Created by Галка on 24.01.2016.
 */
public class Task7_summ_do_n {
    static int i = 0;
    static void summ(int n) {

        if (n!= 0){
            i+=n;
            summ(n-1);



        }
    }

    public static void main(String[] args) {
        System.out.print("Enter please  ");
        Scanner chislo = new Scanner(System.in);
        int n = chislo.nextInt();
        summ(n);
        System.out.println(i);
    }

}
