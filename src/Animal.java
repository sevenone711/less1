public class Animal {
   private String name;
   private int steam;
   private int sail;
   private double jump;

   public Animal(String name,int steam,int sail,double jump){
       this.jump = jump;
       this.name = name;
       this.sail = sail;
       this.steam = steam;
   }
//  Вывод с помощью boolean
    boolean booleanJump(double jump){
        if(this.jump >= jump){
           return true;
        } else {
            return false;
        }
    }

    // Доработанный вывод
   void jump(double jump){
       if(this.jump >= jump){
           System.out.println(this.name + " прыгнул на " + jump + " метра");
       } else {
           System.out.println(this.name + " не может прыгнуть на такое расстояние" );
       }
   }
    void goSteam(int steam){
        if(this.steam >= steam){
            System.out.println(this.name + " пробежал на " + steam + " метра");
        } else {
            System.out.println(this.name + " не может бегать на такое расстояние" );
        }
    }
    void goSail(int sail){
        if(this.steam >= 0){
            System.out.println(this.name + " не умеет плавать");
        } else if (this.steam >= steam){
           System.out.println(this.name + " проплыл " + this.steam + " метра");
        } else {
            System.out.println(this.name + " не может плавать на такое расстояние" );
        }
    }

}
