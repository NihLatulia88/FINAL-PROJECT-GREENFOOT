import greenfoot.*; 
import java.awt.Color; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bundaran here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bundaran extends Actor
{
    public int jeda=5;
    public void addToWorld(World latar)
    {
        GreenfootImage image=new GreenfootImage(100,100);
        image.setColor(new Color(255,255,0,100));
        image.fillOval(0,0,image.getWidth()-1,image.getHeight()-1);
        image.fillOval(20,20,image.getWidth()-41,image.getHeight()-41);
        setImage(image);
        jeda=5;
        
        
    }
        public void act() 
    {
        if (jeda>0) jeda--;
        else getWorld().removeObject(this);
    }    
}
