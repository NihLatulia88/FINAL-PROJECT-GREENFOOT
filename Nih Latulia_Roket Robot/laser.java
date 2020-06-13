import greenfoot.*; 
import java.awt.Color; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class laser here.
 * 
 * @author (nurul fatimah) 
 * @version (a version number or a date)
 */
public class laser extends Actor
{
    private boolean toRemove=false;
    private int vx=3;
    public void addedToWorld(World laser)
    {
        GreenfootImage image = new GreenfootImage(50,10);
        image.setColor(Color.YELLOW);
        image.drawLine(0,5,image.getWidth()-1,5);
        setImage(image);
    }
    
    public void act() 
    {
        if(!toRemove){
            setLocation(getX()+vx,getY());
            Actor actor=getOneIntersectingObject(pesawat.class);
            if(actor!=null){
                ((pesawat)actor).hancur();
            }
            if(getX()>getWorld().getWidth()+200)toRemove=true;
        }else{
            getWorld().removeObject(this);
        }
    }    
}
