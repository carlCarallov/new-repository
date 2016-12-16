/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepolymorphism;




import java.util.Scanner;
//import java.util.regex.Pattern;
//import java.util.regex.Matcher;
import java.util.ArrayList;
import java.util.List;


public class InheritancePolymorphism {
public static double x;
public static double y;
 

  
   
  
 // public static String n;
  
    public static void main(String[] args) throws Exception {
         System.out.println("Вводите операцию в обратной польской нотации \"- x y\"");
 Scanner name = new Scanner(System.in); 
 String p = name.next();  
        x=name.nextDouble();
                y=name.nextDouble();
        //фабрика
        AdditionFactory fa = new AdditionFactory(x,y);
        SubtractionFactory sf = new SubtractionFactory(x,y);
        MultiplicationFactory mf = new MultiplicationFactory(x,y);
        DivisionFactory df = new DivisionFactory(x,y);
        
  List<Arithmetic> arithmetic = new ArrayList<Arithmetic>();
      arithmetic.add(fa.createArithmetic());
      arithmetic.add(sf.createArithmetic());
      arithmetic.add(mf.createArithmetic()); 
      arithmetic.add(df.createArithmetic());
      
       
   
        
      
       
       
     
 
 

 for(Arithmetic v: arithmetic){
       if(p.equals("+")){
         
           arithmetic.get(0);
       }
       else if(p.equals("-")){
           
           arithmetic.get(1);
           
       }
       else if(p.equals("*")){
         
           arithmetic.get(2);
       }
       else if(p.equals("/")){
           
           arithmetic.get(3);
       }
   }
     /*x = name.nextDouble();
      y = name.nextDouble();
    switch(p){
        case "+":
            Addition a = new Addition(x,y);
            a.calc();
            break;
        case "-":
            Subtraction s = new Subtraction();
            s.calc();
            break;
        case "*":
            Multiplication m = new Multiplication();
            m.calc();
            break;
        case "/":
            Division d = new Division();
            d.calc();
            break;
            
    }*/
        
            
    }
}
                   
            
               
            
             
               
         
               
        

 

        
    
    
   
   
    
   

