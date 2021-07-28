/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncing;

/**
 *
 * @author Noahs
 */
public class BouncingBall {
   public int bouncingBall(double h, double bounce, double window){
       int count = 1;
    
          
       if(h <= 0 || bounce <= 0 || bounce >= 1 || window >= h) {
            return -1;
       }
     if(h*bounce <=window){
            return 1;
         }
       while (true) {
         
            if (h >= window) {
                 count++;
            }
            else{
                 break;
            }
            h = h * bounce;
            if (h >= window) {
                 count++;
            }
    }
return count-1 ;}}
