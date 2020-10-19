public class Person {
    private String name;
    private String position;
    private String email;
    private int age;
    private String tel;
    private int salary;


    public Person (String name,String position, String email, int age,String tel, int salary){
        this.name = name;
        this.position = position;
        this.email = email;
        this.age = age;
        this.tel = tel;
        this.salary = salary;
    }

     void info(){
        System.out.println("Простой вывод \nИмя: " +this.name +"\nДолжность: " +this.position +"\n email: "+this.email +"" +
                "\nВозраст: " + this.age +"\nТелефон: "+ this.tel +"\nЗарплата: "+ this.salary + " рублей\n");
        System.out.println("----------------------------------");
    }
    void printArray(){
        if (this.age > 40){
            System.out.println("Имя: " +this.name +"\nДолжность: " +this.position +"\n email: "+this.email +"" +
                    "\nВозраст: " + this.age +"\nТелефон: "+ this.tel +"\nЗарплата: "+ this.salary + " рублей\n");
        }
    }


}
