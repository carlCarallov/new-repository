/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepolymorphism;
import java.util.Scanner;

public class Pars {
    private double x;
    private double y;
   
    
     Scanner num = new Scanner(System.in);
    
  
  public void  number(String p){
      
      
     this.x = num.nextDouble();
      this.y = num.nextDouble();
      switch(p){
          case"+":
          AdditionFactory af = new AdditionFactory();
          af.setX(x);af.setY(y);
          break;
       case "-":
       SubtractionFactory sf = new SubtractionFactory();
       sf.setX(x);sf.setY(y);
       break;
       case"*":
       MultiplicationFactory mf = new MultiplicationFactory();
       mf.setX(x);mf.setY(y);
       break;
       case"/":
       DivisionFactory df = new DivisionFactory();
       df.setX(x);df.setY(y);
       break;
      default:
          break;
      }
  }
}
