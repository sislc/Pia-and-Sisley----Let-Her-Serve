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
     pants1 pants1= new pants1();
        getWorld().addObject(pants1, 501, 0);
        //getWorld().addObject(dress1, 501, 85);
        pants2 pants2 = new pants2();
        getWorld().addObject(pants2, 489, 0);
        pants3 pants3 = new pants3();
        getWorld().addObject(pants3, 93, 0);
        pants4 pants4 = new pants4();
        getWorld().addObject(pants4, 95, 0);
       getWorld().removeObjects(getWorld().getObjects(dress1.class));
       getWorld().removeObjects(getWorld().getObjects(dress2.class));
       getWorld().removeObjects(getWorld().getObjects(dress3.class));
        getWorld().removeObjects(getWorld().getObjects(dress4.class));
        getWorld().removeObjects(getWorld().getObjects(proceed.class));
    }
}
}