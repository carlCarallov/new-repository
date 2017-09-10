/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepolymorphism;






import java.util.Scanner;
import javax.swing.JFrame;

//import java.util.regex.Pattern;
//import java.util.regex.Matcher;





public class InheritancePolymorphism  {
    
public static double x;
public static double y;
public static String p;

private static JFrame new_window = new NewGui();
private static NewGui num = new NewGui();
   public static void main(String[] args) throws Exception {
        
        new_window.setVisible(true);
        
        
       int er = (int) num.a;
       System.out.println(er);
        
         System.out.println("Формат ввода операций - \"x + y\"");
 Scanner name = new Scanner(System.in); 
   

 
      
        String t = name.next();p = name.next();String u = name.next();
        x = Integer.parseInt(t);
        y = Integer.parseInt(u);
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
     throw new RuntimeException(" Не поддерживаемый тип операции, или ошибка ввода. "+arithmetic);
    }
    
    
}
   
 
             
            
               
            
             
               
         
               
        

 

        
    
    
   
   
    
   

