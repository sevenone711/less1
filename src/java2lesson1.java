public class java2lesson1 {


    public static void main(String[] args) {
    Human h = new Human("Test",32,122);
    Object[] arr = {
            new Cats("Вася",24,32),
            new Human("Viktor",32,24),
            new Robot("Android",34)
    };
    Object[] obstacles = {
            new Treadmill(23),
            new Wall(12),
            new Treadmill(4),
            new Wall(7),
            new Treadmill(31),
            new Wall(24)
    };


   for(Object paticipant : arr){
       for (Object obstracle : obstacles){
           if (obstracle.getClass()==Treadmill.class){
               if(paticipant.getClass()== Human.class){
                   if(((Human) paticipant).runner((Treadmill) obstracle)){
                        System.out.println(((Human) paticipant).getName() + " Пробежал дистанцию - " + ((Treadmill) obstracle).getLight());
                   } else {
                       System.out.println(((Human) paticipant).getName() + " не смог пробежать дистанцию - " + ((Treadmill) obstracle).getLight() + " и выбыл");
                       break;

                   }
               } else if (paticipant.getClass() == Cats.class){
                   if(((Cats) paticipant).runner((Treadmill) obstracle)){
                       System.out.println(((Cats) paticipant).getName() + " Пробежал дистанцию - " + ((Treadmill) obstracle).getLight());
                   } else {
                       System.out.println(((Cats) paticipant).getName() + " не смог пробежать дистанцию - " + ((Treadmill) obstracle).getLight() + " и выбыл");
                       break;

                   }
               } else {
                   if(((Robot) paticipant).runner((Treadmill) obstracle)){
                       System.out.println(((Robot) paticipant).getName() + " Пробежал дистанцию - " + ((Treadmill) obstracle).getLight());
                   } else {
                       System.out.println(((Robot) paticipant).getName() + " не смог пробежать дистанцию - " + ((Treadmill) obstracle).getLight() + " и выбыл");
                       break;

                   }
               }
           } else if(obstracle.getClass()==Wall.class){
               if(paticipant.getClass()== Human.class){
                   if(((Human) paticipant).jumping((Wall) obstracle)){
                       System.out.println(((Human) paticipant).getName() + " Перепрыгнул - " + ((Wall) obstracle).getHight());
                   } else {
                       System.out.println(((Human) paticipant).getName() + " не смог перепрыгнуть - " + ((Wall) obstracle).getHight() + " и выбыл");
                       break;

                   }
               } else if (paticipant.getClass() == Cats.class){
                   if(((Cats) paticipant).jumping((Wall) obstracle)){
                       System.out.println(((Cats) paticipant).getName() + " Перепрыгнул - " + ((Wall) obstracle).getHight());
                   } else {
                       System.out.println(((Cats) paticipant).getName() + " не смог перепрыгнуть - " + ((Wall) obstracle).getHight() + " и выбыл");
                       break;

                   }
               } else {

                   System.out.println(((Robot)paticipant).getName() + " не умеет прыгать");
                   break;
               }
           }

       }
   }




    }
}
