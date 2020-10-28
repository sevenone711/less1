public class Human implements Jump, Runner {
    private String name;
    private int jump;
    private int run;

    public Human(String name,int jump,int run) {
        this.name = name;
        this.jump = jump;
        this.run  = run;
    }
    String getName(){
        return name;
    }


    @Override
    public boolean jumping(Wall a) {
        if(a.hight <= jump){
            return true;
        } else {
            return false;

        }

    }

    @Override
    public boolean runner(Treadmill a) {
        if (a.getLight() <= run){
            return true;
        }else {
            return false;

        }

    }
}
