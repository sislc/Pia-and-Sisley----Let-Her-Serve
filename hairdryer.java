import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hairdryer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hairdryer extends Actor
{
    /**
     * Act - do whatever the hairdryer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        proceed2 proceed2 = new proceed2();
        if (Greenfoot.mousePressed(this)){
        getWorld().addObject(proceed2, 563, 358);

    }
      if (Greenfoot.mousePressed(this)){
            Greenfoot.playSound("hair dryer.wav");
        }
    }
}
