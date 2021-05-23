import javax.swing.JPanel;
import java.awt.event.*;

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
        System.out.println("hello?");
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
        newApple();
        run = true;
        timer = new Timer(delay,this);
        timer.start();
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        draw(g);
    }
    public void move()
    {
        for (int i = bodyParts; i>0;i--)
        {
            x[i] = x[i-1];
            y[i] = y[i-1];
        }
        switch(direction)
        {
            case 'U':
                y[0] = y[0] - unitSize;
                break;
            case 'D':
                y[0] = y[0] + unitSize;
                break;
            case 'L':
                x[0] = x[0] - unitSize;
                break;
            case 'R':
                x[0] = x[0] + unitSize;
                break;

        }
    }
    public void draw (Graphics g)
    {
      
        g.setColor(Color.red);
        g.fillOval(appleX, appleY,unitSize,unitSize);
        //drawing head and body of the snake
        for (int i =0; i<bodyParts;i++)
        {
            //head of the snake
            if (i == 0)
            {
                g.setColor(Color.green);
                g.fillRect(x[i], y[i], unitSize, unitSize);
            }
            //body of the snake
            else
            {
                g.setColor(new Color(45,180,0));
                g.fillRect(x[i], y[i], unitSize, unitSize);

            }
        }
    }
    public void newApple()
    {
        //generating a random x and y coordinate for the apple
        appleX = random.nextInt(screenWidth/unitSize) * unitSize;
        appleY = random.nextInt(screenHeight/unitSize) * unitSize;
        
    }
    public void checkApple()
    {

    }
    public void checkCollisions()
    {
        for (int i = bodyParts; i>0; i--)
        {
            
            //head collides with the body
            if (x[0] == x[i] && y[0] == y[i])
            {
                run = false;    //gameOver
            }
            //head makes contact with left border
            if (x[0] <0)
            {
                run = false;
            }
            //head makes contact with right border 
            if (x[0]>screenWidth)
            {
                run = false;
            }
            //head touches top border 
            if (y[0]<0)
            {
                run = false;
            }
            //head touches bottom border
            if (y[0]>screenHeight)
            {
                run = false;
            }
            if (run == false)
                timer.stop();
            
        
        }
    }
    public void gameOver(Graphics g)
    {

    }
    public void actionPerformed(ActionEvent e)
    {
        //System.out.println("am i being called");
        if (run)
        {
            move();
            checkApple();
            checkCollisions();

        }
       repaint();
    }
    public class myKeyAdapter extends KeyAdapter
    {
        public void keyPressed(KeyEvent e)
        {
            //implementing snake control
            switch (e.getKeyCode())
            {
                case KeyEvent.VK_LEFT:
                    if (direction!= 'R')
                    {
                        direction = 'L';
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if (direction != 'L')
                    {
                        direction = 'R';
                    }
                    break;
                case KeyEvent.VK_UP:
                    if (direction != 'D')
                    {
                        direction = 'U';
                    }
                case KeyEvent.VK_DOWN:
                    if (direction != 'U')
                    {
                        direction = 'D';
                    }
                    break;
            }
        }
    }
}