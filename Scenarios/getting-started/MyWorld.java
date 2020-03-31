import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    private Ball _ball;
    private Board _board;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        _ball = new Ball();
        _ball.getImage().scale(25, 25);
        this.addObject(_ball, 100, 100);

        _board = new Board();
        _board.getImage().scale(100, 20);
        int posBoardX = (getWidth() / 2) - (_board.getImage().getWidth() / 2);
        int posBoardY = getHeight() - _board.getImage().getHeight() - 10;
        this.addObject(_board, posBoardX, posBoardY);

    }

    public void act() {

        MouseInfo mouseInfo = Greenfoot.getMouseInfo();
        if(mouseInfo != null) {
            int posBoardX = mouseInfo.getX() + (_board.getImage().getWidth() / 2);
            int posBoardY = _board.getY();

            _board.setLocation(posBoardX, posBoardY);
        }
    }
}
