public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("plate: " + food);
    }
    //2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20)

    public boolean decreaseFood(int n){
        if(food < n){
            return false;
        }
        else {
            food -= n;
            return true;

        }
    }
    public int getFood(){
    return food;

    }
    public void setFood(int s,Cat1 cat){
        if(s < 0){
            System.out.println("Не хватает еды, в тарелке:" + food + ". Нужно: " + cat.getAppetite());
        } else {
            food = s;
            System.out.println(" накормили");
        }
    }
    public void setFoods(int i){
        food = i;
    }

}
