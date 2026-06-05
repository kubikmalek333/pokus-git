import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snehulak here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snehulak extends Actor
{
    boolean zablokovanoHazeni = false;
    public void act()
    {
        MouseInfo mi = Greenfoot.getMouseInfo();
        if(mi != null){
            turnTowards(mi.getX(),mi.getY());
        }
        odblokuj();
    }
    public void odblokuj(){
        
    }
}
