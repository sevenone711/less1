import com.sun.tools.classfile.ConstantPool;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Arrays;

public class Homework5 {
    public  static void main(String [] args){
        Person person1 = new Person("Пупкин Виталий Владимирович","Директор","pupkin@mail.ru",41,"+7978213311",15000);
        person1.info();

        Person[] persArr = new Person[5];

        persArr[0] = new Person("Зинченко Владимир Игоревичь","раб","zin@mail.ru",45,"+79168971122",9000);
        persArr[1] = new Person("Лунев Сергей Станиславович","дворник","lunev@mail.ru",42,"+79168998123",8000);
        persArr[2] = new Person("Петров Виктор Федорович","кочегар","petrov@mail.ru",35,"+79168965432",7000);
        persArr[3] = new Person("Ленько Людмила Сергеевна","стриптезерша","lenko@mail.ru",67,"+79168975432",39000);
        persArr[4] = new Person("Галышев Никита Юрьевич","Гендиректор","galish@mail.ru",19,"+79168971234",209000);

        for(int i = 0; i< persArr.length;i++){
            persArr[i].infos();
        }



    }

}
