import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pants1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pants1 extends Actor
{
    /**
     * Act - do whatever the pants1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (getY() <= 85){
               
           setLocation(getX(), getY()+3);
    }
    proceed3 proceed3 = new proceed3();
        dress1pants1 dress1pants1 = new dress1pants1();
        if (Greenfoot.mouseClicked(this) && outfit1){
            getWorld().addObject(dress1pants1, 310,217);
            getWorld().removeObjects(getWorld().getObjects(nudemodel.class));
            getWorld().addObject(proceed3, 562,359);
        }
        if (!getWorld().getObjectsAt(310, 217, null).isEmpty() && Greenfoot.mouseClicked(this))
        {   
            getWorld().removeObjects(getWorld().getObjects(nudemodel.class));
            getWorld().removeObjects(getWorld().getObjects(dress1pants1.class));
            getWorld().removeObjects(getWorld().getObjects(dress1pants2.class));
            getWorld().removeObjects(getWorld().getObjects(dress1pants3.class));
            getWorld().removeObjects(getWorld().getObjects(dress1pants4.class));
             getWorld().removeObjects(getWorld().getObjects(dress2pants1.class));
            getWorld().removeObjects(getWorld().getObjects(dress2pants2.class));
            getWorld().removeObjects(getWorld().getObjects(dress2pants3.class));
            getWorld().removeObjects(getWorld().getObjects(dress2pants4.class));
            getWorld().addObject(dress1pants1, 310,217);
        }  
}
}
