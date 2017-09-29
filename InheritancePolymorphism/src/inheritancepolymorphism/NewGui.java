/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepolymorphism;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.JTextArea;



public class NewGui  extends JFrame  {
   
   public StringBuffer n = new StringBuffer();
  public  static StringBuffer $num = new StringBuffer();
   public  static StringBuffer $num1 = new StringBuffer();
    public static  StringBuffer artm = new StringBuffer();
  public volatile boolean f = false;
  public volatile boolean sam = false;
 
  
    JTextArea label = new JTextArea(" ");
    JButton del = new JButton("DEL");
    JButton one = new JButton("1");
     JButton two = new JButton("2");
    JButton tree = new JButton("3");
    JButton thirthy = new JButton("4");
    JButton five = new JButton("5");
    JButton six = new JButton("6");
    JButton seven = new JButton("7");
    JButton eight = new JButton("8");
    JButton nine = new JButton("9");
    JButton zero = new JButton("0");
    JButton plus = new JButton("+");
    JButton minus = new JButton("-");
    JButton multipl = new JButton("*");
    JButton div = new JButton("/");
    JButton same = new JButton("=");
    JButton point = new JButton(".");

   
    NewGui() {
     
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
       JPanel panel = new JPanel();
      panel.setLayout(null);
      setSize(310,350);
      
      label.setSize(180,50);
      label.setLocation(35,40);
      label.setMargin(new Insets(21,5,10,10));
      panel.add(label);
      n.append(label.getText());
     
       del.setSize(45,35);
       del.setMargin(new Insets(0,0,0,0));
      del.setLocation(224,52);
      
      del.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent event){
            
            f = !f;
            
            
            label.setText(n.toString());
            
        }
    });
      
      panel.add(del);
      
      one.setSize(43,43);
      one.setLocation(30,100);
      
      one.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent event){
           if(artm.equals("")){
              $num.append(1);
           }
           else{
               $num1.append(1);
           }
            n.append(1);
            label.setText(n.toString());
            
        }
    });
      
      panel.add(one);
       
      two.setSize(43,43);
      two.setLocation(78,100);
      two.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent event){
          
              n.append(2);
              label.setText(n.toString());
          }
      });
      panel.add(two);
      
      tree.setSize(43,43);
      tree.setLocation(126,100);
      tree.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent event){
           
              n.append(3);
              label.setText(n.toString());
          }
      });
      panel.add(tree);
      
      thirthy.setSize(43,43);
      thirthy.setLocation(30,148);
        thirthy.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent event){
         
              n.append(4);
              label.setText(n.toString());
          }
      });
      panel.add(thirthy);
      
      five.setSize(43,43);
      five.setLocation(78,148);
       five.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent event){
          
              n.append(5);
              label.setText(n.toString());
          }
      });
      panel.add(five);
      
      six.setSize(43, 43);
      six.setLocation(126,148);
      six.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent event){
            
              n.append(6);
              label.setText(n.toString());
          }
      });
      panel.add(six);
      
      seven.setSize(43,43);
      seven.setLocation(30,196);
      seven.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent event){
          
             n.append(7);
              label.setText(n.toString());
          }
      });
      panel.add(seven);
      
      eight.setSize(43,43);
      eight.setLocation(78,196);
      eight.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent event){
            
              n.append(8);
              label.setText(n.toString());
          }
      });
      panel.add(eight);
      
      nine.setSize(43, 43);
      nine.setLocation(126,196);
      nine.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent event){
           
              n.append(9);
              label.setText(n.toString());
          }
      });
      panel.add(nine);
      
      zero.setSize(43,43);
      zero.setLocation(30,244);
      zero.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent event){
           
              n.append(0);
              label.setText(n.toString());
          }
      });
      panel.add(zero);
      
       point.setSize(43,43);
      point.setLocation(78,244);
      point.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent event){
             
              n.append(".");
              label.setText(n.toString());
          }
      });
      panel.add(point);
      
      plus.setSize(43,43);
      plus.setLocation(176,100);
      plus.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent event){
              n.append("+");
              label.setText(n.toString());
          }
      });
      panel.add(plus);
      
      minus.setSize(43,43);
      minus.setLocation(224,100);
      minus.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent event){
              if(artm.equals("")){
                  artm.append("+");
              }
             n.append("-");
              label.setText(n.toString());
          }
      });
      panel.add(minus);
      
      multipl.setSize(43, 43);
      multipl.setLocation(176,148);
      multipl.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent event){
            
              n.append("*");
              label.setText(n.toString());
          }
      });
      panel.add(multipl);
      
      div.setSize(43,43);
      div.setLocation(224,148);
      div.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent event){
             
              n.append("/");
              label.setText(n.toString());
          }
      });
      panel.add(div);
      
      same.setSize(43,43);
      same.setLocation(176,196);
      same.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent event){
             FirstListener list = new FirstListener();
             list.setStrX($num);
             list.setStrY($num1);
             list.setStrC(artm);
            
              n.append("="+" ");
              label.setText(n.toString());
               sam = !sam;
          }
      });
      panel.add(same);
      
      
        getContentPane().add(panel);
        
        
        
        
    }

   
    
}
