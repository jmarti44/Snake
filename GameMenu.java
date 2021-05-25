import javax.swing.JPanel;
import java.awt.event.*;

import javax.swing.*;
import java.util.Random;
import java.awt.*;

public class GameMenu extends JPanel implements ActionListener
{


    static final int screenWidth = 600;
    static final int screenHeight = 600;

    GameMenu()
    {
        this.setPreferredSize(new Dimension(screenWidth,screenHeight));
        this.setBackground(Color.black);
        this.setFocusable(true);
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g)
    {
        //Menu heading
        Font title = new Font("arial",Font.BOLD,50);
        g.setFont(title);
        g.setColor(Color.green);
        g.drawString("Snake Game", GamePanel.screenWidth/4,100);

        //Setting heading
        Font settings = new Font("arial",Font.BOLD,25);
        g.setFont(settings);
        g.setColor(Color.white);
        g.drawString("Pre-settings",GamePanel.screenWidth/3,200);


        //Border selection 
        JRadioButton gameOver = new JRadioButton("Game Over");
       

        JRadioButton bounce = new JRadioButton("Bounce back in the opposite direction");
        JRadioButton opposite = new JRadioButton("Enter from the opposite side");
        /**
        ButtonGroup borderGroup = new ButtonGroup();

        borderGroup.add(gameOver);
        borderGroup.add(bounce);
        borderGroup.add(opposite);
        
        this.add(gameOver);
        this.add(bounce);
        this.add(opposite);
        */
    }

    public void actionPerformed(ActionEvent e)
    {
        //System.out.println("am i being called");
       
    }
}
