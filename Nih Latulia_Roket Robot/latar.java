import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class latar here.
 * 
 * @author (nurul fatimah) 
 * @version (a version number or a date)
 */
public class latar extends World
{
    private int jeda=0;
    static Counter Score = new Counter("Score:");
        
    public latar()
    {    
        super(800, 600, 1,false);
        addObject (new roket(),100,200);
        prepare();
    }
    
    
    public void act()
    {
        if (jeda>0)jeda--;
        else jeda=20;
        if(jeda==1){
            int py=Greenfoot.getRandomNumber(getHeight());
            addObject(new pesawat(-(2+Greenfoot.getRandomNumber(3))),getWidth()+200,py);
        }
    }
    
    private void prepare()
    {
         back back = new back();
        addObject(back,140,652);
        back.setLocation(128,648);
        Counter counter = new Counter();
        addObject(counter,108,55);
        //counter
        Score.setValue(0);
        addObject(Score,90,52);
        counter.setLocation(256,78);
        removeObject(counter);
        
    
}


    }


