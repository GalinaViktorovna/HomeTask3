/**
 * Created by Галка on 23.01.2016.
 */
public class trener {

    public static void main(String[] args) {

        int[][] mas = new int[10][];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = new int[10];

        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = (int) Math.round(Math.random() * 100);
                //System.out.print(i + ","+ j + "     ");
                System.out.print(mas[i][j] + "     ");
            }
            System.out.println();
        }
        double summ = 0.0;
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if ((mas[i][j] % 2) == 0) System.out.print(mas[i][j] + "     ");
                //summ += mas[i][j];
            }
            System.out.println();
        }
        System.out.println("summ - " + summ / 100);

    }
}