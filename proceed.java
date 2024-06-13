import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class proceed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class proceed extends Actor
{
    /**
     * Act - do whatever the proceed wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
        getWorld().setBackground(new GreenfootImage("SecondRoom.png"));
        getWorld().removeObjects(getWorld().getObjects(dress1.class));
        getWorld().removeObjects(getWorld().getObjects(dress2.class));
        getWorld().removeObjects(getWorld().getObjects(dress3.class));
        getWorld().removeObjects(getWorld().getObjects(dress4.class));
        getWorld().removeObjects(getWorld().getObjects(proceed.class));
    }
}
}