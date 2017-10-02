/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepolymorphism;





public class FirstListener {
    private static String x1;
    private static String y1;
    private static String c;
 
  
    public void setStrX(StringBuffer x){
        this.x1 = x.toString();
    }
     public void setStrY(StringBuffer y){
         this.y1 = y.toString();
     }
     public void setStrC(StringBuffer c){
         this.c = c.toString();
     }
     
     
     
     public  double getStrX(){
         double $x = Integer.parseInt(this.x1);
         return $x;
     }
      public double getStrY(){
         double $y = Integer.parseInt(this.y1);
         return $y;
     }
       public String getStrC(){
        return this.c;
     }
    
}
