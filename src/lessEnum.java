import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class lessEnum {
    static HashMap<String, Person> lst = new HashMap<>();
    public static void lesson(String[] args){
        Random rnd = new Random(99);
        String[] names = new String[]{
                "alex", "ivan", "petr", "oleg", "dima",
                "olya", "kolya", "masha", "vasya", "tasha"
        };
        for(int i =0; i<12; i++)
            lst.put(names[i%10] ,new Person(names[i%10], rnd.nextInt(35)+18));
        for(String key : new String[]{"olya", "masha", "tasha"})
            lst.get(key).gender = Gender.FEMALE;

        lst.forEach((k,v)->System.out.println(v));
        System.out.println("\n\n\nsorted males:");

        for(Person p : getByGender(Gender.MALE))
            System.out.println(p);
    }
    public static Person[] getByGender(Gender g){
        ArrayList<Person> ret = new ArrayList<>();
        lst.forEach((i, v)->{if(v.gender == g)ret.add(v);});
        Person[] arr = new Person [ret.size()];
        Iterator<Person> iter = ret.iterator();
        int i=0;
        while(iter.hasNext())arr[i++]=iter.next();
        return arr;
    }
}
enum Gender{ MALE, FEMALE }
class Person  {
    Integer age;
    String name;
    Gender gender = Gender.MALE;
    public Person(String n, int a) { age =a; name =n; }
    @Override public String toString(){ return
            "name: "+ name +", age: "+age +", gender: "+gender;
    }
}