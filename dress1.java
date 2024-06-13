import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dress1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dress1 extends Actor
{
    /**
     * Act - do whatever the dress1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
           if (getY() <= 85){
               
           setLocation(getX(), getY()+3);
        }
        
        outfit1 outfit1 = new outfit1();
        proceed proceed = new proceed();
        if (Greenfoot.mouseClicked(this)){
            getWorld().addObject(outfit1, 310,217);
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
            getWorld().addObject(outfit1, 310,217);
        }   
       }
    }

