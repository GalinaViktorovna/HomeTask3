/**
 * Created by Галка on 23.01.2016.
 */
public class XanoyTower{
    public static long khodiki = 0;
    static void rekurs(int n, int x, int z) {
        if (n+1 > 1) {
            rekurs(n - 1, x, 6 - x - z);
            khodiki++;
            //System.out.println(x + " " + z);
            rekurs(n - 1, 6 - x - z, z);

        }
    }
    public static void main(String[] args) {

    rekurs(3,1,3);
        System.out.println(khodiki + "th steps was");
    }


}
