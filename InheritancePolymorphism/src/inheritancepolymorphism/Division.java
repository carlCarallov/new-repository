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
public class Division implements Arithmetic {

    public double x;
    public double y;
double z;
    Division(double x, double y){
        this.x = x;
        this.y = y;
    }
    
 
    @Override
    public double calc() {
        if(x==0 || y == 0){
            throw new RuntimeException(" Эта программа не делит на ноль! ");
        }
        else{
        z = x/y;
        System.out.println(x+" / "+y+" = "+z);
        return x/y;
        }
    }
    
}
