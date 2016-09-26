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
    static double p;
    static double l;
  public static String n;
  
    public static void main(String[] args) throws Exception {
        
  
      
      
       
      
       
       
   
        
       System.out.println("Выберите тип операции +-*/");
       
       
     
   Scanner input = new Scanner(System.in);
        n = input.next(); 
        if(n.equals("^")){//ВВод операции в формате "(+-*\^) х у"
       x = input.nextDouble();
        }
        else{
       x = input.nextDouble();
       y = input.nextDouble();
        }
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
        
            
                switch (n){
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
    
       double x;
       double y;
       double p;
       double l;
       abstract double calc(); //Абстрактный метод

    }
 
    /*Класс потомок с реализацией абстрактного метода calc, 
    выполняет сложение переменных x and y. То же самое выполняют последующие 
    дочерние классы Substraction, Multiplication, Division 
    класса Arithmetic.*/
 class Addition extends Arithmetic{

    
        
    

        Addition() {
            super.x = x;
            super.y = y;
            super.p = p;
            super.l = l;
            
        }

        

        

    @Override
    public String toString() {return "сложение";}
    
        
    double calc(double x, double y){
    
        return (x+y);
    }
    double calc(double x, double y, double p){
        return (x+y+p);
    }
    double calc(double x, double y, double p, double l){
        return (x+y+p+l);
    }
     
       

        @Override
        double calc() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

       

        
    }
     
    class Subtraction extends Arithmetic {
       
        
        

          Subtraction() {
         super.x = x;
         super.y = y;
        }
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
        
        
         

        Multiplication() {
            super.x = x;
            super.y = y;
        }
         @Override
         public String toString(){return "Умножение";}
         
         
        double calc(double x , double y){
             return(x*y);
         }

        @Override
        double calc() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
  class Division extends Arithmetic {
    
        
       

       Division() {
           super.y = y;
           super.x = x;
        }

        
        @Override
        public String toString(){return "Деление";}
        
        
        double calc(double x , double y)  {
            
            return (x/y);
        }

   
       @Override
    double calc() {
      if (x <= 0)  try {
          throw new Exception("На ноль делить нельзя"); //To change body of generated methods, choose Tools | Templates.
      } catch (Exception ex) {
          Logger.getLogger(Division.class.getName()).log(Level.SEVERE, null, ex);
      
    }
      return x;
   }   
  }
    class Quadra extends Arithmetic {
        
     Quadra() {
            super.x = x;
            
        }
      @Override
      public String toString(){return "Возведение в степень";}
      double calc(double x) {
          
          return (x*x);
      }

       
     @Override
        double calc() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

       
    }
    
   
   
    
   

