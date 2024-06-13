import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class lessGeneric {
    static Double[]  a =  { 1.1, 2.2, 3.3, 4.4, 5.5 };
    static Double[]  b =  { 1.0, 2.0, 3.1, 4.1, 5.1 };

    public static void lesson(String[] args) {
        int res = cmpArrays(Arrays.asList(a), Arrays.asList(b));
        String str = (res==-1)? "arrays equals" : "not equals on "+res+" number";

        swapInArr(1,2,a, b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
    public static <T>void swapInArr(int n, int k, T[] arr1, T[] arr2){
        try {   T x = arr1[n];          T y = arr2[k];
            Array.set(arr1, n, y);  Array.set(arr2, k, x); } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int cmpArrays (List<?extends Number> arr1, List<?extends Number> arr2){
        int a = arr1.size();
        int b = arr2.size();
        int l = a>b ? a : b;
        for(int i = 0; i<l; i++){
            if( arr1.get(i).doubleValue() != arr2.get(i).doubleValue() ){
                return i;
            }
        }
        return -1;
    }
}
