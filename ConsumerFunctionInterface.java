/*
@FunctionalInterface public class Consumer<T> { 
    void accept(T t);
}

@FunctionalInterface public class BiConsumer<T, U> {
    void accept(T t, U u); 
}

T for type parameter. 
U for second type parameter 
R for return type 
T,U, R are the generic type.
*/
import java.util.*;
import java.util.function.*;
import java.time.*;

public class ConsumerFunctionInterface{

     public static void main(String []args){
        //Consumer interface
        Consumer<String> c1 = System.out::println; 
        Consumer<String> c2 = x -> System.out.println(x);
        c1.accept("Consumer by refence method"); 
        c2.accept("Consumer by lamda express");
        
        //BiConsumer interface
        Map<String, Integer> map = new HashMap<>();
        BiConsumer<String, Integer> b1 = map::put; 
        BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);
        b1.accept("String object add by method reference", 7);
        b2.accept("String object add by lamda express", 1);
        System.out.println(map);
        
        // same type for both generic parameters.
        Map<String, String> map2 = new HashMap<>(); 
        BiConsumer<String, String> bb1 = map2::put; 
        BiConsumer<String, String> bb2 = (k, v) -> map2.put(k, v);
        bb1.accept("chicken", "chicken"); 
        bb2.accept("chick", "chick");
        System.out.println(map2);
        
     }
}
