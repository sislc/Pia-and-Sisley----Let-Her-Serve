import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class shower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class shower extends Actor
{
    /**
     * Act - do whatever the shower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
              if (Greenfoot.mouseDragged(this)){
        MouseInfo mouse = Greenfoot.getMouseInfo();
        setLocation(mouse.getX(), mouse.getY());
    }
         if (Greenfoot.mousePressed(this)){
            Greenfoot.playSound("shower.wav");
        }
   
}
}
