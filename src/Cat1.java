public class Cat1 {

        private String name;
        private int appetite;
    //3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true
        private boolean satiety;
        public Cat1(String name, int appetite,boolean satiety) {
            this.name = name;
            this.appetite = appetite;
            this.satiety = satiety;
        }
    //4. Считаем, что если коту мало еды в тарелке, то он ее просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы)
        public void eat(Plate p) {
            if(p.decreaseFood(appetite)){
                satiety = true;
            }
            else {
                satiety = false;
            }
        }
        public int getAppetite(){
    return appetite;
        }
        public boolean getSatiety(){
            return satiety;
        }
        public void setSatiety(int i){
            if (i == 1){
                satiety = true;
            }
            else {
                satiety = false;
            }
        }
        public String getName(){
            return name;
        }
}
