/*
@FunctionalInterface public class Supplier<R> { 
    public R get();
}

T for type parameter. 
U for second type parameter 
R for return type 
T,U, R are the generic type.

*/
import java.util.*;
import java.util.function.*;
import java.time.*;

public class SupplierFunctionInterface{

     public static void main(String []args){
        //constructor reference to create the object
        Supplier<LocalDate> s1 = LocalDate::now; //method reference
        Supplier<LocalDate> s2 = () -> LocalDate.now(); // lamda express
        LocalDate d1 = s1.get();
        LocalDate d2 = s2.get();
        System.out.println(d1);
        System.out.println(d2);
        
        //create the generic that contains another generic
        Supplier<ArrayList<String>> arr1 = ArrayList<String>::new; 
        ArrayList<String> a1 = arr1.get();
        System.out.println(a1);
        System.out.println(arr1);
     }
}
