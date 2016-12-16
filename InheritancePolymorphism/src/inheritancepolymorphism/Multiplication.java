/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepolymorphism;



/**
 *
 * @author admin
 */
public class Multiplication implements Arithmetic{

     double x;
     double y;
     double z;
   Multiplication(double x, double y){
       this.x = x;
       this.y = y;
   }
    
    @Override
    public double calc() {
        z = x*y;
        System.out.println("x*y"+z);
        return x*y;
    }
    
}
