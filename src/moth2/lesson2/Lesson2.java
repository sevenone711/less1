package moth2.lesson2;

import java.util.zip.DataFormatException;

public class Lesson2 {
    public static void main(String[] args) {

    String[][] arr = {{"14","sa","34","44"},
            {"46","22","23"},
            {"75","45","15","52"},
            {"12","54","s","s","s","s","21"}
    };

    printArr(arr);

    summArr(arr);


    }

    public static void summArr(String[][] arr){
        int summarr = 0;


        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++){

                try {

                    summarr = summarr + Integer.parseInt(arr[i][j].trim());
                }
                catch (NumberFormatException e){
                    MyArrayDataException(i,j,arr[i][j]);
                }
                catch (ArrayIndexOutOfBoundsException e){
                    MySizeArrayException();
                }
            }

                    }
        System.out.println("Сумма его значений: " + summarr);
    }

    public static void printArr(String[][] arr){



            System.out.println("Данн массив");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++){
                    System.out.print(arr[i][j] + " ");
                    }
                System.out.println();
                }

        }

    public static void MySizeArrayException(){
        System.out.println("Ошибка рамера массива");
    }
    public static void MyArrayDataException(int i, int j, String arrs){
        System.out.println("В ячейке массива arr[" + i +"][" + j + "] не число - " + arrs);
    }




}
