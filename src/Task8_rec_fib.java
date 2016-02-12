/**
 * Created by Галка on 24.01.2016.
 */
public class Task8_rec_fib {
    static int chet = 0;
    static int i = 0;

    public static int rec_fib(int z) {
        if (z < 2) return 1;
        if (z == 4) chet++;
        int a = rec_fib(z - 1) + rec_fib(z - 2);
        return chet;

    }

    public static void main(String[] args) {
        rec_fib(15);
        System.out.println(chet + " раза потребуется повторно вычислить четвёртый элемент ");
        System.out.println("последовательности Фибоначчи для вычисления пятнадцатого элемента ");

    }
}
