import greenfoot.*;
/**
 * Write a description of class HasPowers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayGameState implements IBlackPantherState 
{
   public TChalla tchalla;

    public PlayGameState(TChalla tchalla)
    {
        this.tchalla = tchalla;
    }

    public  boolean isAlive()
    {
        return true;
    }
    
    public boolean isDead()
    {
        return false;
    }
    
     
    public void setState()
    {
        //brave.setState(brave.getBraveDeadState());
    }
    
    public void display()
    {
    	//System.out.println("Win Score acheived - Win and End Game");
    	//Greenfoot.setWorld(new Restartmenu());
        //tchalla.getWorld().addObject(new GameOverScreen("GameOver.png"),500,300);
    }
}
