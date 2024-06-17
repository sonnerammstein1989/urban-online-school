import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class lessMap {
    public static void lesson(String[] args){
        map.put(1, "red");
        map.put(2, "green");
        map.put(3, "blue");
        System.out.println(getKeys());
        System.out.println(fltToMoreThreeChars());
    }
    static HashMap<Integer, String> map = new HashMap<>();

    public static Set<Integer> getKeys(){
        return map.keySet();
    }
    public static HashMap<Integer, String> fltToMoreThreeChars(){
        ArrayList<Integer> flt = new ArrayList<>();
        for(int k : map.keySet())
            if( map.get(k).length() >3 )
                flt.add(k);
        HashMap<Integer, String> ret = new HashMap<>();
        for(int k: flt)ret.put(k, map.get(k));
        return ret;
    }
}
