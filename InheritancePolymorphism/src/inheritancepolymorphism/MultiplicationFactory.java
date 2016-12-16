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
public class MultiplicationFactory implements ArithmeticFactory {
private double x;
        private double y;
        MultiplicationFactory(double x,  double y){
            this.x = x;
            this.y = y;
        }
       
    @Override
    public Arithmetic createArithmetic() {
       return new Multiplication(x,y);
    }
    
}
