import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dress1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dress1 extends Actor
{
    //int speed = 0;
    /**
     * Act - do whatever the dress1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //move(speed);
        nudemodel nudemodel = new nudemodel();
       if (nudemodel.getX() == 310 && nudemodel.getY() == 217){
           setLocation(getX(), getY() - 5);
           
       }
    }
}
