import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class lessList {
    public static ArrayList<String> myList;
    public static void lesson(String args[]){
        LinkedList<Integer> lst = new LinkedList<>(Arrays.stream(new Integer[]{0,1,2,3,4,5}).toList());
        myList = new ArrayList<String>();
        myList.addAll(Arrays.stream(new String[]{"red", "blue", "green"}).toList());
        System.out.println("Enter search line: ");
        String in = new Scanner(System.in).nextLine();
        if(task1(in)) System.out.println("finded "+ in);
        else System.out.println(in+" not finded");
        System.out.println(task2(lst));
    }
    public static boolean task1(String search){
        return myList.contains(search);
    }
    public static LinkedList<Integer> task2(LinkedList<Integer> lst){
        LinkedList<Integer> rev = lst.reversed();
        int s = lst.size();
        Integer a = rev.get(s-1);
        Integer b = rev.get(0);
        lst.set(0, b);
        lst.set(s-1, a);
        return lst;
    }
}
