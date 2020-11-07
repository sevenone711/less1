package moth2.lesson3;

import java.util.*;
import java.util.stream.Collectors;

public class Phonebook {
Map <String,String> map = new HashMap<String,String>();
    private String name;
    private String phone;
 public void addcontact(String name,String phone){
     this.name = name;
     this.phone = phone;
     map.put(phone,name);

 }
 public void getcontact(String name){
    for(Map.Entry<String,String> s : map.entrySet()){
        if(s.getValue().equals(name)){
            System.out.println(s.getValue() + " : " + s.getKey());
        }
    }



 }

}
