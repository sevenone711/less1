public class homework7 {

//    1. Расширить задачу про котов и тарелки с едой





    public static void main(String[] args) {
        Cat1 cat = new Cat1("Barsik", 110,false);
        Plate plate = new Plate(100);
        plate.info();
        cat.eat(plate);
        plate.info();
        plate.setFood(plate.getFood() - cat.getAppetite(), cat);
        plate.info();
//5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль
        Cat1[] cats = new Cat1[5];
        cats[0] =  new Cat1("Vasya", 35,false);
        cats[1] =  new Cat1("Tima", 175,false);
        cats[2] =  new Cat1("Manya", 33,false);
        cats[3] =  new Cat1("Kyka", 64,false);
        cats[4] =  new Cat1("Byka", 82,false);
        System.out.println(cats[2].getSatiety());
        Plate plate2 = new Plate(200);
        for(int i = 0; i< cats.length;i++){
            cats[i].eat(plate2);
            if (cats[i].getSatiety()){
                System.out.println("Кот " + cats[i].getName() + " поел");
            }
            else {
                System.out.println("Кот " + cats[i].getName() + " не поел, так ка слишком много жрет!");
            }
        }
        //6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку
        plate2.setFoods(3241);
        System.out.print("Добавили еды в тарелку и получилось в ней ");
        plate2.info();
    }

}
