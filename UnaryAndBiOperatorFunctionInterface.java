/*
@FunctionalInterface 
public class UnaryOperator<T> extends Function<T, T> { }

@FunctionalInterface 
public class BinaryOperator<T> extends BiFunction<T, T, T> { }


T for type parameter. 
U for second type parameter 
R for return type 
T,U, R are the generic type.
*/
import java.util.*;
import java.util.function.*;
import java.time.*;


public class UnaryAndBiOperatorFunctionInterface {

     public static void main(String []args){
        UnaryOperator<String> u1 = String::toUpperCase;
        UnaryOperator<String> u2 = x -> x.toUpperCase();
        System.out.println(u1.apply("hi my friend"));
        System.out.println(u2.apply("hi my friend"));
        
        BinaryOperator<String> b1 = String::concat;
        BinaryOperator<String> b2 = (string, toAdd) -> string.concat(toAdd);
        
        System.out.println(b1.apply("hi my ", "friend")); // baby chick 
        System.out.println(b2.apply("hi my ", "friend")); // baby chick
     }
}