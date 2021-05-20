import javax.swing.JPanel;
import java.awt.event.*;

import javax.net.ssl.TrustManager;
import javax.swing.*;
import java.util.Random;
import java.awt.*;

public class GamePanel extends JPanel implements ActionListener
{

    //instance variables
    static final int screenWidth = 600;
    static final int screenHeight = 600;
    static final int unitSize = 25;
    static final int units = (screenWidth *screenHeight)/unitSize;
    static final int delay = 75;


    //x and y coordinates of the snake
    final int x[] = new int[units];
    final int y[] = new int[units];
    
    //inital body count
    int bodyParts = 4;

    int apples;

    //x and y coordinate of apple
    int appleX;
    int appleY;

    //initial direction
    char direction = 'R';
    boolean run = false;


    Timer timer;
    Random random;



    //constructor
    GamePanel()
    {
        random = new Random();
        this.setPreferredSize(new Dimension(screenWidth,screenHeight));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new myKeyAdapter());
        startGame();
    }
    //methods
    public void startGame()
    {

    }
    public void paintComponent(Graphics g)
    {

    }
    public void draw (Graphics g)
    {

    }
    public void newApple()
    {
        newApple();
        
    }
    public void checkApple()
    {

    }
    public void checkCollisions()
    {

    }
    public void gameOver(Graphics g)
    {

    }
    public void actionPerformed(ActionEvent e)
    {

    }
    public class myKeyAdapter extends KeyAdapter
    {
        public void keyPressed(KeyEvent e)
        {

        }
    }
}