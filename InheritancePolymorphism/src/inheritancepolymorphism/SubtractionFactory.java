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
public class SubtractionFactory implements ArithmeticFactory {
    private double x;
    private double y;
   public void setX(double x){
       this.x = x;
   }
   public double getX(){
       return x;
   }
   public void setY(double y){
       this.y = y;
   }
       
 
    @Override
    public Arithmetic createArithmetic() {
        return new Subtraction(x,y);
    }
    
}
