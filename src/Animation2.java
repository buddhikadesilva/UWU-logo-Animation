
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cst15008
 */
public class Animation2 extends Applet implements Runnable{

    public void init(){
    Thread t1=new Thread(this);
    t1.start();
    }
    
    int i;
    public void paint(Graphics g){
     g.setColor(Color.black);     
    g.fillOval(50+i, 20, 60, 60);
        
    //drawLogo(g,i);
    }
    
    
    
    @Override
    public void run() {
       for(i=0;i<1000;i+=5){
       
           repaint();
           try {
               Thread.sleep(100);
           } catch (InterruptedException ex) {
               Logger.getLogger(Animation.class.getName()).log(Level.SEVERE, null, ex);
           }
       
       }
    }
    
    public void drawLogo(Graphics g,int x){
   
  
        
    g.setColor(Color.black);     
    g.fillOval(50+x, 20, 60, 60);

        
    
   
    }
    
    
    
}
