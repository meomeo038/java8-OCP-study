/*
Lambda expressions can access static variables, instance variables, 
effectively final method parameters, and effectively  nal local variables.
*/

interface Iamfunctioninterface { String move(); }

public class LambdaByeffectivelyFinal{

    String instanceVarians = "i am an instance varians ";
    
    void everyonePlay(boolean localParameter) {
        String localVarial = "i am is local varial"; 
        //approach = "uncomment this line to create error effectively final ";
        play(() -> instanceVarians);
        play(() -> localParameter ? "localParameter is true and is paramater function": "localParameter is false and is paramater function"); 
        play(() -> localVarial);
    }
    
    void play(Iamfunctioninterface g) { 
        System.out.println(g.move());
    }
    
    public static void main(String []args){
        new LambdaByeffectivelyFinal().everyonePlay(true);
    }
    
    

}

