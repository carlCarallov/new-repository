/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepolymorphism;




import java.util.Scanner;
//import java.util.regex.Pattern;
//import java.util.regex.Matcher;
import java.util.logging.Level;
import java.util.logging.Logger;


public class InheritancePolymorphism {

    static double x;
    static double y;
   
  
 // public static String n;
  
    public static void main(String[] args) throws Exception {
        
  
      
      
       
      
       
       
   
        
       System.out.println("Выберите тип операции +-*/");
       
       
     
  Scanner input = new Scanner(System.in);
 String p = input.next();
      x = input.nextDouble();
                        y = input.nextDouble();
   /* Pattern pattern = Pattern.compile("\\W[0-9]*");
    Matcher matcher = pattern.matcher(input);
       if (matcher.find()){
          n = matcher.group();
          System.out.println(n);
       }
       if (matcher.find()){
        String a = matcher.group();  
           x = Integer.parseInt(a);
       }*/
        
            
              switch (p){
                    case "^":
                        Quadra q = new Quadra();
                        
 
      
                       System.out.println("x*x="+q.calc(x));
                        break;
                    case "+":
                        Addition a = new Addition();
                      
                        System.out.println("x+y="+a.calc(x,y));
                        break;
                    case "-":
                         Subtraction s = new Subtraction();
                         
                       
                        System.out.println("x-y="+s.calc(x,y));
                        break;
                    case "*":
                        Multiplication m = new Multiplication();
                       
                        System.out.println("x*y="+m.calc(x,y));
                        break;
                    case "/":
                        Division d = new Division();
                       
                        System.out.println("x/y="+d.calc(x,y));
                        break;
                    default:
                        break;
                }    
            
               
            
             
               
         
               
        }

 

        
    
    }
    //Главный абстрактный класс 
    abstract class Arithmetic {
        
    
     
        
       
        
      
        
       
       abstract double calc();//Абстрактный метод

    }
 
    /*Класс потомок с реализацией абстрактного метода calc, 
    выполняет сложение переменных x and y. То же самое выполняют последующие 
    дочерние классы Substraction, Multiplication, Division 
    класса Arithmetic.*/
 class Addition extends Arithmetic{

     
        
    

        

        

        

    @Override
    public String toString() {return "сложение";}
    
     
   double calc(double x, double y){
       
       
        return (x+y);
    
   
    }
    
    
     
       

       
  
    @Override
        double calc() {
             
    
   
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

       

        
    }
     
    class Subtraction extends Arithmetic {
       
        
        

          
        @Override
        public String toString(){return "вычитание";}
        
       
       
          double calc(double x , double y){
             
         
            
              
            return (x-y);
              
              
        }

          
       
        @Override
        double calc() {
     
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
  class Multiplication extends Arithmetic {
        
        
         

       
         @Override
         public String toString(){return "Умножение";}
         
        
        double calc(double x , double y){
         
       
   
        return (x*y);
    
 
         }

  
         @Override
        double calc() {
      
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
  class Division extends Arithmetic {
    
        

     

        
        @Override
        public String toString(){return "Деление";}
        
     
        double calc(double x , double y)  {
            
          
   
        return (x/y);

            
        }
        
        
        @Override
   double calc(){
   
       throw new UnsupportedOperationException("Not supported yet.");
   }
   
       
  }
    class Quadra extends Arithmetic {
        
     
      @Override
      public String toString(){return "Возведение в степень";}
      
     
      double calc(double x ) {
         
     
          
        return (x*x);
    
  
      }

       
     
      @Override
        double calc() {
         
 
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

       
    }
    
   
   
    
   

