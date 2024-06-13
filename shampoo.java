import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class shampoo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class shampoo extends Actor
{
    /**
     * Act - do whatever the shampoo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mousePressed(this)){
            Greenfoot.playSound("bubbles.wav");
        }
       
}
}
