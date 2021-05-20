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
        System.out.println("is paint being called?");
        super.paintComponent(g);
        draw(g);
    }
    public void draw (Graphics g)
    {
        for(int i = 0; i< screenHeight/unitSize;i++)
        {
            g.drawLine(i*unitSize,0,i*unitSize,screenHeight);
            g.drawLine(0, i*unitSize,screenWidth, i*unitSize);
        }
        g.setColor(Color.red);
        g.fillOval(appleX, appleY,unitSize,unitSize);
    }
    public void newApple()
    {
        appleX = random.nextInt(screenWidth/unitSize) * unitSize;
        appleY = random.nextInt(screenHeight/unitSize) * unitSize;
        
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