import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dress4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dress4 extends Actor
{
    /**
     * Act - do whatever the dress4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
           if (getY() <= 302){
               
           setLocation(getX(), getY()+3);
        }
        outfit4 outfit4 = new outfit4();
        proceed proceed = new proceed();
        if (Greenfoot.mouseClicked(this)){
            getWorld().addObject(outfit4, 310,217);
            getWorld().removeObjects(getWorld().getObjects(nudemodel.class));
            getWorld().addObject(proceed, 562,359);
        }
       // if (!getWorld().getObjectsAt(547, 351, null).isEmpty() && Greenfoot.mouseClicked(this)){
              //  getWorld().addObject(proceed, 528,352);
       // }
        if (!getWorld().getObjectsAt(310, 217, null).isEmpty() && Greenfoot.mouseClicked(this))
        {   
            getWorld().removeObjects(getWorld().getObjects(nudemodel.class));
            getWorld().removeObjects(getWorld().getObjects(outfit1.class));
            getWorld().removeObjects(getWorld().getObjects(outfit2.class));
            getWorld().removeObjects(getWorld().getObjects(outfit3.class));
            getWorld().removeObjects(getWorld().getObjects(outfit4.class));
            getWorld().addObject(outfit4, 310,217);
        }  
    }
}
