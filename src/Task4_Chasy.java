/**
 * Created by Галка on 21.01.2016.
 */
public class Task4_Chasy {
    public static void main(String[] args) {
        int z = 0;
        for (int i = 0;i<=23;i++){
            for (int m = 0; m<=59;m++){
                if(i/10%10==m%10&i%10==m/10%10){
                    z++;
                }
            }
        }

        System.out.println("We have " + z + " " + "combinations");
    }

}
