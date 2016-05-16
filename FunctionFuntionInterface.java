/*
@FunctionalInterface public class Function<T, R> {
    R apply(T t);
}

@FunctionalInterface public class BiFunction<T, U, R> { 
    R apply(T t, U u);
}

Your funtion interface
interface TriFunction<T,U,V,R> { 
    R apply(T t, U u, V v);
}

interface QuadFunction<T,U,V,W,R> { 
    R apply(T t, U u, V v, W w);
}

T for type parameter. 
U for second type parameter 
R for return type 
T,U, R are the generic type.
*/
import java.util.*;
import java.util.function.*;
import java.time.*;

interface TriFunction<T,U,V,R> { 
    R apply(T t, U u, V v);
}

public class FunctionFuntionInterface {

     public static void main(String []args){
        
        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = x -> x.length();
        String s1 = "lenght of this text is: ";
        System.out.println(s1 + f1.apply(s1));
        System.out.println(s1 + f2.apply(s1));
        
        BiFunction<String, String, String> b1 = String::concat;
        BiFunction<String, String, String> b2 = (string, toAdd) -> string.concat(toAdd);
        
        System.out.println(b1.apply("beatiful ","girl"));
        System.out.println(b2.apply("beatiful ","girl"));
        
        TriFunction<String, String, String, Integer> t1 = (ts1, ts2, ts3) -> ts1.concat(ts2).concat(ts3).length(); 
        System.out.println(t1.apply("beauty woman ", "on ", " stress"));
        
     }
}