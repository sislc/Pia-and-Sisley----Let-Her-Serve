import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class playbutton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class playbutton extends Actor
{
    /**
     * Act - do whatever the playbutton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        turn(3);
    if (Greenfoot.mouseClicked(this)) {
              getWorld().setBackground(new GreenfootImage("SecondRoom.png"));
        getWorld().removeObjects(getWorld().getObjects(girlmodel.class));
        getWorld().removeObjects(getWorld().getObjects(title.class));
        nudemodel nudemodel = new nudemodel();
        getWorld().addObject(nudemodel, 0, 217);
        //getWorld().addObject(nudemodel, 311, 222);
        shampoo shampoo = new shampoo();
        getWorld().addObject(shampoo, 85,295);
        shower shower = new shower();
        getWorld().addObject(shower, 186,293);
        hairdryer hairdryer = new hairdryer();
        getWorld().addObject(hairdryer, 491, 307);
        
        
        getWorld().removeObject(this);
    }
}

    }
