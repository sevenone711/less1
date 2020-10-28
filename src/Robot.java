public class Robot implements Runner {
    private String name;
    private int run;

    public Robot(String name, int i) {
        this.name = name;
        this.run  = i;
    }



    @Override
    public boolean runner(Treadmill a) {
        if (a.getLight() <= run){
            return true;
        }else {
           return false;
        }

    }
    String getName(){
        return name;
    }

}
