/**
 * Created by Галка on 20.01.2016.
 */
public class Task3_Bilety {
    public static void main(String[] args) {
        int biletik = 0;
        for (int i = 1; i < 1000000; i++) {
            int z = i/100000%10;
            int x = i/10000%10;
            int w = i/1000%10;
            int q = i/100%10;
            int r = i/10%10;
            int d = i%10;
            if ((z+x+w)==(q+r+d)) {
                biletik++;
            }




        }
        System.out.println(biletik);
    }
}
