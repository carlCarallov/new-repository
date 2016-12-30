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
private static String p;



  
   
  
 // public static String n;
  
    public static void main(String[] args) throws Exception {
         System.out.println("Вводите операцию в обратной польской нотации \"- x y\"");
 Scanner name = new Scanner(System.in); 
   
Pars parse = new Pars();


        //фабрика
        AdditionFactory fa = new AdditionFactory();
        SubtractionFactory sf = new SubtractionFactory();
        MultiplicationFactory mf = new MultiplicationFactory();
        DivisionFactory df = new DivisionFactory();
        String p = name.next();
        parse.number(p);
  List<Arithmetic> arithmetic = new ArrayList<Arithmetic>();
      arithmetic.add(fa.createArithmetic());
      arithmetic.add(sf.createArithmetic());
      arithmetic.add(mf.createArithmetic()); 
      arithmetic.add(df.createArithmetic());
      
       
   
        
      
       
       
     
 
 

 for(Arithmetic v: arithmetic){
             switch (p) {
                 case "+":
                     System.out.println(arithmetic.get(0));
                     break;
                 case "-":
                     arithmetic.get(1);
                     break;
                 case "*":
                     arithmetic.get(2);
                     break;
                 case "/":
                     arithmetic.get(3);
                     break;
                 default:
                     break;
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
                   
            
               
            
             
               
         
               
        

 

        
    
    
   
   
    
   

