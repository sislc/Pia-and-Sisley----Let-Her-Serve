import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        playbutton playbutton = new playbutton();
        addObject(playbutton,389,242);
        girlmodel girlmodel = new girlmodel();
        addObject(girlmodel,113,213);
        title title = new title();
        addObject(title,391,98);
        
    }
    public void changeWorld(){
        if (Greenfoot.mouseClicked(playbutton.class)) {
        nudemodel nudemodel = new nudemodel();
        addObject(nudemodel, 0, 217);
        dress1 dress1 = new dress1();
        addObject(dress1, 501, 0);
        //getWorld().addObject(dress1, 501, 85);
        dress2 dress2 = new dress2();
        addObject(dress2, 489, 0);
        dress3 dress3 = new dress3();
        addObject(dress3, 93, 0);
        dress4 dress4 = new dress4();
        addObject(dress4, 95, 0);
    }
    }
    
    }
