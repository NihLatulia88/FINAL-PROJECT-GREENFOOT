import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pesawat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pesawat extends Actor
{
    private int vx=0;
    private boolean toRemove=false;
   public pesawat()
   {
       
    }
    
    public pesawat(int v)
    {
     vx=v;   
    }
    
    public void addedToWorld(World latar)
    {
        setRotation(180);
    }
    
    public void move()
    {
        setLocation(getX()+vx,getY());
        Actor actor = getOneIntersectingObject(roket.class);
        if(actor!=null){
            ((roket)actor).hancur();
            hancur();
        }
        if(getX()<-200)toRemove=true;
    }
    
    public void hancur()
    {
        for(int i=0; i<10; i++){
            int px=-20+Greenfoot.getRandomNumber(40);
            int py=-20+Greenfoot.getRandomNumber(40);
           getWorld().addObject(new pecahan(getImage()),getX()+px,getY()+py);
        }
        getWorld().addObject(new bundaran(),getX(),getY());
        toRemove=true;
    }
    
    public void act() 
    {
        if (isTouching(laser.class)){
            
            latar.Score.add(5);
        }
        if(!toRemove) move();
       else getWorld().removeObject(this);
    }    
}
