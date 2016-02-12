/**
 * Created by Галка on 21.01.2016.
 */
public class Task5_dvukhmermasiv {

    static int[][] masive = new int[8][5];


    public static void main(String[] args) {

        for (int i = 0; i < masive.length; i++) {
            for (int j = 0; j < masive[i].length; j++) {
                masive[i][j] = 10 + (int) (Math.random() * ((99 - 10) + 1));
                System.out.print(masive[i][j] + " ");
            }
            System.out.println();
        }


    }


}
