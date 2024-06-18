
class lessLambda {
    interface VarCondition{
        public boolean isCond(int a);
    }
    class Lamda{
        static public void lesson(String[] args) {

            int res = calcSumm(
                    new int[]{2,3,4,5,6,34,3,1,23,4,56,6,7,34,2,234,4,6,645,3,4,322,3,4,2,2},
                    (VarCondition) a-> a%2==0
            );
            System.out.println("summ of evens equals = "+res);
        }
        public static int calcSumm(int[] arr, VarCondition isIt)
        {
            int res =0;
            for(int i : arr)
                res = isIt.isCond(i) ? res +i : res +0;
            return res;
        }
    }
}
