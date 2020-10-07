import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class homeworck3 {
    public static void main (String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
//        1. Написать программу, которая загадывает случайное число от 0 до 9, и
//        пользователю дается 3 попытки угадать это число.
//        При каждой попытке компьютер должен сообщить больше ли
//        указанное пользователем число чем загаданное, или меньше.
//        После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

        System.out.println("Введите имя первого игрока");
        scanner.hasNextLine();
        String nameUser1 = scanner.nextLine();
        System.out.println(nameUser1);
        int answer;
        Random random = new Random();

        int count = 3; //сколько попыток
        int gameOver = 1;
        while (gameOver == 1){
            int vopros = random.nextInt(9);
            System.out.println(vopros);





                for (int i = 0;i < count;i++){


                System.out.println("Отгадайте число от 0 до 9");
                System.out.println("Попытка " + (i+1) + " из " + count);
                scanner.hasNextInt();
                System.out.println();
                answer = scanner.nextInt();

                if(answer == vopros){
                    System.out.println("Вы отгадали! Ваш ответ " + answer );
                    i = count;
                }
                    else if(answer > vopros) {
                        System.out.println("Ваше число:" + answer + " больше загаданного");

                    }
                    else {
                        System.out.println("Ваше число:" + answer + " меньше загаданного");


                    }
                }
                System.out.println("«Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет)");
                scanner.hasNextInt();
                gameOver = scanner.nextInt();

        }
        System.out.println("GameOver");





        //        2 * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana",
//        "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak",
//        "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple",
//        "pumpkin", "potato"};
//        При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
//                сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь.
//                Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
//                apple – загаданное
//        apricot - ответ игрока
//        ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
//        Для сравнения двух слов посимвольно, можно пользоваться:
//        String str = "apple";
//        str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
//        Играем до тех пор, пока игрок не отгадает слово
//        Используем только маленькие буквы
        String[] words = {"apple", "orange", "lemon", "banana","apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak","kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple","pumpkin", "potato"};
        int lengthWords =  words.length -1 ;
        int numberRandomWords = random.nextInt(lengthWords);
        int countWins = 1;
        int cikl;
        char displayResult;


        String str = words[numberRandomWords];
        char[] m = {'#'};

        int count = 0;
        for (int i =0; i<str.length();i++){
            count++;
        }

        char[] arrWords = new char[count];
        for(int i =0;i<count;i++){
            arrWords[i] = str.charAt(i);
                    }

        System.out.println("Я загадал слово! Попробуйте его отгадать! Введите ваш ответ:");
        while (countWins == 1){



        scanner.hasNextLine();
        String answer = scanner.nextLine();
        int count2 = 0;
        for (int i =0; i<answer.length();i++){
            count2++;
        }
        if(count>count2){
             cikl = count - count2;
        }else if(count==count2){
             cikl = count;
        }

        char[] answerArr = new char[count2];
        for(int i =0;i<count2;i++){
            answerArr[i] = answer.charAt(i);
        }
            if(count > count2){
                cikl = count2;
            } else {
                cikl = count;
            }
        char[] dislplayOut = new char[count];
        for (int i = 0;i< cikl;i++){
            if(arrWords[i]== answerArr[i]){
                dislplayOut[i] = arrWords[i];

            }else {
                dislplayOut[i] = m[0];
            }
        }
        for(int f = 0;f< dislplayOut.length;f++){
            System.out.print(dislplayOut[f]);
        }
            if(Arrays.equals(arrWords, answerArr)){
                countWins = 0;
                System.out.println(" Вы отгадали!!");
            }
        else if (countWins == 1){
            System.out.println("#########");
            System.out.println("Попробуйте еще раз:");
        }

        }




    }




    }

