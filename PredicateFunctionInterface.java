/*
@FunctionalInterface public class Predicate<T> { 
    boolean test(T t);
}

@FunctionalInterface public class BiPredicate<T, U> {
    boolean test(T t, U u); 
}

T for type parameter. 
U for second type parameter 
R for return type 
T,U, R are the generic type.
*/
import java.util.*;
import java.util.function.*;
import java.time.*;

public class PredicateFunctionInterface{

     public static void main(String []args){
        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = x -> x.isEmpty();
        System.out.println("input paramater is null : " + p1.test("")); 
        System.out.println("input paramater is null : " + p2.test(""));
        
        BiPredicate<String, String> b1 = String::startsWith;
        BiPredicate<String, String> b2 = (string, prefix) -> string.startsWith(prefix);
        System.out.println("chicken is start with chick: " + b1.test("chicken", "chick")); 
        System.out.println("chicken is start with chick: " + b2.test("chicken", "chick"));
     }
}
