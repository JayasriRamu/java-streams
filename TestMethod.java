import java.util.function.Function;

public class TestMethod {
    public static void main(String args[]){
         Function<String,Integer> m1=(a)->Integer.parseInt(a);
         System.out.println("int " + m1.apply("5"));

         Function<String,Integer> m=Integer::parseInt;
         System.out.println("int " + m1.apply("5"));

         Function<String,Float> f1=Float::parseFloat;

        System.out.println("float " + f1.apply("5.67"));


    }
}
