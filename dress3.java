import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dress3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dress3 extends Actor
{
    /**
     * Act - do whatever the dress3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
           if (getY() <= 85){
               
           setLocation(getX(), getY()+3);
        }
        proceed proceed = new proceed();
        outfit3 outfit3 = new outfit3();
        if (Greenfoot.mouseClicked(this)){
            getWorld().addObject(outfit3, 310,217);
            getWorld().removeObjects(getWorld().getObjects(nudemodel.class));
            getWorld().addObject(proceed, 562,359);
        }
        if (!getWorld().getObjectsAt(310, 217, null).isEmpty() && Greenfoot.mouseClicked(this))
        {   
            getWorld().removeObjects(getWorld().getObjects(nudemodel.class));
            getWorld().removeObjects(getWorld().getObjects(outfit1.class));
            getWorld().removeObjects(getWorld().getObjects(outfit2.class));
            getWorld().removeObjects(getWorld().getObjects(outfit3.class));
            getWorld().removeObjects(getWorld().getObjects(outfit4.class));
            getWorld().addObject(outfit3, 310,217);
        }  
    }
}

