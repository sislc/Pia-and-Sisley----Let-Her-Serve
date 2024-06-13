import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pants4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pants4 extends Actor
{
    /**
     * Act - do whatever the pants4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
          if (getY() <= 85){
               
           setLocation(getX(), getY()+3);
    }
}
}
