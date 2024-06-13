import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nudemodel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nudemodel extends Actor
{
    int speed = 5;
    /**
     * Act - do whatever the nudemodel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(speed);
        if(getX() >= 310 && getY() == 217){
            speed = 0;
        }
    }
}
