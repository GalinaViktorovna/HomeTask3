/**
 * Created by Галка on 21.01.2016.
 */
public class Task6_masiv_proizvedenie {
    public static void main(String[] args) {
        //Создадим заданный двумерный массив
        int[][] Mas = new int[7][4];
        //Для хранения значений произведения элементов строк, создадим простой массив размером равным количеству строк двумерного массива
        int[] Mas1 = new int[Mas.length];
        //Заполним двухмерный массив
        for (int i = 0; i < Mas.length; i++) {
            //Для информативности - перед каждой строкой массива будет выведен ее индекс
            System.out.print("Строка №" + i + " ");
            for (int h = 0; h < Mas[i].length; h++) {
                Mas[i][h] = (int) (Math.random() * 11) +1;
                System.out.print(Mas[i][h] + " ");
                //Заполним второй массив, путем перемножения всех элементов определенной строки двумерного массива
                if (h == 0) Mas1[i] = Mas[i][h];
                else Mas1[i] *= Mas[i][h];
                System.out.print("mas1 ="+Mas1[i]+",");
                //Для удобства восприятия каждую новую строку будем выводить с абзаца
                if (h == Mas[i].length - 1)
                    System.out.println(" ");
            }
        }
        //Создадим переменные, в которых будут храниться значения максимального произведения по модулю элеметов строк и индекс такой строки
        int max = 0, max_i = 0;
        //Переберем элементы второго массива, и выберем больший по модулю. Запомним его а также индекс этого элемента, который будет равняться индексу строки двумерного массива
        for (int i = 0; i < Mas1.length; i++) {
            if (Math.abs(Mas1[i]) > max) {
                max = Mas1[i];
                max_i = i;
            }
        }
        //Выведем информацию на экран
        System.out.println("Строка с наибольшим по модулю произведением элементов (" + max + ") имеет индекс - " + max_i);
    }
}