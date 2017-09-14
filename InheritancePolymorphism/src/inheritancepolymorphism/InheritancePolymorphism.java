/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepolymorphism;






import java.util.Scanner;
import javax.swing.JFrame;
import java.lang.Integer;
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
        StringBuilder t = new StringBuilder();
        StringBuilder u = new StringBuilder();
         
       for(int i = 0;i<num.$i1;i++){
            switch (num.arr[i][0][0]) {
                case '+':
                    p = "+";
                    if(num.$i2>0 && num.$i3 == 0){
                       
                        for( int $t = 0;$t<num.$i2;$t++){
                             t.insert($t,num.arr[i][$t][0]);
                        }
                    }
                    else if(num.$i3>0){
                        for(int $t=0;$t<num.$i2;$t++){
                            for(int $t2 = 0;$t<num.$i3;$t2++){
                                 u.insert($t2,num.arr[i][$t][$t2]);
                            }
                        }
                    }
                    break;
                case '-':
                    p="-";
                    break;
                case '*':
                    p="*";
                    break;
                case '/':
                    p="/";
                    break;
                default:
                    break;
            }
            
        }
             
      
      
        
         System.out.println("Формат ввода операций - \"x + y\"");
 Scanner name = new Scanner(System.in); 
   

 
      
       
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
   
 
             
            
               
            
             
               
         
               
        

 

        
    
    
   
   
    
   

