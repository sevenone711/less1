import org.omg.CORBA.PUBLIC_MEMBER;

public class lesson1 {
    public static void main(String args[]){
        byte a = 1;
        short b = 30000;
        int c = 123123123;
        long d = 9999999;
        float e = (float) 12.1222;
        double f = 123.123;
        char g = '\u0000';
        boolean r = true;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(r);
    }

    /*
    Написать метод вычисляющий выражение a * (b + (c / d))
    и возвращающий результат,где a, b, c, d – входные параметры этого метода;
     */
    public static float calculationExpress(float a, float b, float c, float d){
        return a * (b + (c / d));
    }
   /* Написать метод, принимающий на вход два числа,
   и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
   если да – вернуть true, в противном случае – false;
    */
    public static boolean summ10and20(int a,int b){
        int sum = a + b;
        boolean res = sum > 10 && sum <= 20;
        return res;
    }
    /*Написать метод, которому в качестве параметра передается целое число,
     метод должен напечатать в консоль положительное ли число передали,
     или отрицательное; Замечание: ноль считаем положительным числом.
     */
    public static void printTrueNumber(int a){

        if (a >= 0){
            System.out.println(a + " положительное число!");

        }
            else{
                System.out.println(a + " отрицательное число!");
        }
    }

    /*Написать метод, которому в качестве параметра передается целое число,
    метод должен вернуть true,
    если число отрицательное;
    * */

    public static boolean isNegative(int a){
        return a < 0;
    }
}
