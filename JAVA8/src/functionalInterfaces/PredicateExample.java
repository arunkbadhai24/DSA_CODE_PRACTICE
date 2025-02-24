package functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Integer> p1 = (i) ->  i%2 ==0;
    static Predicate<Integer> p2 = (i) ->  i%5 ==0;
    public static void predicateAnd(){
        System.out.println("Predicate And result is : "+p1.and(p2).test(10));
        System.out.println("Predicate And result is : "+p1.and(p2).test(9));
    }
    public static void predicateOR(){
        System.out.println("Predicate OR result is : "+p1.or(p2).test(10));
        System.out.println("Predicate OR result is : "+p1.or(p2).test(8));
    }
    public static void predicateNegate(){
        System.out.println("Predicate negate result is : "+p1.or(p2).negate().test(8));
    }
    public static void main(String[] args) {
        System.out.println(p1.test(4));
        predicateAnd();
        predicateOR();
        predicateNegate();
    }
}
