/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepolymorphism;





import java.util.Scanner;
//import java.util.regex.Pattern;
//import java.util.regex.Matcher;





public class InheritancePolymorphism {
public static double x;
public static double y;
public static String p;
   



  
   
  
 // public static String n;
  
    public static void main(String[] args) throws Exception {
         System.out.println("Вводите операцию в обратной польской нотации \"- x y\"");
 Scanner name = new Scanner(System.in); 
   
Pars par = new Pars();
par.number(p);

        //фабрика 
        p = name.next();x = name.nextDouble();y = name.nextDouble();
         
       ArithmeticFactory  arithmetic = getNameArithmetic(p,x,y);
         
     Arithmetic a = arithmetic.createArithmetic();
     a.calc();
     
     
        
 }

    private static ArithmeticFactory getNameArithmetic(String arithmetic, double x, double y) {
    switch (arithmetic) {
        case "+":
            return new AdditionFactory(x,y);
        case "-":
            return new SubtractionFactory(x,y);
        case "*":
            return new MultiplicationFactory(x,y);
        case "/":
            return new DivisionFactory(x,y);
        default:
            break;
    }
     throw new RuntimeException(" Не поддерживаемый тип операции. "+arithmetic);
    }
}
   

             
            
               
            
             
               
         
               
        

 

        
    
    
   
   
    
   

