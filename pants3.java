import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pants3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pants3 extends Actor
{
    /**
     * Act - do whatever the pants3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
          if (getY() <= 302){
               
           setLocation(getX(), getY()+3);
    }
}
}
