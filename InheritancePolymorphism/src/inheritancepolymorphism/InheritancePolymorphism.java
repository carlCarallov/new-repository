/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepolymorphism;







import static inheritancepolymorphism.InheritancePolymorphism.$list;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;






public class InheritancePolymorphism  {
    
public static double x;
public static double y;
public static String p;


private static  NewGui num = new NewGui();
private static  JFrame new_window = new NewGui();
private static  FirstListener list = new FirstListener();

 public static FirstListener $list = new FirstListener();
 
   public static void main(String[] args) throws Exception {
       
      new_window.setVisible(true);
      
   
     
        
       
    
       
            
                do{
                    if(!(num.f)){
                        if(num.sam){
                             
                          
                           
                            ArithmeticFactory  arithmetic = getNameArithmetic($list.getStrC(),$list.getStrX(),$list.getStrY());
                             Arithmetic a = arithmetic.createArithmetic();
                             a.calc();
                            
                        }
                    }else {
                        return;
                    }
                    
                  
                    
                }while(true);
            
        
   
        
      
        
        
            
       
       
         
  
             
            
      
        
         

   

 
      
       
     
       
        
    
     
      
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
   
 
             
            
               
            
             
               
         
               
        

 

        
    
    
   
   
    
   

