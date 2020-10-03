import com.sun.tools.javac.file.SymbolArchive;

import java.lang.reflect.Array;
import java.util.Arrays;

public class homework2 {
    public static void main(String[] args){
        System.out.println("1. Задать целочисленный массив, состоящий из элементов 0 и 1.\n" +
                "       Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].\n" +
                "       С помощью цикла и условия заменить 0 на 1, 1 на 0;");
       /*
        1. Задать целочисленный массив, состоящий из элементов 0 и 1.
       Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
       С помощью цикла и условия заменить 0 на 1, 1 на 0;
       */
        int[] arr = {0,1,0,0,1,0,0,1,1};
        for(int i=0; i < arr.length; i++){
            if(arr[i] == 0){
                arr[i] = 1;
                System.out.print(arr[i]);
            }
            else {
                arr[i] = 0;
                System.out.print(arr[i]);
            }

        }
        System.out.println();
        System.out.println("2. Задать пустой целочисленный массив размером 8.\n" +
                "        С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;");

       /*
        2. Задать пустой целочисленный массив размером 8.
        С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        */
        int[] a = new int[8];
        int count = 0;
        for(int i = 0;i< a.length;i++){
            a[i] = count;
            count = count+3;
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]\n" +
                "         пройти по нему циклом, и числа меньшие 6 умножить на 2;");

        /*
        3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
         пройти по нему циклом, и числа меньшие 6 умножить на 2;
         */
        int[] b = {1,5,3,2,11,4,5,2,4,8,9,1};
        for(int i=0; i< b.length;i++){
            if(b[i]<6){
                b[i]=b[i]*2;
                System.out.print(b[i]+"; ");
            }
        }
        System.out.println();
        System.out.println("4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),\n" +
                "         и с помощью цикла(-ов) заполнить его диагональные элементы единицами;");
        /*
        4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
         и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
         */
        int[][] arrSquare = new int[5][5];
         for(int i = 0;i < 5;i++){
             for(int j=0;j<5;j++){
                 arrSquare[i][j] = 1;
                 System.out.print(arrSquare[i][j]+ " ");
             }
             System.out.println();
         }
        for(int i = 0;i < 5;i++){
            for(int j=0;j<5;j++){
                arrSquare[j][i] = 1;
                System.out.print(arrSquare[j][i]+ " ");
            }
            System.out.println();
        }
         System.out.println();


        /*
        5. ** Задать одномерный массив и найти в нем минимальный
         и максимальный элементы (без помощи интернета);
         */
        int[] sab = {3,5,3,2,11,4,5,2,4,8,99,111};
        int max = 0;
        for(int i =0;i < sab.length;i++){
            if(sab[i]>max){
                max = sab[i];

            }
        }
        System.out.println("В данном массиве: " + Arrays.toString(sab));
        System.out.println("Максимальное число в массиве: " + max);
        for(int i =0;i < sab.length;i++){
            if(sab[i]<max){
                max = sab[i];

            }
        }
        System.out.println("Минимальное число в массиве: " + max);

        /*
        6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
         метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
          Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
          checkBalance([1, 1, 1, || 2, 1]) → true,
          граница показана символами ||, эти символы в массив не входят.*/
        /*
        7. **** Написать метод, которому на вход подается одномерный
         массив и число n (может быть положительным, или отрицательным),
         при этом метод должен сместить все элементымассива на n позиций.
         Для усложнения задачи нельзя пользоваться вспомогательными массивами.
         */

        int[] arrSdvig = { 1, 2, 3, 4, 5, 6, 7 };
        int sdvig = -22;
        int ostatok;
        if (sdvig> arrSdvig.length){                // проверяю сдвиг больше длины массива если д
            ostatok = sdvig % arrSdvig.length;      //а то смотрю в итоге на сколько нужно сдвинуть
            System.out.println("Сдвиг будет на " + ostatok + " вперед");
        }
        else if (sdvig<0){
            System.out.println("Сдвиг меньше 0 :" + sdvig);
        }
        else{
          ostatok = arrSdvig.length - sdvig;        //если нет то считаю куда будет сдвиг
            System.out.println("Сюда будет сдвиг " + ostatok);
        }






    }


}
