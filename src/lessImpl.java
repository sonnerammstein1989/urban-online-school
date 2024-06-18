import java.util.Arrays;

public class lessImpl {

    interface Printable{
        public void print();
    }
    @FunctionalInterface
    interface Concatable{
        public String concat(String a, String b);
    }
    class Impl {
        static public void main(String[] args) {
            Printable[] arr = new Printable[]{
                    new Printable() {
                        @Override
                        public void print() {
                            System.out.println("first is printable");
                        }
                    },
                    new Printable() {
                        @Override
                        public void print() {
                            System.out.println("second can print too");
                        }
                    }
            };
            Arrays.stream(arr).forEach(p->p.print());

            String a = new String("first");
            String b = new String("second");
            printTwo(a,b , Main::concatImplA);
            printTwo(a,b , Main::concatImplB);
        }
        static void printTwo(String a, String b, Concatable c){System.out.println(c.concat(a,b));}
        static String concatImplA(String a, String b){return new String(a+","+b);}
        static String concatImplB(String a, String b){return new String(a+"+"+b);}
    }

}
