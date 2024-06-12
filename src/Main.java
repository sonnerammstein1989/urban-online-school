




public class Main {

    public static void main(String[] args) {
        int[] tst = {2,3,4,5};
        for(int i : tst)try {
            testOdd(i);
        } catch (Exception e) {
            System.out.println( "exception!" );
            System.out.println( e.getMessage() );
        }
    }
     public static void testOdd ( int a ) throws Exception {
        if( a % 2 == 1 ) throw new Exception("arg is even");
     }
}