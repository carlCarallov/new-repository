/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepolymorphism;





public class FirstListener extends Thread {
    private String x;
    private String y;
    private String c;
 
  
    public void setStrX(StringBuffer x){
        this.x = x.toString();
    }
     public void setStrY(StringBuffer y){
         this.y = y.toString();
     }
     public void setStrC(StringBuffer c){
         this.c = c.toString();
     }
     
     
     
     public  double getStrX(){
         double $x = Integer.parseInt(this.x);
         return $x;
     }
      public double getStrY(){
         double $y = Integer.parseInt(this.y);
         return $y;
     }
       public String getStrC(){
        return this.c;
     }
    
}
