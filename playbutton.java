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
        dress1 dress1 = new dress1();
        getWorld().addObject(dress1, 501, 0);
        //getWorld().addObject(dress1, 501, 85);
        dress2 dress2 = new dress2();
        getWorld().addObject(dress2, 489, 0);
        dress3 dress3 = new dress3();
        getWorld().addObject(dress3, 93, 0);
        dress4 dress4 = new dress4();
        getWorld().addObject(dress4, 95, 0);
        getWorld().removeObject(this);
    }
}

    }
